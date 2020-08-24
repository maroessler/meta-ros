# Copyright (c) 2019-2020 LG Electronics, Inc.

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://0001-use-python-provided-by-environment-instead-of-the-ge.patch \
    file://0002-allow-proper-cross-compilation-with-catkin.patch \
    file://0003-builder.py-don-t-prepend-ld_path-to-LD_LIBRARY_PATH.patch \
    file://environment.d-catkin.sh \
"

ROS_BUILD_DEPENDS_remove = "python-catkin-pkg"
ROS_BUILD_DEPENDS_remove = "python-empy"

ROS_BUILDTOOL_DEPENDS += " \
    python-catkin-pkg-native \
    python-empy-native \
"

EXTRA_OECMAKE_prepend = " \
    -DCATKIN_INSTALL_INTO_PREFIX_ROOT=ON \
"

CATKIN_PREFIX_ROOT_FILES = " \
    ${ros_prefix}/.catkin \
    ${ros_prefix}/.rosinstall \
    ${ros_prefix}/_setup_util.py \
    ${ros_prefix}/*.bash \
    ${ros_prefix}/*.zsh \
    ${ros_prefix}/*.sh \
"

FILES_${PN}_prepend = "${CATKIN_PREFIX_ROOT_FILES} "

SSTATE_SCAN_FILES_append = " _setup_util.py"
# Must do this to include CATKIN_PREFIX_ROOT_FILES. It might add "extra" files to what's staged, but who cares?
SYSROOT_DIRS_append = " ${ros_prefix}"

# XXX Why doesn't SSTATE_SCAN_FILES fix this up?
do_install_append_class-target() {
    sed -i -e 's@${RECIPE_SYSROOT}/@/@g' ${D}${ros_prefix}/_setup_util.py

    mkdir -p ${D}${sysconfdir}/profile.d
    echo ". ${ros_prefix}/setup.sh" > ${D}${sysconfdir}/profile.d/ros1.sh
}

# NB. COMPLEMENTARY_GLOB[ros-implicit-workspace] = "*-implicitworkspace"
PACKAGES =+ "${PN}-implicitworkspace"

FILES_${PN}-implicitworkspace = " \
    ${sysconfdir}/profile.d/ros1.sh \
"

# Used to disable exporting LD_LIBRARY_PATH when building with catkin
# because on builder with the same architecture as target MACHINE it
# will try to use incompatible libraries (e.g. libpython) from TARGET
# sysroot instead using the one from host (e.g. for native python)
export CATKIN_CROSSCOMPILING = "1"

# Append environment hook for SDK
do_install_append_class-nativesdk() {
    mkdir -p ${D}${SDKPATHNATIVE}/environment-setup.d

    script=${D}${SDKPATHNATIVE}/environment-setup.d/catkin-runtime.sh
    echo "export ROSDISTRO=${ROS_DISTRO}" >> $script
    echo "export PATH=\$PATH:\${OECORE_NATIVE_SYSROOT}/opt/ros/\${ROS_DISTRO}/bin" >> $script
    echo "export PYTHONPATH=\${OECORE_NATIVE_SYSROOT}/opt/ros/\${ROS_DISTRO}/lib/python2.7/site-packages" >> $script
    echo "export ROS_ROOT=\${OECORE_TARGET_SYSROOT}/opt/ros/\${ROS_DISTRO}/share/ros" >> $script
    echo "export CMAKE_PREFIX_PATH=\${OECORE_TARGET_SYSROOT}/opt/ros/\${ROS_DISTRO}:\${OECORE_NATIVE_SYSROOT}/opt/ros/${ROS_DISTRO}" >> $script

    install -m 644 ${WORKDIR}/environment.d-catkin.sh ${D}${SDKPATHNATIVE}/environment-setup.d/catkin.sh
}

FILES_${PN}_append_class-nativesdk = " ${SDKPATHNATIVE}"

catkin_sysroot_preprocess_append() {
    install -m 644 -t ${SYSROOT_DESTDIR}${ros_prefix} ${D}${ros_prefix}/.catkin
}

RDEPENDS_${PN}_class-nativesdk += "python-setuptools  python-six"

BBCLASSEXTEND += "native nativesdk"
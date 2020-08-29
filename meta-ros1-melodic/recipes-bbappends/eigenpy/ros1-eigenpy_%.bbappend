# Copyright (c) 2020 LG Electronics, Inc.

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://0001-CMakeLists.txt-search-for-boost_python37-instead-of-.patch"

# in thud it incorrectly detects python dependencies
inherit pythonnative
DEPENDS += "python-numpy-native"

do_configure_append() {
    # Fixes this:
    # eigenpy/1.6.9-1-r0/recipe-sysroot/usr/include/c++/8.2.0/cstdlib:75:15: fatal error: stdlib.h: No such file or directory
    sed -i 's/-isystem /-I/g' ${B}/build.ninja
}

do_install_append() {
    # Fix paths in .pc file
    # Libs: -L${libdir}  -leigenpy -L/jenkins/mjansa/build/ros/webos-melodic-thud/tmp-glibc/work/raspberrypi4-webos-linux-gnueabi/eigenpy/1.6.9-1-r0/recipe-sysroot/usr/lib -lboost_python37
    # Cflags:  -I${includedir} -I/jenkins/mjansa/build/ros/webos-melodic-thud/tmp-glibc/work/raspberrypi4-webos-linux-gnueabi/eigenpy/1.6.9-1-r0/recipe-sysroot/usr/include -I/jenkins/mjansa/build/ros/webos-melodic-thud/tmp-glibc/work/raspberrypi4-webos-linux-gnueabi/eigenpy/1.6.9-1-r0/recipe-sysroot/usr/include/python2.7 -I/jenkins/mjansa/build/ros/webos-melodic-thud/tmp-glibc/work/raspberrypi4-webos-linux-gnueabi/eigenpy/1.6.9-1-r0/recipe-sysroot-native/usr/lib/python2.7/site-packages/numpy/core/include
    # '' between $ and { is used to prevent pkg-config variables to be expanded by bitbake
    sed 's#-L${RECIPE_SYSROOT}${libdir} ##g; s#-I${RECIPE_SYSROOT}${includedir} ##g; s#-I${RECIPE_SYSROOT}${includedir}/python#-I$''{includedir}/python#g; s#-I${RECIPE_SYSROOT_NATIVE}${libdir}/python#-I$''{libdir}/python#g; s#-I${RECIPE_SYSROOT}${libdir}/python#-I''${libdir}/python#g' -i ${D}${ros_libdir}/pkgconfig/eigenpy.pc
    # Fix error during do_configure of ros1-moveit-ros-planning-interface
    sed -i 's#${ros_prefix}/lib/libeigenpy.so#${_IMPORT_PREFIX}/lib/libeigenpy.so#g' ${D}${ros_datadir}/eigenpy/cmake/eigenpyTargets-release.cmake
    sed -i 's#;${ros_prefix}/include##g' ${D}${ros_datadir}/eigenpy/cmake/eigenpyTargets.cmake
}

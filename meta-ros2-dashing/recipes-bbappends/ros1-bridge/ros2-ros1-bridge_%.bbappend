FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += "\
    file://0001-Add-ROS1-include-directories.patch \
"

MESSAGES_DEPENDS += "\
    ros1-roscpp \
    ros1-actionlib-msgs \
    ros1-diagnostic-msgs \
    ros1-roscpp-tutorials \
    ros1-gazebo-msgs \
    ros1-nav-msgs \
    ros1-shape-msgs \
    ros1-stereo-msgs \
    ros1-tf2-msgs \
    ros1-tf \
    ros1-visualization-msgs \
    ros2-lifecycle-msgs \
    ros2-composition-interfaces \
"

DEPENDS += "\
    ${MESSAGES_DEPENDS} \
    python3-pyyaml-native \
    ros1-genmsg \
    ros1-ros-comm \
    python-rospkg-native \
"

export ROS1_INCLUDE_PATH = "${RECIPE_SYSROOT}/opt/ros/melodic/include"
export ROS_PACKAGE_PATH = "${RECIPE_SYSROOT}/opt/ros/melodic/share"

export PKG_CONFIG_PATH = "${PKG_CONFIG_DIR}:${RECIPE_SYSROOT}/opt/ros/melodic/lib/pkgconfig"
export PYTHONPATH = "${STAGING_DIR_NATIVE}${PYTHON_SITEPACKAGES_DIR}:${STAGING_DIR_NATIVE}/usr/lib/python3.7/site-packages:${STAGING_DIR_NATIVE}/usr/lib/python2.7/site-packages:${STAGING_DIR_TARGET}/opt/ros/melodic/lib/python2.7/site-packages"

do_configure_append() {
    sed -i 's#/usr/lib/libboost_filesystem-mt.so #${RECIPE_SYSROOT}/usr/lib/libboost_filesystem-mt.so #g' ${B}/build.ninja
    sed -i 's#/usr/lib/liblog4cxx.so #${RECIPE_SYSROOT}/usr/lib/liblog4cxx.so #g' ${B}/build.ninja
    sed -i 's#/usr/lib/libboost_regex-mt.so #${RECIPE_SYSROOT}/usr/lib/libboost_regex-mt.so #g' ${B}/build.ninja
    sed -i 's#/usr/lib/libboost_system-mt.so #${RECIPE_SYSROOT}/usr/lib/libboost_system-mt.so #g' ${B}/build.ninja
    sed -i 's#/usr/lib/libboost_thread-mt.so #${RECIPE_SYSROOT}/usr/lib/libboost_thread-mt.so #g' ${B}/build.ninja
    sed -i 's#/usr/lib/libboost_chrono-mt.so #${RECIPE_SYSROOT}/usr/lib/libboost_chrono-mt.so #g' ${B}/build.ninja
    sed -i 's#/usr/lib/libboost_date_time-mt.so #${RECIPE_SYSROOT}/usr/lib/libboost_date_time-mt.so #g' ${B}/build.ninja
    sed -i 's#/usr/lib/libboost_atomic-mt.so #${RECIPE_SYSROOT}/usr/lib/libboost_atomic-mt.so #g' ${B}/build.ninja
    sed -i 's#/usr/lib/libconsole_bridge.so.0.4 #${RECIPE_SYSROOT}/usr/lib/libconsole_bridge.so.0.4 #g' ${B}/build.ninja
}
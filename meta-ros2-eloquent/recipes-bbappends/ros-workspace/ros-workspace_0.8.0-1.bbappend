# Copyright (c) 2019 LG Electronics, Inc.

ROS_BUILD_DEPENDS_remove = "ros2-ament-cmake-core"
ROS_BUILD_DEPENDS_remove = "ros2-ament-package"
ROS_BUILDTOOL_DEPENDS += " \
    ros2-ament-cmake-core-native \
    ros2-ament-package-native \
"

# The package find files from CMAKE_INSTALL_PREFIX that is just absolute "/usr".
# Need to pass the native sysroot folder path.
export STAGING_DIR_NATIVE
FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI_append = " file://0001-Don-t-use-CMAKE_INSTALL_PREFIX-as-sysroot-for-cross-.patch"

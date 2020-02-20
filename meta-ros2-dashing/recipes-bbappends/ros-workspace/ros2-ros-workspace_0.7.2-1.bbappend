# Copyright (c) 2019 LG Electronics, Inc.

ROS_BUILD_DEPENDS_remove = "ros2-ament-cmake-core"
ROS_BUILD_DEPENDS_remove = "ros2-ament-package"
ROS_BUILDTOOL_DEPENDS += " \
    ros2-ament-cmake-core-native \
    ros2-ament-package-native \
"

export STAGING_DIR_NATIVE
FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://0001-Fix-sysroot-for-crosscompiling.patch"

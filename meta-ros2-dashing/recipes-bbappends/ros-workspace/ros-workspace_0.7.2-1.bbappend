# Copyright (c) 2019 LG Electronics, Inc.

ROS_BUILD_DEPENDS_remove = "ament-cmake-core"
ROS_BUILD_DEPENDS_remove = "ament-package"
ROS_BUILDTOOL_DEPENDS += " \
    ament-cmake-core-native \
    ament-package-native \
"

export STAGING_DIR_NATIVE
FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://0001-Fix-sysroot-for-crosscompiling.patch"

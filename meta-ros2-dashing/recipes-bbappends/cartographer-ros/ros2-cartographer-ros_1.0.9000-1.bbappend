# Copyright (c) 2019 LG Electronics, Inc.

DEPENDS += "ros2-eigen3-cmake-module"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += " \
    file://cmake.dont.add.isystem.patch \
"
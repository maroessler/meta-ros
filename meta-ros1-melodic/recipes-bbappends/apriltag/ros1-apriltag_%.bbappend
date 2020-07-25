# Copyright (c) 2019 LG Electronics, Inc.

inherit ros_insane_dev_so

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += " \
    file://fix.cflags.in.pkg-config.patch \
"

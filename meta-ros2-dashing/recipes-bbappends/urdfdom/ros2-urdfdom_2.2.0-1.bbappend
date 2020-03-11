# Copyright (c) 2019 LG Electronics, Inc.

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

export STAGING_DIR_HOST
SRC_URI += "file://0001-Make-CMake-find-urdfdom-headers-header-files.patch"

do_configure_append() {
    # Fixes this:
    # | fatal error: stdlib.h: No such file or directory
    # |   #include_next <stdlib.h>
    sed -i 's/-isystem /-I/g' ${B}/build.ninja
}

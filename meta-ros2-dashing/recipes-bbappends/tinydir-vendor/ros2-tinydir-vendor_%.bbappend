# Copyright (c) 2019 LG Electronics, Inc.

ALLOW_EMPTY_${PN} = "1"

# Instead of fetching
# https://github.com/cxong/tinydir/archive/1.2.4.tar.gz
# during do_compile
FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://0001-CMakeLists.txt-fetch-tinydir-with-bitbake-fetcher.patch \
    git://github.com/cxong/tinydir.git;protocol=https;name=tinydir;destsuffix=git/tinydir-upstream \
"
SRCREV_tinydir = "6a487f5896fcf1f1c0e9b16632a8da125d6dd725"

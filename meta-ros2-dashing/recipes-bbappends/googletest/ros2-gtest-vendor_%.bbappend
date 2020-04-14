# Copyright (c) 2019 LG Electronics, Inc.

do_install_append() {
    rm -rf ${D}${ros_prefix}/src
}

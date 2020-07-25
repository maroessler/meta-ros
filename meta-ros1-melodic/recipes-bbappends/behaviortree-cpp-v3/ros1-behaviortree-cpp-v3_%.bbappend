# Copyright (c) 2019-2020 LG Electronics, Inc.

# The cmake subdirectory isn't under datadir/ROS_BPN. In fact, there are two.
FILES_${PN}-dev_prepend = " \
    ${ros_libdir}/BehaviorTreeV3/cmake \
"

do_install_append() {
    rm -f ${D}${ros_libdir}/pkgconfig/tinyxml2.pc
    rmdir -p --ignore-fail-on-non-empty ${D}${ros_libdir}/pkgconfig
}

ROS_BUILD_DEPENDS += "cppzmq"

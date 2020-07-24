# Copyright (c) 2019-2020 LG Electronics, Inc.

# The cmake subdirectory isn't under datadir/ROS_BPN. In fact, there are two.
FILES_${PN}-dev_prepend = " \
    ${ros_libdir}/BehaviorTree/cmake \
"

do_install_append() {
    rm -f ${D}${ros_libdir}/pkgconfig/tinyxml2.pc
    rmdir -p --ignore-fail-on-non-empty ${D}${ros_libdir}/pkgconfig
}

EXTRA_OECMAKE += "\
    -DBUILD_EXAMPLES=OFF \
    -DBUILD_UNIT_TESTS=OFF \
"

ROS_BUILD_DEPENDS += "cppzmq"
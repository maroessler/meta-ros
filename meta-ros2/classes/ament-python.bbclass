# Copyright (c) 2018-2019 LG Electronics, Inc.

DISTUTILS_INSTALL_ARGS_append = " \
    --install-data=${ros_prefix} \
    --install-lib=${ros_prefix}/lib/${PYTHON_DIR}/site-packages \
    "

inherit setuptools3

do_install_append() {
    mkdir -p ${D}/opt/ros/${ROS_DISTRO}/share/ament_index/resource_index/packages
    touch ${D}/opt/ros/${ROS_DISTRO}/share/ament_index/resource_index/packages/${ROS_BPN}
    if test -e ${D}/opt/ros/${ROS_DISTRO}/lib/${ROS_BPN}; then
        for i in ${D}/opt/ros/${ROS_DISTRO}/lib/${ROS_BPN}/* ; do \
            sed -i '1c#!/usr/bin/python3' $i
        done
    fi

    # change python path from native to target
    if test -e ${D}/usr/lib/${ROS_BPN}; then
        for i in ${D}/usr/lib/${ROS_BPN}/* ; do \
            sed -i '1c#!/usr/bin/python3' $i
        done
    fi
}

FILES_${PN}_prepend = " \
    ${datadir}/ament_index \
"

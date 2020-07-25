# Copyright (c) 2018-2019 LG Electronics, Inc.

inherit setuptools3

DISTUTILS_INSTALL_ARGS_append = " \
    --install-data=${ros_prefix} \
    --install-lib=${ros_libdir}/${PYTHON_DIR}/site-packages \
    "

do_install_append() {
    mkdir -p ${D}${ros_datadir}/ament_index/resource_index/packages
    touch ${D}${ros_datadir}/ament_index/resource_index/packages/${ROS_BPN}
    if test -e ${D}${ros_libexecdir}; then
        for i in ${D}${ros_libexecdir}/* ; do \
            if test -e "$i"; then
                sed -i '1c#!/usr/bin/python3' $i
            fi
        done
    fi

    # change python path from native to target
    if test -e ${D}${libdir}/${ROS_BPN}; then
        for i in ${D}${libdir}/${ROS_BPN}/* ; do \
            # necessary to prevent failure on empty directories
            if test -e "$i"; then
                sed -i '1c#!/usr/bin/python3' $i
            fi
        done
    fi
}

FILES_${PN}_prepend = " \
    ${datadir}/ament_index \
"

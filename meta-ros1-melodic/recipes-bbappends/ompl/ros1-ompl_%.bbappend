# Copyright (c) 2019 LG Electronics, Inc.

inherit ros_insane_dev_so

do_install_append() {
    # change python path from native to target
    for i in ${D}${ros_datadir}/${ROS_BPN}/demos/*.py; do
        sed -i '1c#!/usr/bin/python' $i
    done

    # change python path from native to target
    sed -i '1c#!/usr/bin/python' ${D}${ros_bindir}/ompl_benchmark_statistics.py
}
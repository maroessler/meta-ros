# Copyright (c) 2019 LG Electronics, Inc.

do_install_append() {
    # Remove to prevent conflict with ros2-costmap-converter, duplicate files resides in ROS_BPN subdirectory anyway
    rm ${D}${ros_datadir}/plugins.xml
}

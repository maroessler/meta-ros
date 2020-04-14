# Copyright (c) 2020 LG Electronics, Inc.

do_install_append() {
    # Remove to prevent conflict with ros2-nav2-costmap-2d, duplicate files resides in ROS_BPN subdirectory anyway
    rm ${D}${ros_datadir}/costmap_plugins.xml
}

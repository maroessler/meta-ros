# Copyright (c) 2020 LG Electronics, Inc.

do_configure_append() {
    # Fixes this:
    # moveit-core/1.0.2-1-r0/recipe-sysroot/usr/include/c++/8.2.0/cmath:45:15: fatal error: math.h: No such file or directory
    # moveit-core/1.0.2-1-r0/recipe-sysroot/usr/include/c++/8.2.0/cstdlib:75:15: fatal error: stdlib.h: No such file or directory
    sed -i 's/-isystem /-I/g' ${B}/build.ninja
}

# ros1-moveit-core/1.0.2-1-r0/git/trajectory_processing/src/time_optimal_trajectory_generation.cpp:42:10: fatal error: angles/angles.h: No such file or directory
ROS_BUILD_DEPENDS += " \
    ros1-angles \
"
# ros1-moveit-core: 23 installed and not shipped files. [installed-vs-shipped]
inherit ros_insane_dev_so

DEPENDS += "ros1-fcl-catkin"
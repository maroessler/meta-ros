# Copyright (c) 2019 LG Electronics, Inc.

# Force incorrectly classified ROS_EXEC_DEPENDS to be build dependencies:
DEPENDS_append := " ${ROS_EXEC_DEPENDS}"
ROS_EXEC_DEPENDS := ""

ROS_BUILD_DEPENDS_remove = "ros2-ament-cmake"
ROS_BUILDTOOL_DEPENDS += "ros2-ament-cmake-native"

BBCLASSEXTEND = "native"

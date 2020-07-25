# Copyright (c) 2019 LG Electronics, Inc.

ROS_BUILDTOOL_DEPENDS += " \
    ros2-rosidl-cmake-native \
    ros2-rosidl-generator-cpp-native \
"

# for rmw-implementation
BBCLASSEXTEND = "native"

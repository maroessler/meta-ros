# Copyright (c) 2019 LG Electronics, Inc.

# "rosidl-default-generators" belongs in ROS_BUILDTOOL_DEPENDS (as "rosidl-default-generators-native"); it should not be in
# ROS_BUILD_DEPENDS.
ROS_BUILDTOOL_DEPENDS += " \
    ros2-rosidl-default-generators-native \
"
ROS_BUILD_DEPENDS_remove = "rosidl-default-generators"

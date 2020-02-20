# Copyright (c) 2019 LG Electronics, Inc.

# Without the target ros2-rosidl-typesupport-fastrtps-cpp, ament finds the native packages and then fails to link
# (error: incompatible target).
ROS_BUILD_DEPENDS += " \
    ros2-fastcdr \
    ros2-fastrtps \
    ros2-rosidl-typesupport-fastrtps-cpp \
"

BBCLASSEXTEND = "native"

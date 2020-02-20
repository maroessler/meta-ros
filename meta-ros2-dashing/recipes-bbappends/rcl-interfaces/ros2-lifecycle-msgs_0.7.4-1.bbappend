# Copyright (c) 2019 LG Electronics, Inc.

ROS_BUILD_DEPENDS += " \
    ros2-fastcdr \
    ros2-fastrtps \
"

# Without the target rosidl-typesupport-{c,cpp}, ament finds the native packages and then fails to link (error: incompatible
# target).
ROS_BUILD_DEPENDS += " \
    ros2-rosidl-typesupport-c \
    ros2-rosidl-typesupport-cpp \
"

# Copyright (c) 2019 LG Electronics, Inc.

# Without the target rosidl-typesupport-{c,cpp}, ament finds the native packages and then fails to link (error: incompatible
# target).
ROS_BUILD_DEPENDS += " \
    ros2-fastcdr \
    ros2-fastrtps \
    ros2-rosidl-typesupport-c \
    ros2-rosidl-typesupport-cpp \
"

ROS_BUILDTOOL_DEPENDS += " \
    ros2-rosidl-parser-native \
    ros2-rosidl-adapter-native \
    python3-numpy-native \
    python3-lark-parser-native \
"

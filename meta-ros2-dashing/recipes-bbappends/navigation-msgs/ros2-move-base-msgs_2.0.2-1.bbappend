# Copyright (c) 2019 LG Electronics, Inc.

ROS_BUILDTOOL_DEPENDS += " \
    ros2-rosidl-parser-native \
    ros2-rosidl-adapter-native \
    python3-numpy-native \
    python3-lark-parser-native \
    python3-empy-native \
    ros2-rosidl-default-generators-native \
"

# Without the target rosidl-typesupport-{c,cpp}, ament finds the native packages and then fails to link (error: incompatible
# target).
ROS_BUILD_DEPENDS += " \
    ros2-rosidl-typesupport-c \
    ros2-rosidl-typesupport-cpp \
"

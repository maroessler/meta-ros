# Copyright (c) 2019 LG Electronics, Inc.

ROS_BUILD_DEPENDS += " \
    ros2-fastcdr \
    ros2-fastrtps \
"

# usr/share/builtin_interfaces/cmake/ament_cmake_export_dependencies-extras.cmake contains:
#
#     set(_exported_dependencies "rosidl_default_runtime")

ROS_EXPORT_DEPENDS += "ros2-rosidl-default-runtime"

# Without the target rosidl-typesupport-{c,cpp}, ament finds the native packages and then fails to link (error: incompatible
# target).
ROS_BUILD_DEPENDS += " \
    ros2-rosidl-typesupport-c \
    ros2-rosidl-typesupport-cpp \
"

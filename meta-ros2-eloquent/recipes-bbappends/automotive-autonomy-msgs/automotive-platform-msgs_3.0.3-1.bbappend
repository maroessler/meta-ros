# Copyright (c) 2020 LG Electronics, Inc.

# "rosidl-default-generators" belongs in ROS_BUILDTOOL_DEPENDS (as "ros2-rosidl-default-generators-native"); it should not be in
# ROS_BUILD_DEPENDS.
ROS_BUILDTOOL_DEPENDS += " \
    ros2-rosidl-default-generators-native \
"
ROS_BUILD_DEPENDS_remove = "ros2-rosidl-default-generators"

# Needed for ros2-rosidl-generator-py-native to work without native recipes respecting RDEPENDS in oe-core/thud without
# http://git.openembedded.org/openembedded-core/commit/?id=c62520b63284927e177831c351fafa4d2768cb1f
ROS_BUILD_DEPENDS += " \
    python3-numpy-native \
"

# Needed for ros2-rosidl-generator-c-native to work without native recipes respecting RDEPENDS in oe-core/thud without
# http://git.openembedded.org/openembedded-core/commit/?id=c62520b63284927e177831c351fafa4d2768cb1f
ROS_BUILD_DEPENDS += " \
    ros2-rosidl-parser-native \
"

# Needed for ros2-rosidl-generator-c-native to work without native recipes respecting RDEPENDS in oe-core/thud without
# http://git.openembedded.org/openembedded-core/commit/?id=c62520b63284927e177831c351fafa4d2768cb1f
ROS_BUILD_DEPENDS += " \
    python3-lark-parser-native \
"

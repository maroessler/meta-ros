# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "urg_node"
AUTHOR = "Michael Ferguson <mfergs7@gmail.com>"
ROS_AUTHOR = "Chad Rockey <chadrockey@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/urg_node"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "urg_node"
ROS_BPN = "urg_node"

ROS_BUILD_DEPENDS = " \
    boost \
    ros2-builtin-interfaces \
    ros2-diagnostic-updater \
    ros2-laser-proc \
    ros2-rclcpp \
    ros2-rclcpp-components \
    ros2-rosidl-default-generators \
    ros2-sensor-msgs \
    ros2-std-srvs \
    ros2-urg-c \
    ros2-urg-node-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    ros2-builtin-interfaces \
    ros2-diagnostic-updater \
    ros2-laser-proc \
    ros2-rclcpp \
    ros2-rclcpp-components \
    ros2-rosidl-default-generators \
    ros2-sensor-msgs \
    ros2-std-srvs \
    ros2-urg-c \
    ros2-urg-node-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    ros2-builtin-interfaces \
    ros2-diagnostic-updater \
    ros2-laser-proc \
    ros2-rclcpp \
    ros2-rclcpp-components \
    ros2-rosidl-default-generators \
    ros2-sensor-msgs \
    ros2-std-srvs \
    ros2-urg-c \
    ros2-urg-node-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros2-ament-lint-auto \
    ros2-ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/urg_node-release/archive/release/dashing/urg_node/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/urg_node"
SRC_URI = "git://github.com/ros2-gbp/urg_node-release;${ROS_BRANCH};protocol=https"
SRCREV = "c0abf925c8a49d061c20e09910fc3101b70ae68d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

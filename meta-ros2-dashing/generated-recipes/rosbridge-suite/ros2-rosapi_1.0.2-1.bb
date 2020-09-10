# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Provides service calls for getting ros meta-information, like list of     topics, services, params, etc."
AUTHOR = "Russell Toris <rctoris@wpi.edu>"
ROS_AUTHOR = "Jonathan Mace <jonathan.c.mace@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/rosapi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosbridge_suite"
ROS_BPN = "rosapi"

ROS_BUILD_DEPENDS = " \
    ros2-builtin-interfaces \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-ros-native \
    ros2-rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-builtin-interfaces \
    ros2-rcl-interfaces \
    ros2-rclpy \
    ros2-ros2node \
    ros2-ros2param \
    ros2-ros2pkg \
    ros2-ros2service \
    ros2-ros2topic \
    ros2-rosbridge-library \
    ros2-rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosbridge_suite-release/archive/release/dashing/rosapi/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/rosapi"
SRC_URI = "git://github.com/ros2-gbp/rosbridge_suite-release;${ROS_BRANCH};protocol=https"
SRCREV = "7996d506bc41ae497978624d9925a263632cada0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
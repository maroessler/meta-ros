# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Package containing various utility types and functions for C"
AUTHOR = "Anup Pemmaiah <anup.pemmaiah@apex.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rcl"
ROS_BPN = "rcl_yaml_param_parser"

ROS_BUILD_DEPENDS = " \
    libyaml \
    ros2-libyaml-vendor \
    ros2-rcl \
    ros2-rcutils \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    libyaml \
    ros2-libyaml-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libyaml \
    ros2-libyaml-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros2-ament-cmake-gtest \
    ros2-ament-lint-auto \
    ros2-ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rcl-release/archive/release/dashing/rcl_yaml_param_parser/0.7.9-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/rcl_yaml_param_parser"
SRC_URI = "git://github.com/ros2-gbp/rcl-release;${ROS_BRANCH};protocol=https"
SRCREV = "0baae0822b3329707dfc7f273cbc169d61f3af4b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
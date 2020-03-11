# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "A package to aggregate the packages required to use publish / subscribe, services, generate messages and other core ROS concepts."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "variants"
ROS_BPN = "ros_core"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-ament-cmake \
    ros2-ament-cmake-auto \
    ros2-ament-cmake-gmock \
    ros2-ament-cmake-gtest \
    ros2-ament-cmake-pytest \
    ros2-ament-cmake-ros \
    ros2-ament-index-cpp \
    ros2-ament-index-python \
    ros2-ament-lint-auto \
    ros2-ament-lint-common \
    ros2-class-loader \
    ros2-common-interfaces \
    ros2-pluginlib \
    ros2-rcl-lifecycle \
    ros2-rclcpp \
    ros2-rclcpp-lifecycle \
    ros2-rclpy \
    ros2-ros-environment \
    ros2-ros2action \
    ros2-ros2component \
    ros2-ros2launch \
    ros2-ros2lifecycle \
    ros2-ros2msg \
    ros2-ros2multicast \
    ros2-ros2node \
    ros2-ros2param \
    ros2-ros2pkg \
    ros2-ros2run \
    ros2-ros2service \
    ros2-ros2srv \
    ros2-ros2topic \
    ros2-rosidl-default-generators \
    ros2-rosidl-default-runtime \
    ros2-sros2 \
    ros2-sros2-cmake \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/variants-release/archive/release/dashing/ros_core/0.7.3-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/ros_core"
SRC_URI = "git://github.com/ros2-gbp/variants-release;${ROS_BRANCH};protocol=https"
SRCREV = "83e904ebed9ec602e577056c71f84e28196eba99"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
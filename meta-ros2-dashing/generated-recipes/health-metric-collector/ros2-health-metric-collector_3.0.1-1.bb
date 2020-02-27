# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Package providing a ROS node for sending health metrics to Cloudwatch Metrics"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "health_metric_collector"
ROS_BPN = "health_metric_collector"

ROS_BUILD_DEPENDS = " \
    ros2-aws-common \
    ros2-aws-ros2-common \
    ros2-rclcpp \
    ros2-ros-monitoring-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-aws-common \
    ros2-launch \
    ros2-launch-ros \
    ros2-rclcpp \
    ros2-ros-monitoring-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros2-ament-cmake-gmock \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/aws-gbp/health_metric_collector-release/archive/release/dashing/health_metric_collector/3.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/health_metric_collector"
SRC_URI = "git://github.com/aws-gbp/health_metric_collector-release;${ROS_BRANCH};protocol=https"
SRCREV = "da4f92058162d23a7d1b5f34a96a7c13ff279fd3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

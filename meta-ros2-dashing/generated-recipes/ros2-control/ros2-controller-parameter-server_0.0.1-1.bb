# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "parameter server for loading specific controller configurations"
AUTHOR = "Karsten Knese <karsten@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros2_control"
ROS_BPN = "controller_parameter_server"

ROS_BUILD_DEPENDS = " \
    ros2-rclcpp \
    ros2-rcpputils \
    ros2-rcutils \
    ros2-yaml-cpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ros2-rclcpp \
    ros2-rcpputils \
    ros2-rcutils \
    ros2-yaml-cpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-rclcpp \
    ros2-rcpputils \
    ros2-rcutils \
    ros2-yaml-cpp-vendor \
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

# matches with: https://github.com/ros2-gbp/ros2_control-release/archive/release/dashing/controller_parameter_server/0.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/controller_parameter_server"
SRC_URI = "git://github.com/ros2-gbp/ros2_control-release;${ROS_BRANCH};protocol=https"
SRCREV = "04ef787ea7aa0a1a227dbaff081158fe397e9530"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "ROS 2 launch scripts for starting the TurtleBot3"
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Darby Lim <thlim@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/turtlebot3_bringup"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "turtlebot3"
ROS_BPN = "turtlebot3_bringup"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-hls-lfcd-lds-driver \
    ros2-robot-state-publisher \
    ros2-rviz2 \
    ros2-turtlebot3-description \
    ros2-turtlebot3-node \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/robotis-ros2-release/turtlebot3-release/archive/release/dashing/turtlebot3_bringup/2.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/turtlebot3_bringup"
SRC_URI = "git://github.com/robotis-ros2-release/turtlebot3-release;${ROS_BRANCH};protocol=https"
SRCREV = "b8776eb316a2a23c0dbd278e21c6e59268d7410d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

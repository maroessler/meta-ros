# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The industrial robot simulator is a stand in for industrial robot driver node(s).  It adheres to the driver specification for industrial robot controllers."
AUTHOR = "Shaun Edwards <shaun.edwards@gmail.com>"
ROS_AUTHOR = "Shaun Edwards"
HOMEPAGE = "http://ros.org/wiki/industrial_robot_simulator"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "industrial_core"
ROS_BPN = "industrial_robot_simulator"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-rospkg \
    ros1-control-msgs \
    ros1-industrial-msgs \
    ros1-industrial-robot-client \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_robot_simulator/0.7.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/industrial_robot_simulator"
SRC_URI = "git://github.com/ros-industrial-release/industrial_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "354586a4e823a013845cc83978b4ee265d2a257e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

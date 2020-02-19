# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "flexbe_msgs provides the messages used by FlexBE."
AUTHOR = "Philipp Schillinger <schillin@kth.se>"
ROS_AUTHOR = "Philipp Schillinger"
HOMEPAGE = "http://ros.org/wiki/flexbe_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "flexbe"
ROS_BPN = "flexbe_msgs"

ROS_BUILD_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-message-generation \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-message-runtime \
    ros1-rospy \
    ros1-smach-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-message-runtime \
    ros1-rospy \
    ros1-smach-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_msgs/1.2.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/flexbe_msgs"
SRC_URI = "git://github.com/FlexBE/flexbe_behavior_engine-release;${ROS_BRANCH};protocol=https"
SRCREV = "6e60202e3d1d5b2957c2aebc4ef4206736ebaa94"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "this package contains a set of messages that are used by the introspection     interfaces for smach."
AUTHOR = "Isaac I. Y. Saito <gm130s@gmail.com>"
ROS_AUTHOR = "Jonathan Bohren"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "executive_smach"
ROS_BPN = "smach_msgs"

ROS_BUILD_DEPENDS = " \
    ros1-message-generation \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-message-runtime \
    ros1-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-message-runtime \
    ros1-std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/executive_smach-release/archive/release/melodic/smach_msgs/2.0.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/smach_msgs"
SRC_URI = "git://github.com/ros-gbp/executive_smach-release;${ROS_BRANCH};protocol=https"
SRCREV = "86bf20d3741595749d18a53e35acfe880f990f03"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

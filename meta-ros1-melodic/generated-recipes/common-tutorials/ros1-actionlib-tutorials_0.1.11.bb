# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The actionlib_tutorials package"
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Melonee Wise"
HOMEPAGE = "http://www.ros.org/wiki/actionlib/Tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "common_tutorials"
ROS_BPN = "actionlib_tutorials"

ROS_BUILD_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-message-generation \
    ros1-roscpp \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-actionlib \
    ros1-message-runtime \
    ros1-roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-actionlib \
    ros1-message-runtime \
    ros1-roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/common_tutorials-release/archive/release/melodic/actionlib_tutorials/0.1.11-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/actionlib_tutorials"
SRC_URI = "git://github.com/ros-gbp/common_tutorials-release;${ROS_BRANCH};protocol=https"
SRCREV = "0005da991a515a07257c37e9f2f204827fa9aa88"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

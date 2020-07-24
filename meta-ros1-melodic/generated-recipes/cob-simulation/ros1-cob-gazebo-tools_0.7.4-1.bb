# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The cob_gazebo_tools package provides helper tools for the gazebo simulation"
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Felix Messmer <fxm@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_gazebo_tools"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_simulation"
ROS_BPN = "cob_gazebo_tools"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-numpy \
    ros1-gazebo-msgs \
    ros1-geometry-msgs \
    ros1-roslib \
    ros1-rospy \
    ros1-tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_simulation-release/archive/release/melodic/cob_gazebo_tools/0.7.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_gazebo_tools"
SRC_URI = "git://github.com/ipa320/cob_simulation-release;${ROS_BRANCH};protocol=https"
SRCREV = "402289453f14c2e5bc623472042cb3bce33236d8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

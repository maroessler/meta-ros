# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package contains the description (mechanical, kinematic, visual,   etc.) of the Care-O-bot robot. The files in this package are parsed and used by   a variety of other components. Most users will not interact directly   with this package."
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Nadia Hammoudeh Garcia <nhg@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_description"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_common"
ROS_BPN = "cob_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-gazebo-ros \
    ros1-rosbash \
    ros1-rospy \
    ros1-rosunit \
    ros1-xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_description/0.7.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_description"
SRC_URI = "git://github.com/ipa320/cob_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "c174960c8a5f9f176add2b9c5199fd0a4bee7d4e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
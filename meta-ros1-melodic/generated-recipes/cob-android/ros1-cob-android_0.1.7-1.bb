# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "cob_android package provides tools for android apps operation."
AUTHOR = "Benjamin Maidel <bnm@ipa.fhg.de>"
ROS_AUTHOR = "Benjamin Maidel <bnm@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_android"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_android"
ROS_BPN = "cob_android"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-cob-android-msgs \
    ros1-cob-android-resource-server \
    ros1-cob-android-script-server \
    ros1-cob-android-settings \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_android-release/archive/release/melodic/cob_android/0.1.7-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_android"
SRC_URI = "git://github.com/ipa320/cob_android-release;${ROS_BRANCH};protocol=https"
SRCREV = "863c0577bf55dda06052ed9d3b52eccac66bcde1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

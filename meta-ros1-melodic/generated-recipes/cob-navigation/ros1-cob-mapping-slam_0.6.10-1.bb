# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "cob_mapping_slam holds launch files for running SLAM using the <a href="http://ros.org/wiki/gmapping">gmapping</a> package."
AUTHOR = "Felix Zeltner <fez@ipa.fraunhofer.de>"
ROS_AUTHOR = "Matthias Gruhler <mig@ipa.fraunhofer.de>"
HOMEPAGE = "http://ros.org/wiki/cob_mapping_slam"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_navigation"
ROS_BPN = "cob_mapping_slam"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-cob-navigation-global \
    ros1-gmapping \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-cob-supported-robots \
    ros1-roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_mapping_slam/0.6.10-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_mapping_slam"
SRC_URI = "git://github.com/ipa320/cob_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "335dec60e01ff8c7ac2e8476dd60e98846a02fbd"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

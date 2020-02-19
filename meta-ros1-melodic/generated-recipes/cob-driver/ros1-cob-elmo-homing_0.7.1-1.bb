# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This packagae implements the special homing procedure that is needed for old cob4/raw bases"
AUTHOR = "Florian Weisshardt <florian.weisshardt@ipa.fraunhofer.de>"
ROS_AUTHOR = "Mathias Lüdtke <mathias.luedtke@ipa.fraunhofer.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_driver"
ROS_BPN = "cob_elmo_homing"

ROS_BUILD_DEPENDS = " \
    ros1-canopen-402 \
    ros1-pluginlib \
    ros1-socketcan-interface \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-canopen-402 \
    ros1-pluginlib \
    ros1-socketcan-interface \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-canopen-402 \
    ros1-pluginlib \
    ros1-socketcan-interface \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_elmo_homing/0.7.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_elmo_homing"
SRC_URI = "git://github.com/ipa320/cob_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "89eda4bc6a58eed492e4a78575ab1167f74d3f11"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

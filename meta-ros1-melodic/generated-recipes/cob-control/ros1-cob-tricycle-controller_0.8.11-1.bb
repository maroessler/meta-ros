# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The cob_omni_drive_controller package provides a ros_controller plugin for the Care-O-bot tricycle base platform."
AUTHOR = "Felix Messmer <felix.messmer@mojin-robotics.de>"
ROS_AUTHOR = "Felix Messmer <felix.messmer@mojin-robotics.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_control"
ROS_BPN = "cob_tricycle_controller"

ROS_BUILD_DEPENDS = " \
    boost \
    ros1-angles \
    ros1-cob-base-controller-utils \
    ros1-controller-interface \
    ros1-geometry-msgs \
    ros1-hardware-interface \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-realtime-tools \
    ros1-roscpp \
    ros1-std-srvs \
    ros1-tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    ros1-angles \
    ros1-cob-base-controller-utils \
    ros1-controller-interface \
    ros1-geometry-msgs \
    ros1-hardware-interface \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-realtime-tools \
    ros1-roscpp \
    ros1-std-srvs \
    ros1-tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    ros1-angles \
    ros1-cob-base-controller-utils \
    ros1-controller-interface \
    ros1-geometry-msgs \
    ros1-hardware-interface \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-realtime-tools \
    ros1-roscpp \
    ros1-std-srvs \
    ros1-tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_tricycle_controller/0.8.11-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_tricycle_controller"
SRC_URI = "git://github.com/ipa320/cob_control-release;${ROS_BRANCH};protocol=https"
SRCREV = "83d7b5d00ad995ccdeab85c4aae35055810b8c8b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

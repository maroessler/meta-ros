# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package contains classes that are able to control the platform of the Care-O-Bot. This means to establish a CAN communication to drive and steering motors of the platform and later send motion commands and receive motor information."
AUTHOR = "Matthias Gruhler <mig@ipa.fhg.de>"
ROS_AUTHOR = "Christian Connette"
HOMEPAGE = "http://ros.org/wiki/cob_base_drive_chain"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_driver"
ROS_BPN = "cob_base_drive_chain"

ROS_BUILD_DEPENDS = " \
    ros1-cob-canopen-motor \
    ros1-cob-generic-can \
    ros1-cob-utilities \
    ros1-control-msgs \
    ros1-diagnostic-msgs \
    ros1-message-generation \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-cob-canopen-motor \
    ros1-cob-generic-can \
    ros1-cob-utilities \
    ros1-control-msgs \
    ros1-diagnostic-msgs \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-cob-canopen-motor \
    ros1-cob-generic-can \
    ros1-cob-utilities \
    ros1-control-msgs \
    ros1-diagnostic-msgs \
    ros1-message-runtime \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_base_drive_chain/0.7.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_base_drive_chain"
SRC_URI = "git://github.com/ipa320/cob_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "fad4e00ad8101a12d9e9a5c6088213e98081149e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The jsk_tilt_laser package"
AUTHOR = "YoheiKakiuchi <youhei@jsk.imi.i.u-tokyo.ac.jp>"
ROS_AUTHOR = "YoheiKakiuchi <youhei@jsk.imi.i.u-tokyo.ac.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_common"
ROS_BPN = "jsk_tilt_laser"

ROS_BUILD_DEPENDS = " \
    ros1-cmake-modules \
    ros1-dynamic-reconfigure \
    ros1-laser-assembler \
    ros1-laser-filters \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-tf-conversions \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-dynamic-reconfigure \
    ros1-laser-assembler \
    ros1-laser-filters \
    ros1-robot-state-publisher \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-tf-conversions \
    ros1-urg-node \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-dynamic-reconfigure \
    ros1-laser-assembler \
    ros1-laser-filters \
    ros1-robot-state-publisher \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-tf-conversions \
    ros1-urg-node \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_common-release/archive/release/melodic/jsk_tilt_laser/2.2.10-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/jsk_tilt_laser"
SRC_URI = "git://github.com/tork-a/jsk_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "130b05ea91f1b7a0152bcc336131aa17394ec8da"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

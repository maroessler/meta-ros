# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Library used by ROS1/2 node to publish metrics"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cloudwatch_common"
ROS_BPN = "cloudwatch_metrics_common"

ROS_BUILD_DEPENDS = " \
    ros1-aws-common \
    ros1-dataflow-lite \
    ros1-file-management \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-aws-common \
    ros1-dataflow-lite \
    ros1-file-management \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-aws-common \
    ros1-dataflow-lite \
    ros1-file-management \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/aws-gbp/cloudwatch_common-release/archive/release/melodic/cloudwatch_metrics_common/1.1.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cloudwatch_metrics_common"
SRC_URI = "git://github.com/aws-gbp/cloudwatch_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "d981ff87d7ff94756263c855892b643b509d885f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}

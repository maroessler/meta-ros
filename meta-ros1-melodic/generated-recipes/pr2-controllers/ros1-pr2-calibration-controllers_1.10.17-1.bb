# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The pr2_calibration_controllers package contains the controllers      used to bring all the joints in the PR2 to a calibrated state."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Stuart Glaser"
HOMEPAGE = "http://ros.org/wiki/pr2_calibration_controllers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_controllers"
ROS_BPN = "pr2_calibration_controllers"

ROS_BUILD_DEPENDS = " \
    ros1-pluginlib \
    ros1-pr2-controller-interface \
    ros1-pr2-mechanism-controllers \
    ros1-pr2-mechanism-model \
    ros1-realtime-tools \
    ros1-robot-mechanism-controllers \
    ros1-roscpp \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-pluginlib \
    ros1-pr2-controller-interface \
    ros1-pr2-mechanism-controllers \
    ros1-pr2-mechanism-model \
    ros1-realtime-tools \
    ros1-robot-mechanism-controllers \
    ros1-roscpp \
    ros1-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-pluginlib \
    ros1-pr2-controller-interface \
    ros1-pr2-mechanism-controllers \
    ros1-pr2-mechanism-model \
    ros1-realtime-tools \
    ros1-robot-mechanism-controllers \
    ros1-roscpp \
    ros1-std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/pr2_calibration_controllers/1.10.17-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2_calibration_controllers"
SRC_URI = "git://github.com/pr2-gbp/pr2_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "50a8320471c0166c17f77a41c2726f6504a3e850"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

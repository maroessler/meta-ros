# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The diagnostic_analysis package can convert a log of diagnostics data     into a series of CSV files. Robot logs are recorded with rosbag, and     can be processed offline using the scripts in this package."
AUTHOR = "Austin Hendrix <namniart@gmail.com>"
ROS_AUTHOR = "Kevin Watts"
HOMEPAGE = "http://www.ros.org/wiki/diagnostics_analysis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "diagnostics"
ROS_BPN = "diagnostic_analysis"

ROS_BUILD_DEPENDS = " \
    ros1-diagnostic-msgs \
    ros1-rosbag \
    ros1-roslib \
    ros1-rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-diagnostic-msgs \
    ros1-rosbag \
    ros1-roslib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-diagnostic-msgs \
    ros1-rosbag \
    ros1-roslib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/diagnostic_analysis/1.9.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/diagnostic_analysis"
SRC_URI = "git://github.com/ros-gbp/diagnostics-release;${ROS_BRANCH};protocol=https"
SRCREV = "befb03bae2b9e4aba570bdecf57de7ddf024a1ef"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

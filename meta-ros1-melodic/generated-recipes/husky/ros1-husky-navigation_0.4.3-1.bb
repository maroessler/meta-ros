# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Autonomous mapping and navigation demos for the Clearpath Husky"
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
ROS_AUTHOR = "Prasenjit Mukherjee <pmukherj@clearpathrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/husky_navigation"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "husky"
ROS_BPN = "husky_navigation"

ROS_BUILD_DEPENDS = " \
    ros1-roslaunch \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-amcl \
    ros1-base-local-planner \
    ros1-dwa-local-planner \
    ros1-gmapping \
    ros1-map-server \
    ros1-move-base \
    ros1-navfn \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-amcl \
    ros1-base-local-planner \
    ros1-dwa-local-planner \
    ros1-gmapping \
    ros1-map-server \
    ros1-move-base \
    ros1-navfn \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_navigation/0.4.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/husky_navigation"
SRC_URI = "git://github.com/clearpath-gbp/husky-release;${ROS_BRANCH};protocol=https"
SRCREV = "277520bddad1daf9ce9c496612a7b96fb0b50a5a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A light-weight, Eigen-based     C++ library for trajectory optimization for legged robots.      This library provides implementations for variables, costs and constraints     that can be used to represent a legged locomotion problem.      The resulting Nonlinear Programming Problem (NLP) can then be solved with     off-the-shelf solvers, e.g. Ipopt using the generic optimizer interface      <a href="http://wiki.ros.org/ifopt">ifopt</a>."
AUTHOR = "Alexander W. Winkler <alexander.w.winkler@gmail.com>"
ROS_AUTHOR = "Alexander W. Winkler"
HOMEPAGE = "http://github.com/ethz-adrl/towr"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "towr"
ROS_BPN = "towr"

ROS_BUILD_DEPENDS = " \
    libeigen \
    ros1-ifopt \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    ros1-ifopt \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    ros1-catkin \
    ros1-ifopt \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ethz-adrl/towr-release/archive/release/melodic/towr/1.4.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/towr"
SRC_URI = "git://github.com/ethz-adrl/towr-release;${ROS_BRANCH};protocol=https"
SRCREV = "2d6d872ed0172b95d5d1f6ed86577dba9ee37715"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}

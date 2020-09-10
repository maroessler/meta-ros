# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "ROS2 controller (DWB) metapackage"
AUTHOR = "Carl Delsey <carl.r.delsey@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "navigation2"
ROS_BPN = "nav2_dwb_controller"

ROS_BUILD_DEPENDS = " \
    ros2-costmap-queue \
    ros2-dwb-controller \
    ros2-dwb-core \
    ros2-dwb-critics \
    ros2-dwb-msgs \
    ros2-dwb-plugins \
    ros2-nav-2d-msgs \
    ros2-nav-2d-utils \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ros2-costmap-queue \
    ros2-dwb-controller \
    ros2-dwb-core \
    ros2-dwb-critics \
    ros2-dwb-msgs \
    ros2-dwb-plugins \
    ros2-nav-2d-msgs \
    ros2-nav-2d-utils \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-costmap-queue \
    ros2-dwb-controller \
    ros2-dwb-core \
    ros2-dwb-critics \
    ros2-dwb-msgs \
    ros2-dwb-plugins \
    ros2-nav-2d-msgs \
    ros2-nav-2d-utils \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros2-ament-cmake-gtest \
    ros2-ament-cmake-pytest \
    ros2-ament-lint-auto \
    ros2-ament-lint-common \
    ros2-launch \
    ros2-launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_dwb_controller/0.2.6-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/nav2_dwb_controller"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "f382638cce825e194bab733727703b8aaa73add2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
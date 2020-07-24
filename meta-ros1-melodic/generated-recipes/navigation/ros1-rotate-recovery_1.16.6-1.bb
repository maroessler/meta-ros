# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts to clear space by performing a 360 degree rotation of the robot."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://wiki.ros.org/rotate_recovery"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "navigation"
ROS_BPN = "rotate_recovery"

ROS_BUILD_DEPENDS = " \
    libeigen \
    ros1-angles \
    ros1-base-local-planner \
    ros1-cmake-modules \
    ros1-costmap-2d \
    ros1-geometry-msgs \
    ros1-nav-core \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    ros1-costmap-2d \
    ros1-geometry-msgs \
    ros1-nav-core \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    ros1-costmap-2d \
    ros1-geometry-msgs \
    ros1-nav-core \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation-release/archive/release/melodic/rotate_recovery/1.16.6-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rotate_recovery"
SRC_URI = "git://github.com/ros-gbp/navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "7e2695913386dec5153ae5a2d856600a4e3784ff"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

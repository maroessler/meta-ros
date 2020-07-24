# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A implementation of a local planner that attempts to follow a plan as closely as possible."
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://wiki.ros.org/pose_follower"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation_experimental"
ROS_BPN = "pose_follower"

ROS_BUILD_DEPENDS = " \
    ros1-base-local-planner \
    ros1-costmap-2d \
    ros1-dynamic-reconfigure \
    ros1-nav-core \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-base-local-planner \
    ros1-costmap-2d \
    ros1-dynamic-reconfigure \
    ros1-nav-core \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-base-local-planner \
    ros1-costmap-2d \
    ros1-dynamic-reconfigure \
    ros1-nav-core \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
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

# matches with: https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/pose_follower/0.3.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pose_follower"
SRC_URI = "git://github.com/ros-gbp/navigation_experimental-release;${ROS_BRANCH};protocol=https"
SRCREV = "ec3440db7c8821c2ab00dd8e11632a9e691ef4c2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

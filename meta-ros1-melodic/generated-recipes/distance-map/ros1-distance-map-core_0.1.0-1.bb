# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The distance_map_core package."
AUTHOR = "Jeremie Deray <deray.jeremie@gmail.com>"
ROS_AUTHOR = "Jeremie Deray <deray.jeremie@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "distance_map"
ROS_BPN = "distance_map_core"

ROS_BUILD_DEPENDS = " \
    ros1-costmap-2d \
    ros1-distance-map-msgs \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-costmap-2d \
    ros1-distance-map-msgs \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-costmap-2d \
    ros1-distance-map-msgs \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/artivis/distance_map-release/archive/release/melodic/distance_map_core/0.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/distance_map_core"
SRC_URI = "git://github.com/artivis/distance_map-release;${ROS_BRANCH};protocol=https"
SRCREV = "fae332c57bed7168f0cb1841f4e26db1a61f722a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

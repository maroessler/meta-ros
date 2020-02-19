# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Layered costmap organizer package"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
ROS_AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "neonavigation"
ROS_BPN = "map_organizer"

ROS_BUILD_DEPENDS = " \
    libeigen \
    pcl \
    ros1-cmake-modules \
    ros1-eigen-conversions \
    ros1-geometry-msgs \
    ros1-map-organizer-msgs \
    ros1-map-server \
    ros1-nav-msgs \
    ros1-neonavigation-common \
    ros1-pcl-conversions \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    ros1-cmake-modules \
    ros1-eigen-conversions \
    ros1-geometry-msgs \
    ros1-map-organizer-msgs \
    ros1-map-server \
    ros1-nav-msgs \
    ros1-neonavigation-common \
    ros1-pcl-conversions \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    pcl \
    ros1-cmake-modules \
    ros1-eigen-conversions \
    ros1-geometry-msgs \
    ros1-map-organizer-msgs \
    ros1-map-server \
    ros1-nav-msgs \
    ros1-neonavigation-common \
    ros1-pcl-conversions \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-roslint \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/at-wat/neonavigation-release/archive/release/melodic/map_organizer/0.7.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/map_organizer"
SRC_URI = "git://github.com/at-wat/neonavigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "3735115c467d1c913068506c189277d372bee700"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

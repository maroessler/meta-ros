# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Segmentation Functionality from the RAIL Lab"
AUTHOR = "Russell Toris <russell.toris@gmail.com>"
ROS_AUTHOR = "Russell Toris <russell.toris@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/rail_segmentation"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rail_segmentation"
ROS_BPN = "rail_segmentation"

ROS_BUILD_DEPENDS = " \
    boost \
    pkgconfig \
    ros1-message-generation \
    ros1-pcl-conversions \
    ros1-pcl-ros \
    ros1-rail-manipulation-msgs \
    ros1-roscpp \
    ros1-roslib \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-ros \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    ros1-message-runtime \
    ros1-pcl-conversions \
    ros1-pcl-ros \
    ros1-rail-manipulation-msgs \
    ros1-roscpp \
    ros1-roslib \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-ros \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    ros1-message-runtime \
    ros1-pcl-conversions \
    ros1-pcl-ros \
    ros1-rail-manipulation-msgs \
    ros1-roscpp \
    ros1-roslib \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-ros \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/gt-rail-release/rail_segmentation/archive/release/melodic/rail_segmentation/0.1.15-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rail_segmentation"
SRC_URI = "git://github.com/gt-rail-release/rail_segmentation;${ROS_BRANCH};protocol=https"
SRCREV = "f43d2b8597063bcfb1efc8506c26c43da8812da9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
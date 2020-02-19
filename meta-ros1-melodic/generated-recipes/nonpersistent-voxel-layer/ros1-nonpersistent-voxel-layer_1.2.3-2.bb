# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "include         This package provides an implementation of a 3D costmap that takes in sensor         data from the world, builds a 3D occupancy grid of the data for only one iteration."
AUTHOR = "Steven Macenski <stevenmacenski@gmail.com>"
ROS_AUTHOR = "Steven Macenski"
HOMEPAGE = "http://wiki.ros.org/non-persisent-voxel-layer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "nonpersistent_voxel_layer"
ROS_BPN = "nonpersistent_voxel_layer"

ROS_BUILD_DEPENDS = " \
    ros1-cmake-modules \
    ros1-costmap-2d \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-laser-geometry \
    ros1-map-msgs \
    ros1-message-filters \
    ros1-message-generation \
    ros1-nav-msgs \
    ros1-pcl-conversions \
    ros1-pcl-ros \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    ros1-visualization-msgs \
    ros1-voxel-grid \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-costmap-2d \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-laser-geometry \
    ros1-map-msgs \
    ros1-message-filters \
    ros1-message-runtime \
    ros1-nav-msgs \
    ros1-pcl-conversions \
    ros1-pcl-ros \
    ros1-pluginlib \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    ros1-visualization-msgs \
    ros1-voxel-grid \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-costmap-2d \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-laser-geometry \
    ros1-map-msgs \
    ros1-message-filters \
    ros1-message-runtime \
    ros1-nav-msgs \
    ros1-pcl-conversions \
    ros1-pcl-ros \
    ros1-pluginlib \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    ros1-visualization-msgs \
    ros1-voxel-grid \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/nonpersistent_voxel_layer-release/archive/release/melodic/nonpersistent_voxel_layer/1.2.3-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/nonpersistent_voxel_layer"
SRC_URI = "git://github.com/SteveMacenski/nonpersistent_voxel_layer-release;${ROS_BRANCH};protocol=https"
SRCREV = "e493222514aaf248a98324aeb9860fd152bbb4b2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

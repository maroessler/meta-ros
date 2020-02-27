# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "This package provides an implementation of a 2D costmap that takes in sensor     data from the world, builds a 2D or 3D occupancy grid of the data (depending     on whether a voxel based implementation is used), and inflates costs in a     2D costmap based on the occupancy grid and a user specified inflation radius.     This package also provides support for map_server based initialization of a     costmap, rolling window based costmaps, and parameter based subscription to     and configuration of sensor topics."
AUTHOR = "Steve Macenski <stevenmacenski@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "navigation2"
ROS_BPN = "nav2_costmap_2d"

ROS_BUILD_DEPENDS = " \
    ros2-geometry-msgs \
    ros2-laser-geometry \
    ros2-map-msgs \
    ros2-message-filters \
    ros2-nav-msgs \
    ros2-nav2-common \
    ros2-nav2-msgs \
    ros2-nav2-util \
    ros2-nav2-voxel-grid \
    ros2-pluginlib \
    ros2-rclcpp \
    ros2-rclcpp-lifecycle \
    ros2-sensor-msgs \
    ros2-std-msgs \
    ros2-tf2 \
    ros2-tf2-geometry-msgs \
    ros2-tf2-ros \
    ros2-tf2-sensor-msgs \
    ros2-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ros2-geometry-msgs \
    ros2-laser-geometry \
    ros2-map-msgs \
    ros2-message-filters \
    ros2-nav-msgs \
    ros2-nav2-msgs \
    ros2-nav2-util \
    ros2-nav2-voxel-grid \
    ros2-pluginlib \
    ros2-rclcpp \
    ros2-rclcpp-lifecycle \
    ros2-sensor-msgs \
    ros2-std-msgs \
    ros2-tf2 \
    ros2-tf2-geometry-msgs \
    ros2-tf2-ros \
    ros2-tf2-sensor-msgs \
    ros2-visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-geometry-msgs \
    ros2-laser-geometry \
    ros2-map-msgs \
    ros2-message-filters \
    ros2-nav-msgs \
    ros2-nav2-msgs \
    ros2-nav2-util \
    ros2-nav2-voxel-grid \
    ros2-pluginlib \
    ros2-rclcpp \
    ros2-rclcpp-lifecycle \
    ros2-sensor-msgs \
    ros2-std-msgs \
    ros2-tf2 \
    ros2-tf2-geometry-msgs \
    ros2-tf2-ros \
    ros2-tf2-sensor-msgs \
    ros2-visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros2-ament-cmake-gtest \
    ros2-ament-cmake-pytest \
    ros2-ament-lint-auto \
    ros2-ament-lint-common \
    ros2-launch \
    ros2-launch-testing \
    ros2-nav2-lifecycle-manager \
    ros2-nav2-map-server \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_costmap_2d/0.2.6-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/nav2_costmap_2d"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "c6d76899627b253035a9c90d1ad46745ecad087b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

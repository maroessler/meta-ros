# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "ROS2 Drivers for the Ouster OS-1 Lidar"
AUTHOR = "Steve Macenski <stevenmacenski@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "ros2_ouster_driver"
ROS_BPN = "ros2_ouster"

ROS_BUILD_DEPENDS = " \
    pcl \
    ros2-builtin-interfaces \
    ros2-geometry-msgs \
    ros2-launch \
    ros2-launch-ros \
    ros2-ouster-msgs \
    ros2-pcl-conversions \
    ros2-rclcpp \
    ros2-rclcpp-components \
    ros2-rclcpp-lifecycle \
    ros2-sensor-msgs \
    ros2-std-srvs \
    ros2-tf2-geometry-msgs \
    ros2-tf2-ros \
    ros2-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    pcl \
    ros2-builtin-interfaces \
    ros2-geometry-msgs \
    ros2-launch \
    ros2-launch-ros \
    ros2-ouster-msgs \
    ros2-pcl-conversions \
    ros2-rclcpp \
    ros2-rclcpp-components \
    ros2-rclcpp-lifecycle \
    ros2-sensor-msgs \
    ros2-std-srvs \
    ros2-tf2-geometry-msgs \
    ros2-tf2-ros \
    ros2-visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pcl \
    ros2-builtin-interfaces \
    ros2-geometry-msgs \
    ros2-launch \
    ros2-launch-ros \
    ros2-ouster-msgs \
    ros2-pcl-conversions \
    ros2-rclcpp \
    ros2-rclcpp-components \
    ros2-rclcpp-lifecycle \
    ros2-sensor-msgs \
    ros2-std-srvs \
    ros2-tf2-geometry-msgs \
    ros2-tf2-ros \
    ros2-visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros2-ament-lint-auto \
    ros2-ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/ros2_ouster_drivers-release/archive/release/dashing/ros2_ouster/0.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/ros2_ouster"
SRC_URI = "git://github.com/SteveMacenski/ros2_ouster_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "8e1508135232cc23a9401cad92061e4786f60092"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Provides nonlinear state estimation through sensor fusion of an abritrary number of sensors."
AUTHOR = "Tom Moore <ayrton04@gmail.com>"
ROS_AUTHOR = "Tom Moore <ayrton04@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/robot_localization"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "robot_localization"
ROS_BPN = "robot_localization"

ROS_BUILD_DEPENDS = " \
    libeigen \
    ros2-diagnostic-msgs \
    ros2-diagnostic-updater \
    ros2-geographic-msgs \
    ros2-geometry-msgs \
    ros2-nav-msgs \
    ros2-rclcpp \
    ros2-rmw-implementation \
    ros2-sensor-msgs \
    ros2-std-msgs \
    ros2-std-srvs \
    ros2-tf2 \
    ros2-tf2-eigen \
    ros2-tf2-geometry-msgs \
    ros2-tf2-ros \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
    ros2-builtin-interfaces-native \
    ros2-rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    ros2-diagnostic-msgs \
    ros2-diagnostic-updater \
    ros2-geographic-msgs \
    ros2-geometry-msgs \
    ros2-nav-msgs \
    ros2-sensor-msgs \
    ros2-std-msgs \
    ros2-std-srvs \
    ros2-tf2 \
    ros2-tf2-eigen \
    ros2-tf2-geometry-msgs \
    ros2-tf2-ros \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    ros2-diagnostic-msgs \
    ros2-diagnostic-updater \
    ros2-geographic-msgs \
    ros2-geometry-msgs \
    ros2-nav-msgs \
    ros2-rclcpp \
    ros2-rmw-implementation \
    ros2-rosidl-default-runtime \
    ros2-sensor-msgs \
    ros2-std-msgs \
    ros2-std-srvs \
    ros2-tf2 \
    ros2-tf2-eigen \
    ros2-tf2-geometry-msgs \
    ros2-tf2-ros \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros2-ament-cmake-gtest \
    ros2-ament-lint-auto \
    ros2-ament-lint-common \
    ros2-builtin-interfaces \
    ros2-launch-ros \
    ros2-launch-testing-ament-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/cra-ros-pkg/robot_localization-release/archive/release/dashing/robot_localization/3.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/robot_localization"
SRC_URI = "git://github.com/cra-ros-pkg/robot_localization-release;${ROS_BRANCH};protocol=https"
SRCREV = "93ac2e2d3a909364cfa483b770b8f6e98aad02b5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "GPS routines for use in GPS drivers"
AUTHOR = "P. J. Reed <preed@swri.org>"
HOMEPAGE = "http://ros.org/wiki/gps_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "gps_umd"
ROS_BPN = "gps_tools"

ROS_BUILD_DEPENDS = " \
    ros2-gps-msgs \
    ros2-nav-msgs \
    ros2-rclcpp \
    ros2-rclcpp-components \
    ros2-rclpy \
    ros2-sensor-msgs \
    ros2-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
    ros2-ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = " \
    ros2-gps-msgs \
    ros2-nav-msgs \
    ros2-rclcpp \
    ros2-rclcpp-components \
    ros2-rclpy \
    ros2-sensor-msgs \
    ros2-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-gps-msgs \
    ros2-nav-msgs \
    ros2-rclcpp \
    ros2-rclcpp-components \
    ros2-rclpy \
    ros2-sensor-msgs \
    ros2-std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/dashing/gps_tools/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/gps_tools"
SRC_URI = "git://github.com/swri-robotics-gbp/gps_umd-release;${ROS_BRANCH};protocol=https"
SRCREV = "6dca29544271ee0d713a670947d6c7079c0ea863"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

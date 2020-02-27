# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "TODO"
AUTHOR = "Carl Delsey <carl.r.delsey@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "navigation2"
ROS_BPN = "dwb_core"

ROS_BUILD_DEPENDS = " \
    ros2-dwb-msgs \
    ros2-geometry-msgs \
    ros2-nav-2d-msgs \
    ros2-nav-2d-utils \
    ros2-nav-msgs \
    ros2-nav2-common \
    ros2-nav2-costmap-2d \
    ros2-nav2-util \
    ros2-pluginlib \
    ros2-rclcpp \
    ros2-sensor-msgs \
    ros2-std-msgs \
    ros2-tf2-ros \
    ros2-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-dwb-msgs \
    ros2-geometry-msgs \
    ros2-nav-2d-utils \
    ros2-nav-msgs \
    ros2-nav2-costmap-2d \
    ros2-nav2-util \
    ros2-pluginlib \
    ros2-rclcpp \
    ros2-std-msgs \
    ros2-tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros2-ament-cmake-gtest \
    ros2-ament-cmake-pytest \
    ros2-ament-lint-auto \
    ros2-ament-lint-common \
    ros2-launch \
    ros2-launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/dwb_core/0.2.6-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/dwb_core"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "4efa659104943e11824eca9ab5e8707b1b4dd1cf"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

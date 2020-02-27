# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Package containing tools for dynamically loadable components"
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rclcpp"
ROS_BPN = "rclcpp_components"

ROS_BUILD_DEPENDS = " \
    ros2-ament-index-cpp \
    ros2-class-loader \
    ros2-composition-interfaces \
    ros2-rclcpp \
    ros2-rcpputils \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-ament-index-cpp \
    ros2-class-loader \
    ros2-composition-interfaces \
    ros2-rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros2-ament-cmake-gtest \
    ros2-ament-lint-auto \
    ros2-ament-lint-common \
    ros2-launch-testing \
    ros2-std-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rclcpp-release/archive/release/dashing/rclcpp_components/0.7.12-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/rclcpp_components"
SRC_URI = "git://github.com/ros2-gbp/rclcpp-release;${ROS_BRANCH};protocol=https"
SRCREV = "444282340ab76d1665264b9894f715780990b2af"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Demonstrates ROS 2's realtime capabilities with a simulated inverted pendulum."
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
ROS_AUTHOR = "Jackie Kay"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "demos"
ROS_BPN = "pendulum_control"

ROS_BUILD_DEPENDS = " \
    ros2-pendulum-msgs \
    ros2-rclcpp \
    ros2-rttest \
    ros2-tlsf-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-pendulum-msgs \
    ros2-rclcpp \
    ros2-rttest \
    ros2-tlsf-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros2-ament-cmake-pytest \
    ros2-ament-lint-auto \
    ros2-ament-lint-common \
    ros2-launch \
    ros2-launch-testing \
    ros2-launch-testing-ament-cmake \
    ros2-launch-testing-ros \
    ros2-rmw-implementation-cmake \
    ros2-ros2run \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/demos-release/archive/release/dashing/pendulum_control/0.7.9-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/pendulum_control"
SRC_URI = "git://github.com/ros2-gbp/demos-release;${ROS_BRANCH};protocol=https"
SRCREV = "b898bda9731ca30b0781abb1f7bacce3ce968b6f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

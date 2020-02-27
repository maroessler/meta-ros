# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "The entry point package to launch testing in ROS."
AUTHOR = "Michel Hidalgo <michel@ekumenlabs.com>"
ROS_AUTHOR = "Michel Hidalgo <michel@ekumenlabs.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros_testing"
ROS_BPN = "ros_testing"

ROS_BUILD_DEPENDS = " \
    ros2-ament-cmake-core \
    ros2-ament-cmake-export-dependencies \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ros2-launch-testing \
    ros2-launch-testing-ament-cmake \
    ros2-launch-testing-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ros2-launch-testing-ament-cmake-native \
    ros2-ros2test-native \
"

ROS_EXEC_DEPENDS = " \
    ros2-launch-testing \
    ros2-launch-testing-ros \
    ros2-ros2test \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros_testing-release/archive/release/dashing/ros_testing/0.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/ros_testing"
SRC_URI = "git://github.com/ros2-gbp/ros_testing-release;${ROS_BRANCH};protocol=https"
SRCREV = "8b16d640670a0e6bf622d774607a7f5c17e80d74"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

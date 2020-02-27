# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "TODO"
AUTHOR = "Michael Jeronimo <michael.jeronimo@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "navigation2"
ROS_BPN = "nav2_util"

ROS_BUILD_DEPENDS = " \
    boost \
    libsdl \
    libsdl-image \
    ros2-geometry-msgs \
    ros2-lifecycle-msgs \
    ros2-nav-msgs \
    ros2-nav2-common \
    ros2-nav2-msgs \
    ros2-rclcpp \
    ros2-rclcpp-action \
    ros2-rclcpp-lifecycle \
    ros2-test-msgs \
    ros2-tf2 \
    ros2-tf2-geometry-msgs \
    ros2-tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libsdl \
    libsdl-image \
    ros2-geometry-msgs \
    ros2-lifecycle-msgs \
    ros2-nav-msgs \
    ros2-nav2-common \
    ros2-nav2-msgs \
    ros2-rclcpp \
    ros2-rclcpp-action \
    ros2-rclcpp-lifecycle \
    ros2-test-msgs \
    ros2-tf2 \
    ros2-tf2-geometry-msgs \
    ros2-tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libboost-program-options} \
    libsdl \
    libsdl-image \
    ros2-geometry-msgs \
    ros2-lifecycle-msgs \
    ros2-nav-msgs \
    ros2-nav2-common \
    ros2-nav2-msgs \
    ros2-rclcpp \
    ros2-rclcpp-action \
    ros2-rclcpp-lifecycle \
    ros2-test-msgs \
    ros2-tf2 \
    ros2-tf2-geometry-msgs \
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
    ros2-rclcpp-action \
    ros2-rclcpp-lifecycle \
    ros2-std-srvs \
    ros2-test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_util/0.2.6-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/nav2_util"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "f35f9b3600b7fffb893e67ebfcc7766494696bcc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

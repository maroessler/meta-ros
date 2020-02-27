# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Asynchronous Web/WebSocket Server in C++"
AUTHOR = "Russell Toris <russell.toris@gmail.com>"
ROS_AUTHOR = "Mitchell Wills <mwills@wpi.edu>"
HOMEPAGE = "http://ros.org/wiki/async_web_server_cpp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "async_web_server_cpp"
ROS_BPN = "async_web_server_cpp"

ROS_BUILD_DEPENDS = " \
    boost \
    openssl \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    openssl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python3-websocket} \
    ros2-launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/async_web_server_cpp-release/archive/release/dashing/async_web_server_cpp/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/async_web_server_cpp"
SRC_URI = "git://github.com/ros2-gbp/async_web_server_cpp-release;${ROS_BRANCH};protocol=https"
SRCREV = "4771f2a519b5f99426ba886d07131a8842401f77"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

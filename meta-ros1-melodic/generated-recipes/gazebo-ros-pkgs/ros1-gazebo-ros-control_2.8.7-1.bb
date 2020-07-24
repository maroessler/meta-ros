# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "gazebo_ros_control"
AUTHOR = "Jose Luis Rivero <jrivero@osrfoundation.org>"
ROS_AUTHOR = "Jonathan Bohren"
HOMEPAGE = "http://ros.org/wiki/gazebo_ros_control"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "gazebo_ros_pkgs"
ROS_BPN = "gazebo_ros_control"

ROS_BUILD_DEPENDS = " \
    ros1-angles \
    ros1-control-toolbox \
    ros1-controller-manager \
    ros1-gazebo-rosdev \
    ros1-hardware-interface \
    ros1-joint-limits-interface \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-std-msgs \
    ros1-transmission-interface \
    ros1-urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-angles \
    ros1-control-toolbox \
    ros1-controller-manager \
    ros1-hardware-interface \
    ros1-joint-limits-interface \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-std-msgs \
    ros1-transmission-interface \
    ros1-urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-angles \
    ros1-control-toolbox \
    ros1-controller-manager \
    ros1-gazebo-ros \
    ros1-hardware-interface \
    ros1-joint-limits-interface \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-std-msgs \
    ros1-transmission-interface \
    ros1-urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/melodic/gazebo_ros_control/2.8.7-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/gazebo_ros_control"
SRC_URI = "git://github.com/ros-gbp/gazebo_ros_pkgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "c11c55f706db626aa3c5b4af748fbf8b25a755ef"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

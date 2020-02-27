# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "This package defines messages for NCS inference"
AUTHOR = "Xiaojun Huang <xiaojun.huang@intel.com>"
ROS_AUTHOR = "Xiaojun Huang <xiaojun.huang@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=a530e7e8bd0b9c8e6d4e5d32904af192"

ROS_CN = "object_msgs"
ROS_BPN = "object_msgs"

ROS_BUILD_DEPENDS = " \
    ros2-rosidl-default-generators \
    ros2-sensor-msgs \
    ros2-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
    ros2-rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-rosidl-default-runtime \
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

# matches with: https://github.com/ros2-gbp/ros2_object_msgs-release/archive/release/dashing/object_msgs/0.4.0-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/object_msgs"
SRC_URI = "git://github.com/ros2-gbp/ros2_object_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "637607cf1a73ca62742038e6a9b6b278fb90a72f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

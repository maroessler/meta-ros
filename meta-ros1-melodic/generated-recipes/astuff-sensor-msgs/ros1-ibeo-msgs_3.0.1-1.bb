# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The ibeo_msgs package"
AUTHOR = "AutonomouStuff Software Team <support@autonomoustuff.com>"
ROS_AUTHOR = "Joshua Whitley <jwhitley@autonomoustuff.com>"
HOMEPAGE = "http://wiki.ros.org/kartech_linear_actuator_msgs"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "astuff_sensor_msgs"
ROS_BPN = "ibeo_msgs"

ROS_BUILD_DEPENDS = " \
    ros1-message-generation \
    ros1-ros-environment \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-message-runtime \
    ros1-std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/ibeo_msgs/3.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ibeo_msgs"
SRC_URI = "git://github.com/astuff/astuff_sensor_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "8cdef9c0386fc0efd18273b93292bcffe2b9bcb3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

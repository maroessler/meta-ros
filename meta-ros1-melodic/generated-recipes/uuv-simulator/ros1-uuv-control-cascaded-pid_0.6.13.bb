# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A cascade of PID controllers for acceleration, velocity, and position control."
AUTHOR = "Musa Morena Marcusso Manhaes <musa.marcusso@de.bosch.com>"
ROS_AUTHOR = "Musa Morena Marcusso Manhaes <musa.marcusso@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "uuv_simulator"
ROS_BPN = "uuv_control_cascaded_pid"

ROS_BUILD_DEPENDS = " \
    ros1-dynamic-reconfigure \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-dynamic-reconfigure \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-numpy \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-nav-msgs \
    ros1-rospy \
    ros1-tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_control_cascaded_pid/0.6.13-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/uuv_control_cascaded_pid"
SRC_URI = "git://github.com/uuvsimulator/uuv_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "f933cf0e2de8e4b3a65a1f0e9284d9cba1aa5324"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

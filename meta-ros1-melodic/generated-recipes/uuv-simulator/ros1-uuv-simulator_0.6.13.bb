# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "uuv_simulator contains Gazebo plugins and ROS packages for modeling and simulating unmanned underwater vehicles"
AUTHOR = "Luiz Ricardo Douat <luizricardo.douat@de.bosch.com>"
ROS_AUTHOR = "Luiz Ricardo Douat <luizricardo.douat@de.bosch.com>"
HOMEPAGE = "https://uuvsimulator.github.io/"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "uuv_simulator"
ROS_BPN = "uuv_simulator"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-uuv-assistants \
    ros1-uuv-auv-control-allocator \
    ros1-uuv-control-cascaded-pid \
    ros1-uuv-control-msgs \
    ros1-uuv-control-utils \
    ros1-uuv-descriptions \
    ros1-uuv-gazebo \
    ros1-uuv-gazebo-plugins \
    ros1-uuv-gazebo-ros-plugins \
    ros1-uuv-gazebo-ros-plugins-msgs \
    ros1-uuv-gazebo-worlds \
    ros1-uuv-sensor-ros-plugins \
    ros1-uuv-sensor-ros-plugins-msgs \
    ros1-uuv-teleop \
    ros1-uuv-thruster-manager \
    ros1-uuv-trajectory-control \
    ros1-uuv-world-plugins \
    ros1-uuv-world-ros-plugins \
    ros1-uuv-world-ros-plugins-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_simulator/0.6.13-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/uuv_simulator"
SRC_URI = "git://github.com/uuvsimulator/uuv_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "ac9cf4e6bc641f2c3b367a32c3596d8daabc86ad"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
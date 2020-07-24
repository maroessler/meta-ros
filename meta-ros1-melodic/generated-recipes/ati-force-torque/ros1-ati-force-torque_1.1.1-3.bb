# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package implements driver for ATI force torque sensors up to firmware 3.x. Char and Net CAN devices are supported through cob_generic_can package. The code if based on cob_forcetorque package."
AUTHOR = "Denis Štogl (KIT, IAR-IPR) <denis.stogl@kit.edu>"
ROS_AUTHOR = "Denis Štogl"
HOMEPAGE = "http://ros.org/wiki/ati_force_torque"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "ati_force_torque"
ROS_BPN = "ati_force_torque"

ROS_BUILD_DEPENDS = " \
    ros1-cmake-modules \
    ros1-cob-generic-can \
    ros1-filters \
    ros1-force-torque-sensor \
    ros1-gazebo-ros \
    ros1-geometry-msgs \
    ros1-hardware-interface \
    ros1-iirob-filters \
    ros1-libmodbus \
    ros1-message-generation \
    ros1-pluginlib \
    ros1-realtime-tools \
    ros1-roscpp \
    ros1-roslaunch \
    ros1-rosparam-handler \
    ros1-rospy \
    ros1-rostopic \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-teleop-twist-joy \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
    ros1-trajectory-msgs \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-cob-generic-can \
    ros1-filters \
    ros1-force-torque-sensor \
    ros1-gazebo-ros \
    ros1-geometry-msgs \
    ros1-hardware-interface \
    ros1-iirob-filters \
    ros1-libmodbus \
    ros1-pluginlib \
    ros1-realtime-tools \
    ros1-roscpp \
    ros1-roslaunch \
    ros1-rosparam-handler \
    ros1-rospy \
    ros1-rostopic \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-teleop-twist-joy \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
    ros1-trajectory-msgs \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-cob-generic-can \
    ros1-filters \
    ros1-force-torque-sensor \
    ros1-gazebo-ros \
    ros1-geometry-msgs \
    ros1-hardware-interface \
    ros1-iirob-filters \
    ros1-libmodbus \
    ros1-message-runtime \
    ros1-pluginlib \
    ros1-realtime-tools \
    ros1-robot-state-publisher \
    ros1-roscpp \
    ros1-roslaunch \
    ros1-rosparam-handler \
    ros1-rospy \
    ros1-rostopic \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-teleop-twist-joy \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
    ros1-trajectory-msgs \
    ros1-visualization-msgs \
    ros1-xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/KITrobotics/ati_force_torque-release/archive/release/melodic/ati_force_torque/1.1.1-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ati_force_torque"
SRC_URI = "git://github.com/KITrobotics/ati_force_torque-release;${ROS_BRANCH};protocol=https"
SRCREV = "e6467d709bf7d0465781a28e017e46bd96d0e449"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

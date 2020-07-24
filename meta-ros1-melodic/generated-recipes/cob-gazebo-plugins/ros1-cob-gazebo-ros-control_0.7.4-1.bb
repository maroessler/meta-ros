# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package contains a specialization of the gazebo_ros_control plugin.     The cob_gazebo_ros_control plugin allows Multi-HardwareInterface-Support."
AUTHOR = "Felix Messmer <fxm@ipa.fhg.de>"
ROS_AUTHOR = "Felix Messmer <fxm@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_gazebo_ros_control"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_gazebo_plugins"
ROS_BPN = "cob_gazebo_ros_control"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    ros1-controller-manager \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-hardware-interface \
    ros1-joint-limits-interface \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-transmission-interface \
    ros1-urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    ros1-controller-manager \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-hardware-interface \
    ros1-joint-limits-interface \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-transmission-interface \
    ros1-urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    ros1-controller-manager \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-hardware-interface \
    ros1-joint-limits-interface \
    ros1-pluginlib \
    ros1-roscpp \
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

# matches with: https://github.com/ipa320/cob_gazebo_plugins-release/archive/release/melodic/cob_gazebo_ros_control/0.7.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_gazebo_ros_control"
SRC_URI = "git://github.com/ipa320/cob_gazebo_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "d9d27f1d49d42fbceb7bd27a49c0f989d137909f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

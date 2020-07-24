# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Robot description for the ECA A9 AUV"
AUTHOR = "Thibault Pelletier <thp@eca.fr>"
ROS_AUTHOR = "Thibault Pelletier <thp@eca.fr>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "eca_a9"
ROS_BPN = "eca_a9_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-gazebo-ros \
    ros1-robot-state-publisher \
    ros1-uuv-assistants \
    ros1-uuv-descriptions \
    ros1-uuv-gazebo-ros-plugins \
    ros1-uuv-sensor-ros-plugins \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-rostest \
    ros1-rosunit \
    ros1-xacro \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uuvsimulator/eca_a9-release/archive/release/melodic/eca_a9_description/0.1.6-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/eca_a9_description"
SRC_URI = "git://github.com/uuvsimulator/eca_a9-release;${ROS_BRANCH};protocol=https"
SRCREV = "3bf44b5bb3650aef190026d45a964d4d118f09a3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

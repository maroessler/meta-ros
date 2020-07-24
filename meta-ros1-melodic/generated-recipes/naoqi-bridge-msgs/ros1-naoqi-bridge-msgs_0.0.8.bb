# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The naoqi_bridge_msgs package provides custom messages for running Aldebaran's robot such as NAO and Pepper. See the packages nao_robot and pepper_robot for details."
AUTHOR = "Karsten Knese <karsten.knese@gmail.com>"
ROS_AUTHOR = "Karsten Knese"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "naoqi_bridge_msgs"
ROS_BPN = "naoqi_bridge_msgs"

ROS_BUILD_DEPENDS = " \
    ros1-actionlib-msgs \
    ros1-genmsg \
    ros1-geometry-msgs \
    ros1-message-generation \
    ros1-nav-msgs \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-actionlib-msgs \
    ros1-genmsg \
    ros1-geometry-msgs \
    ros1-message-runtime \
    ros1-nav-msgs \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-actionlib-msgs \
    ros1-genmsg \
    ros1-geometry-msgs \
    ros1-message-runtime \
    ros1-nav-msgs \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-naoqi/naoqi_bridge_msgs-release/archive/release/melodic/naoqi_bridge_msgs/0.0.8-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/naoqi_bridge_msgs"
SRC_URI = "git://github.com/ros-naoqi/naoqi_bridge_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "d244572a792f7f204a437fc3c6ab9825b4f01203"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

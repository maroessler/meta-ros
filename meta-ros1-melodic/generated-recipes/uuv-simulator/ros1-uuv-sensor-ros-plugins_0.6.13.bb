# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The uuv_sensor_ros_plugins package"
AUTHOR = "Musa Morena Marcusso Manhaes <musa.marcusso@de.bosch.com>"
ROS_AUTHOR = "Musa Morena Marcusso Manhaes <musa.marcusso@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "uuv_simulator"
ROS_BPN = "uuv_sensor_ros_plugins"

ROS_BUILD_DEPENDS = " \
    ros1-gazebo-plugins \
    ros1-gazebo-rosdev \
    ros1-geometry-msgs \
    ros1-image-transport \
    ros1-laser-geometry \
    ros1-message-filters \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-ros \
    ros1-uuv-gazebo-plugins \
    ros1-uuv-sensor-ros-plugins-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-gazebo-plugins \
    ros1-gazebo-rosdev \
    ros1-geometry-msgs \
    ros1-image-transport \
    ros1-laser-geometry \
    ros1-message-filters \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-ros \
    ros1-uuv-gazebo-plugins \
    ros1-uuv-sensor-ros-plugins-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-gazebo-plugins \
    ros1-gazebo-rosdev \
    ros1-geometry-msgs \
    ros1-image-transport \
    ros1-laser-geometry \
    ros1-message-filters \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-ros \
    ros1-uuv-gazebo-plugins \
    ros1-uuv-sensor-ros-plugins-msgs \
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

# matches with: https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_sensor_ros_plugins/0.6.13-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/uuv_sensor_ros_plugins"
SRC_URI = "git://github.com/uuvsimulator/uuv_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "032b8f83ff6067a20828a55d2096d07d1aea69b3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The thruster manager package"
AUTHOR = "Musa Morena Marcusso Manhaes <musa.marcusso@de.bosch.com>"
ROS_AUTHOR = "Musa Morena Marcusso Manhaes <musa.marcusso@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "uuv_simulator"
ROS_BPN = "uuv_thruster_manager"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    python-pyyaml \
    rospy \
    std-msgs \
    tf \
    uuv-assistants \
    uuv-gazebo-ros-plugins-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    geometry-msgs \
    joint-state-publisher \
    python-numpy \
    robot-state-publisher \
    rostest \
    rosunit \
    uuv-assistants \
    xacro \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_thruster_manager/0.6.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a545bf564216cf589258d7b69bd7a1bb"
SRC_URI[sha256sum] = "1ab65fc013e0365a7d680c40c82f7ed9a1d1ab91514376795bf5160f80f0cdea"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_thruster_manager-0.6.13-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('uuv-simulator', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('uuv-simulator', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/uuv-simulator/uuv-simulator_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/uuv-simulator/uuv-simulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/uuv-simulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/uuv-simulator/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}

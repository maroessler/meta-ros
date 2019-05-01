# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
AUTHOR = "Scott Niekum <sniekum@cs.umass.edu>"
ROS_AUTHOR = "Scott Niekum <sniekum@cs.umass.edu>"
HOMEPAGE = "http://ros.org/wiki/ar_track_alvar"
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=061abe8dc89f326789675967c8760541"

ROS_CN = "ar_track_alvar"
ROS_BPN = "ar_track_alvar"

ROS_BUILD_DEPENDS = " \
    ar-track-alvar-msgs \
    cmake-modules \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    libtinyxml \
    message-generation \
    pcl-conversions \
    pcl-ros \
    resource-retriever \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
    tf2 \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ar-track-alvar-msgs \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    libtinyxml \
    message-runtime \
    pcl-conversions \
    pcl-ros \
    resource-retriever \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
    tf2 \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ar-track-alvar-msgs \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    libtinyxml \
    message-runtime \
    pcl-conversions \
    pcl-ros \
    resource-retriever \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
    tf2 \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosbag \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ar_track_alvar-release/archive/release/melodic/ar_track_alvar/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b1e5d8f2aa503337cd9645b28ea25f3d"
SRC_URI[sha256sum] = "7b822678ef7330b5a3ecf5fd63547162178335534caf6bf4a739ad35c73d91ca"
S = "${WORKDIR}/ar_track_alvar-release-release-melodic-ar_track_alvar-0.7.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ar-track-alvar', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ar-track-alvar', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ar-track-alvar/ar-track-alvar_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ar-track-alvar/ar-track-alvar-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ar-track-alvar/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ar-track-alvar/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
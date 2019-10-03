# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Configuration and launch files for running ROS navigation on Fetch."
AUTHOR = "Russell Toris <rtoris@fetchrobotics.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://docs.fetchrobotics.com/navigation.html"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fetch_ros"
ROS_BPN = "fetch_navigation"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    amcl \
    base-local-planner \
    clear-costmap-recovery \
    costmap-2d \
    fetch-depth-layer \
    fetch-maps \
    map-server \
    move-base \
    move-base-msgs \
    navfn \
    rotate-recovery \
    slam-karto \
    voxel-grid \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_navigation/0.8.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6443cfaf3b2e2e6751957d5602016c99"
SRC_URI[sha256sum] = "255b963a72a9b38af080fad62427a9f9ed35ca395ed6d944880e1e9511d678c7"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_navigation-0.8.2-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('fetch-ros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('fetch-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/fetch-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/fetch-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}

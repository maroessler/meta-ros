# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Examples of how to use the xpp framework."
AUTHOR = "Alexander W. Winkler <alexander.w.winkler@gmail.com>"
ROS_AUTHOR = "Alexander W. Winkler"
HOMEPAGE = "http://github.com/leggedrobotics/xpp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "xpp"
ROS_BPN = "xpp_examples"

ROS_BUILD_DEPENDS = " \
    rosbag \
    roscpp \
    xpp-hyq \
    xpp-quadrotor \
    xpp-vis \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rosbag \
    roscpp \
    xpp-hyq \
    xpp-quadrotor \
    xpp-vis \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosbag \
    roscpp \
    xpp-hyq \
    xpp-quadrotor \
    xpp-vis \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_examples/1.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "23a4149ece12af11690fd4ec6df92289"
SRC_URI[sha256sum] = "df300b82eb4135d5c0343d75f1c11dc6e3c03df09b07582ab3a4f753338522df"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_examples-1.0.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('xpp', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('xpp', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/xpp/xpp_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/xpp/xpp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/xpp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/xpp/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}

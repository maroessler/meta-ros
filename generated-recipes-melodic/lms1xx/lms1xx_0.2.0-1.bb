# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The lms1xx package contains a basic ROS driver for the SICK LMS1xx line of LIDARs."
AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
ROS_AUTHOR = "Konrad Banachowicz"
HOMEPAGE = "http://ros.org/wiki/LMS1xx"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "lms1xx"
ROS_BPN = "lms1xx"

ROS_BUILD_DEPENDS = " \
    rosconsole-bridge \
    roscpp \
    roscpp-serialization \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rosconsole-bridge \
    roscpp \
    roscpp-serialization \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosconsole-bridge \
    roscpp \
    roscpp-serialization \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    roslint \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/clearpath-gbp/lms1xx-release/archive/release/melodic/lms1xx/0.2.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7a75b65d1ea9ef57a97a6849fbc0f2e8"
SRC_URI[sha256sum] = "9a9ff8a7991afb1c4a8d05f8b4518fd5a944da3dba605db67a4f55ea6c049f76"
S = "${WORKDIR}/lms1xx-release-release-melodic-lms1xx-0.2.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('lms1xx', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('lms1xx', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/lms1xx/lms1xx_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/lms1xx/lms1xx-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/lms1xx/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/lms1xx/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
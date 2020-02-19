# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The ddynamic_reconfigure package"
AUTHOR = "Hilario Tome <hilario.tome@pal-robotics.com>"
ROS_AUTHOR = "Hilario Tome <hilario.tome@pal-robotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ddynamic_reconfigure"
ROS_BPN = "ddynamic_reconfigure"

ROS_BUILD_DEPENDS = " \
    ros1-dynamic-reconfigure \
    ros1-roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-dynamic-reconfigure \
    ros1-roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-dynamic-reconfigure \
    ros1-roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pal-gbp/ddynamic_reconfigure/archive/release/melodic/ddynamic_reconfigure/0.2.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ddynamic_reconfigure"
SRC_URI = "git://github.com/pal-gbp/ddynamic_reconfigure;${ROS_BRANCH};protocol=https"
SRCREV = "4de8c040ccc88589ae552f8c5639080c75f0e2fd"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

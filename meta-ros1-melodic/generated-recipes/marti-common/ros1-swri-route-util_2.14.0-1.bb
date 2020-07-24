# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This library provides functionality to simplify working with the     navigation messages defined in marti_nav_msgs."
AUTHOR = "Marc Alban <malban@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_common"
ROS_BPN = "swri_route_util"

ROS_BUILD_DEPENDS = " \
    boost \
    ros1-marti-common-msgs \
    ros1-marti-nav-msgs \
    ros1-roscpp \
    ros1-swri-geometry-util \
    ros1-swri-math-util \
    ros1-swri-transform-util \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    ros1-marti-common-msgs \
    ros1-marti-nav-msgs \
    ros1-roscpp \
    ros1-swri-geometry-util \
    ros1-swri-math-util \
    ros1-swri-transform-util \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    ros1-marti-common-msgs \
    ros1-marti-nav-msgs \
    ros1-roscpp \
    ros1-swri-geometry-util \
    ros1-swri-math-util \
    ros1-swri-transform-util \
    ros1-visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_route_util/2.14.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/swri_route_util"
SRC_URI = "git://github.com/swri-robotics-gbp/marti_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "1724b231dd8625d8d942a4f0d98aee6259705e61"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

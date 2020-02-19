# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The roomba_stage package"
AUTHOR = "William Woodall <william@osrfoundation.org>"
ROS_AUTHOR = "Gonçalo Cabrita"
HOMEPAGE = "http://ros.org/wiki/roomba_stage"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation_tutorials"
ROS_BPN = "roomba_stage"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-fake-localization \
    ros1-map-server \
    ros1-move-base \
    ros1-stage-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-fake-localization \
    ros1-map-server \
    ros1-move-base \
    ros1-stage-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation_tutorials-release/archive/release/melodic/roomba_stage/0.2.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/roomba_stage"
SRC_URI = "git://github.com/ros-gbp/navigation_tutorials-release;${ROS_BRANCH};protocol=https"
SRCREV = "d412997ef1cca54557d29f56db7549fd4bc8bdf5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

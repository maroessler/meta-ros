# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Leg Detector using a machine learning approach to find leg-like patterns of laser scanner readings."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "Caroline Pantofaru"
HOMEPAGE = "http://ros.org/wiki/leg_detector"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "people"
ROS_BPN = "leg_detector"

ROS_BUILD_DEPENDS = " \
    ros1-bfl \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-laser-geometry \
    ros1-message-filters \
    ros1-people-msgs \
    ros1-people-tracking-filter \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-bfl \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-laser-geometry \
    ros1-message-filters \
    ros1-people-msgs \
    ros1-people-tracking-filter \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-bfl \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-laser-filters \
    ros1-laser-geometry \
    ros1-map-laser \
    ros1-message-filters \
    ros1-people-msgs \
    ros1-people-tracking-filter \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/OSUrobotics/people-release/archive/release/melodic/leg_detector/1.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/leg_detector"
SRC_URI = "git://github.com/OSUrobotics/people-release;${ROS_BRANCH};protocol=https"
SRCREV = "1deeccb980565583bd1ae8d4012e974263e9604d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Launch and configuration files for move_base, localization etc. on the MiR robot."
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
HOMEPAGE = "https://github.com/dfki-ric/mir_robot"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mir_robot"
ROS_BPN = "mir_navigation"

ROS_BUILD_DEPENDS = " \
    ros1-roslaunch \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-amcl \
    ros1-base-local-planner \
    ros1-dwb-critics \
    ros1-dwb-local-planner \
    ros1-dwb-plugins \
    ros1-map-server \
    ros1-mir-driver \
    ros1-mir-dwb-critics \
    ros1-move-base \
    ros1-nav-core-adapter \
    ros1-sbpl-lattice-planner \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_navigation/1.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mir_navigation"
SRC_URI = "git://github.com/uos-gbp/mir_robot-release;${ROS_BRANCH};protocol=https"
SRCREV = "55e23da41541d3a0189e4128ab895c92c5709742"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
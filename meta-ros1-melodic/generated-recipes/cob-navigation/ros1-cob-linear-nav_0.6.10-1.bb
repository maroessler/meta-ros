# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "cob_linear_nav provides a simple navigation instrument driving on a linear path from current position to goal without any planning or obstacle avoidance capabilites.     Obstacle avoidance should be carried out in other package, e.g. <a href="http://ros.org/wiki/cob_collision_velocity_filter">cob_collision_velocity_filter</a>."
AUTHOR = "Felix Zeltner <fez@ipa.fraunhofer.de>"
ROS_AUTHOR = "Matthias Gruhler <mig@ipa.fraunhofer.de>"
HOMEPAGE = "http://ros.org/wiki/cob_linear_nav"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_navigation"
ROS_BPN = "cob_linear_nav"

ROS_BUILD_DEPENDS = " \
    ros1-actionlib \
    ros1-angles \
    ros1-cob-srvs \
    ros1-geometry-msgs \
    ros1-move-base-msgs \
    ros1-nav-msgs \
    ros1-roscpp \
    ros1-tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-actionlib \
    ros1-angles \
    ros1-cob-srvs \
    ros1-geometry-msgs \
    ros1-move-base-msgs \
    ros1-nav-msgs \
    ros1-roscpp \
    ros1-tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-actionlib \
    ros1-angles \
    ros1-cob-srvs \
    ros1-geometry-msgs \
    ros1-move-base-msgs \
    ros1-nav-msgs \
    ros1-roscpp \
    ros1-tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_linear_nav/0.6.10-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_linear_nav"
SRC_URI = "git://github.com/ipa320/cob_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "56ad120f389d76f1171e8996370d8bbb9d786cd8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

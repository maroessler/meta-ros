# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Launchfiles to use Jackal in Gazebo."
AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
ROS_AUTHOR = "Mike Purvis"
HOMEPAGE = "http://wiki.ros.org/jackal_gazebo"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jackal_simulator"
ROS_BPN = "jackal_gazebo"

ROS_BUILD_DEPENDS = " \
    ros1-roslaunch \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-gazebo-plugins \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-hector-gazebo-plugins \
    ros1-jackal-control \
    ros1-jackal-description \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-gazebo-plugins \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-hector-gazebo-plugins \
    ros1-jackal-control \
    ros1-jackal-description \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/jackal_simulator-release/archive/release/melodic/jackal_gazebo/0.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/jackal_gazebo"
SRC_URI = "git://github.com/clearpath-gbp/jackal_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "b53daa4bead524adec786a3679a47302cbfbbc27"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
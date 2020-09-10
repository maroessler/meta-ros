# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Launch files and code for autonomous navigation of the Ridgeback using Google Cartographer"
AUTHOR = "Tony Baltovski <tbaltovski@clearpathrobotics.com>"
ROS_AUTHOR = "Aditya Bhattacharjee <abhattacharjee@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ridgeback_cartographer_navigation"
ROS_BPN = "ridgeback_cartographer_navigation"

ROS_BUILD_DEPENDS = " \
    ros1-roslaunch \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-cartographer-ros \
    ros1-map-server \
    ros1-move-base \
    ros1-ridgeback-navigation \
    ros1-urdf \
    ros1-xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-cartographer-ros \
    ros1-map-server \
    ros1-move-base \
    ros1-ridgeback-navigation \
    ros1-urdf \
    ros1-xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/ridgeback_cartographer_navigation-release/archive/release/melodic/ridgeback_cartographer_navigation/0.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ridgeback_cartographer_navigation"
SRC_URI = "git://github.com/clearpath-gbp/ridgeback_cartographer_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "06e8370b930726466688e94a2aec087afcd68c88"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
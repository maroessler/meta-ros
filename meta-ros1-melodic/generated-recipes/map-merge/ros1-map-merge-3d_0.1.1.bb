# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Merging multiple 3D maps, represented as pointclouds,   without knowledge of initial positions of robots."
AUTHOR = "Jiri Horner <laeqten@gmail.com>"
ROS_AUTHOR = "Jiri Horner <laeqten@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/map_merge_3d"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "map_merge"
ROS_BPN = "map_merge_3d"

ROS_BUILD_DEPENDS = " \
    ros1-pcl-ros \
    ros1-roscpp \
    ros1-tf2-eigen \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-pcl-ros \
    ros1-roscpp \
    ros1-tf2-eigen \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-pcl-ros \
    ros1-roscpp \
    ros1-tf2-eigen \
    ros1-tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-roslaunch \
    ros1-rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/hrnr/map-merge-release/archive/release/melodic/map_merge_3d/0.1.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/map_merge_3d"
SRC_URI = "git://github.com/hrnr/map-merge-release;${ROS_BRANCH};protocol=https"
SRCREV = "93aff190ed50b2de8454fe9372ac25d947a06780"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
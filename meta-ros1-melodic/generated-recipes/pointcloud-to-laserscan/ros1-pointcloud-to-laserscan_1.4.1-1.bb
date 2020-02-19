# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Converts a 3D Point Cloud into a 2D laser scan. This is useful for making devices like the Kinect appear like a laser scanner for 2D-based algorithms (e.g. laser-based SLAM)."
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
ROS_AUTHOR = "Paul Bovbel <paul@bovbel.com>"
HOMEPAGE = "http://ros.org/wiki/perception_pcl"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "pointcloud_to_laserscan"
ROS_BPN = "pointcloud_to_laserscan"

ROS_BUILD_DEPENDS = " \
    ros1-laser-geometry \
    ros1-message-filters \
    ros1-nodelet \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf2 \
    ros1-tf2-ros \
    ros1-tf2-sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-laser-geometry \
    ros1-message-filters \
    ros1-nodelet \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf2 \
    ros1-tf2-ros \
    ros1-tf2-sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-laser-geometry \
    ros1-message-filters \
    ros1-nodelet \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf2 \
    ros1-tf2-ros \
    ros1-tf2-sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/pointcloud_to_laserscan-release/archive/release/melodic/pointcloud_to_laserscan/1.4.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pointcloud_to_laserscan"
SRC_URI = "git://github.com/ros-gbp/pointcloud_to_laserscan-release;${ROS_BRANCH};protocol=https"
SRCREV = "e554bbbd36e9c7e1bf810f6d5d5730ad636d4ee7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

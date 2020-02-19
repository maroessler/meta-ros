# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Point cloud conversions for rslidar 3D LIDARs."
AUTHOR = "Abraham Monrroy <abrahammonrroy@yahoo.com>"
ROS_AUTHOR = "Tony Zhang <tony.zhang@robosense.cn>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "robosense"
ROS_BPN = "rslidar_pointcloud"

ROS_BUILD_DEPENDS = " \
    ros1-angles \
    ros1-dynamic-reconfigure \
    ros1-nodelet \
    ros1-pcl-conversions \
    ros1-pcl-ros \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-roslaunch \
    ros1-roslib \
    ros1-rostest \
    ros1-rslidar-driver \
    ros1-rslidar-msgs \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-angles \
    ros1-dynamic-reconfigure \
    ros1-nodelet \
    ros1-pcl-ros \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-roslib \
    ros1-rslidar-driver \
    ros1-rslidar-msgs \
    ros1-sensor-msgs \
    ros1-tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-angles \
    ros1-dynamic-reconfigure \
    ros1-nodelet \
    ros1-pcl-ros \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-roslib \
    ros1-rslidar-driver \
    ros1-rslidar-msgs \
    ros1-sensor-msgs \
    ros1-tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/CPFL/robosense-release/archive/release/melodic/rslidar_pointcloud/1.0.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rslidar_pointcloud"
SRC_URI = "git://github.com/CPFL/robosense-release;${ROS_BRANCH};protocol=https"
SRCREV = "7dbdafb02e7f0637e1305b3c7a806b707b5f62c1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

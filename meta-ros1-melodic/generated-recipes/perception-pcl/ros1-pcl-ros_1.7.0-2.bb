# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred   bridge for 3D applications involving n-D Point Clouds and 3D geometry   processing in ROS."
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
ROS_AUTHOR = "Open Perception"
HOMEPAGE = "http://ros.org/wiki/perception_pcl"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "perception_pcl"
ROS_BPN = "pcl_ros"

ROS_BUILD_DEPENDS = " \
    libeigen \
    pcl \
    ros1-cmake-modules \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-message-filters \
    ros1-nodelet \
    ros1-nodelet-topic-tools \
    ros1-pcl-conversions \
    ros1-pcl-msgs \
    ros1-pluginlib \
    ros1-rosbag \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-roslib \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-eigen \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    pcl \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-message-filters \
    ros1-nodelet \
    ros1-nodelet-topic-tools \
    ros1-pcl-conversions \
    ros1-pcl-msgs \
    ros1-pluginlib \
    ros1-rosbag \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-eigen \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    pcl \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-message-filters \
    ros1-nodelet \
    ros1-nodelet-topic-tools \
    ros1-pcl-conversions \
    ros1-pcl-msgs \
    ros1-pluginlib \
    ros1-rosbag \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-eigen \
    ros1-tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/perception_pcl-release/archive/release/melodic/pcl_ros/1.7.0-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pcl_ros"
SRC_URI = "git://github.com/ros-gbp/perception_pcl-release;${ROS_BRANCH};protocol=https"
SRCREV = "f3712859d2f85eb557ef30b88b7243827d828f64"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

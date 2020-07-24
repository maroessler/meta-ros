# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The follower demo was implemented using a 360 Laser Distance Sensor LDS-01. The classification algorithm is used based on previous fitting with samples of person and obstacles positions to take actions. It follows someone in front of the robot within a 50 centimeter range and 140 degrees."
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Gilbert <kkjong@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/turtlebot3_follower"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "turtlebot3_applications"
ROS_BPN = "turtlebot3_follower"

ROS_BUILD_DEPENDS = " \
    ros1-geometry-msgs \
    ros1-nav-msgs \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-geometry-msgs \
    ros1-nav-msgs \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-geometry-msgs \
    ros1-nav-msgs \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ROBOTIS-GIT-release/turtlebot3_applications-release/archive/release/melodic/turtlebot3_follower/1.1.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/turtlebot3_follower"
SRC_URI = "git://github.com/ROBOTIS-GIT-release/turtlebot3_applications-release;${ROS_BRANCH};protocol=https"
SRCREV = "4cf0d5c2aa04157e5e4ec355a9357f760e167e27"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

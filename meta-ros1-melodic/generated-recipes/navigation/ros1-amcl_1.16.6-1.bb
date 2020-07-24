# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "<p>             amcl is a probabilistic localization system for a robot moving in             2D. It implements the adaptive (or KLD-sampling) Monte Carlo             localization approach (as described by Dieter Fox), which uses a             particle filter to track the pose of a robot against a known map.         </p>         <p>             This node is derived, with thanks, from Andrew Howard's excellent             'amcl' Player driver.         </p>"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "Brian P. Gerkey"
HOMEPAGE = "http://wiki.ros.org/amcl"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=24;endline=24;md5=58d727014cda5ed405b7fb52666a1f97"

ROS_CN = "navigation"
ROS_BPN = "amcl"

ROS_BUILD_DEPENDS = " \
    ros1-diagnostic-updater \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-message-filters \
    ros1-nav-msgs \
    ros1-rosbag \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-diagnostic-updater \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-nav-msgs \
    ros1-rosbag \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-tf2 \
    ros1-tf2-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-diagnostic-updater \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-nav-msgs \
    ros1-rosbag \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-tf2 \
    ros1-tf2-msgs \
    ros1-tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-map-server \
    ros1-python-orocos-kdl \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation-release/archive/release/melodic/amcl/1.16.6-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/amcl"
SRC_URI = "git://github.com/ros-gbp/navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "6dd006f3bd459e2c0a2e859516fd9c73df38a770"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

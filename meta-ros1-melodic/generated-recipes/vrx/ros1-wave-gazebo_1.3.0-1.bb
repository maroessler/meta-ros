# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package contains Gazebo media, models and worlds for simulating     water waves and dynamics for surface vessels. There are ROS      launch scripts that may be used to launch a Gazebo session and     load a world and models using `roslaunch`."
AUTHOR = "Rhys Mainwaring <rhys.mainwaring@me.com>"
ROS_AUTHOR = "Rhys Mainwaring <rhys.mainwaring@me.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "TBD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=17de80a4e910d574ec9f29d9922c3248"

ROS_CN = "vrx"
ROS_BPN = "wave_gazebo"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ruby} \
    ros1-xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-gazebo-ros \
    ros1-wave-gazebo-plugins \
    ros1-xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/vrx-release/archive/release/melodic/wave_gazebo/1.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/wave_gazebo"
SRC_URI = "git://github.com/ros-gbp/vrx-release;${ROS_BRANCH};protocol=https"
SRCREV = "89bbf486903b84c0fd543a6b130f3901f6cac6fa"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

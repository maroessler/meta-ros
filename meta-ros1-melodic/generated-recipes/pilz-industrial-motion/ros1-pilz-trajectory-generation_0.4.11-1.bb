# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The pilz_trajectory_generation package containing the MoveIt! plugin pilz_command_planner."
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "https://wiki.ros.org/pilz_trajectory_generation"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "pilz_industrial_motion"
ROS_BPN = "pilz_trajectory_generation"

ROS_BUILD_DEPENDS = " \
    ros1-eigen-conversions \
    ros1-kdl-conversions \
    ros1-moveit-core \
    ros1-moveit-msgs \
    ros1-moveit-ros-move-group \
    ros1-moveit-ros-planning \
    ros1-moveit-ros-planning-interface \
    ros1-orocos-kdl \
    ros1-pilz-extensions \
    ros1-pilz-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2 \
    ros1-tf2-eigen \
    ros1-tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-eigen-conversions \
    ros1-kdl-conversions \
    ros1-moveit-core \
    ros1-moveit-msgs \
    ros1-moveit-ros-move-group \
    ros1-moveit-ros-planning \
    ros1-moveit-ros-planning-interface \
    ros1-orocos-kdl \
    ros1-pilz-extensions \
    ros1-pilz-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2 \
    ros1-tf2-eigen \
    ros1-tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-eigen-conversions \
    ros1-kdl-conversions \
    ros1-moveit-core \
    ros1-moveit-msgs \
    ros1-moveit-ros-move-group \
    ros1-moveit-ros-planning \
    ros1-moveit-ros-planning-interface \
    ros1-orocos-kdl \
    ros1-pilz-extensions \
    ros1-pilz-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2 \
    ros1-tf2-eigen \
    ros1-tf2-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-cmake-modules \
    ros1-code-coverage \
    ros1-pilz-industrial-motion-testutils \
    ros1-pilz-testutils \
    ros1-prbt-moveit-config \
    ros1-prbt-pg70-support \
    ros1-prbt-support \
    ros1-rostest \
    ros1-rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_trajectory_generation/0.4.11-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pilz_trajectory_generation"
SRC_URI = "git://github.com/PilzDE/pilz_industrial_motion-release;${ROS_BRANCH};protocol=https"
SRCREV = "700ef8e3f584d0138027f06d17751a3181c9e9ff"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The rotors_gazebo package"
AUTHOR = "Fadri Furrer <fadri.furrer@mavt.ethz.ch>"
ROS_AUTHOR = "Fadri Furrer"
HOMEPAGE = "https://github.com/ethz-asl/rotors_simulator"
SECTION = "devel"
LICENSE = "ASL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

ROS_CN = "rotors_simulator"
ROS_BPN = "rotors_gazebo"

ROS_BUILD_DEPENDS = " \
    ros1-gazebo-msgs \
    ros1-gazebo-plugins \
    ros1-geometry-msgs \
    ros1-joy \
    ros1-mav-msgs \
    ros1-roscpp \
    ros1-rotors-gazebo-plugins \
    ros1-sensor-msgs \
    ros1-xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-gazebo-msgs \
    ros1-gazebo-plugins \
    ros1-geometry-msgs \
    ros1-joy \
    ros1-mav-msgs \
    ros1-roscpp \
    ros1-rotors-gazebo-plugins \
    ros1-sensor-msgs \
    ros1-xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-gazebo-msgs \
    ros1-gazebo-plugins \
    ros1-geometry-msgs \
    ros1-joy \
    ros1-mav-msgs \
    ros1-roscpp \
    ros1-rotors-gazebo-plugins \
    ros1-sensor-msgs \
    ros1-xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_gazebo/2.2.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rotors_gazebo"
SRC_URI = "git://github.com/ethz-asl/rotors_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "8d4352b09ce5e08eea68ad292a7bb3d3d251ae36"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "An underwater dynamics module"
AUTHOR = "Mario Prats <marioprats@gmail.com>"
ROS_AUTHOR = "Arnau Carrera"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "underwater_simulation"
ROS_BPN = "underwater_vehicle_dynamics"

ROS_BUILD_DEPENDS = " \
    ros1-geometry-msgs \
    ros1-nav-msgs \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    ros1-tf-conversions \
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
    ros1-tf \
    ros1-tf-conversions \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-geometry-msgs \
    ros1-nav-msgs \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    ros1-tf-conversions \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uji-ros-pkg/underwater_simulation-release/archive/release/melodic/underwater_vehicle_dynamics/1.4.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/underwater_vehicle_dynamics"
SRC_URI = "git://github.com/uji-ros-pkg/underwater_simulation-release;${ROS_BRANCH};protocol=https"
SRCREV = "2f7636ce889b6acb615988d6de7bfdeb1ebdd25c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

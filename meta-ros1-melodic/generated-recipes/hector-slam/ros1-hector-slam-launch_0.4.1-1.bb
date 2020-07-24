# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "hector_slam_launch contains launch files for launching hector_slam with different robot systems/setups/postprocessing scenarios."
AUTHOR = "Johannes Meyer <meyer@fsr.tu-darmstadt.de>"
ROS_AUTHOR = "Stefan Kohlbrecher <kohlbrecher@sim.tu-darmstadt.de>"
HOMEPAGE = "http://ros.org/wiki/hector_slam_launch"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "hector_slam"
ROS_BPN = "hector_slam_launch"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-hector-geotiff \
    ros1-hector-geotiff-plugins \
    ros1-hector-map-server \
    ros1-hector-mapping \
    ros1-hector-trajectory-server \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-hector-geotiff \
    ros1-hector-geotiff-plugins \
    ros1-hector-map-server \
    ros1-hector-mapping \
    ros1-hector-trajectory-server \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_slam_launch/0.4.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/hector_slam_launch"
SRC_URI = "git://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release;${ROS_BRANCH};protocol=https"
SRCREV = "f5cff38ba29a245a909472869c67a3abc9a2fa56"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

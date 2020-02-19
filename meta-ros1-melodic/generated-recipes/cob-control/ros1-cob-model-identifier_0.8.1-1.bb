# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The cob_model_identifier package"
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Christoph Mark <fxm-cm@ipa.fhg.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_control"
ROS_BPN = "cob_model_identifier"

ROS_BUILD_DEPENDS = " \
    boost \
    ros1-cmake-modules \
    ros1-geometry-msgs \
    ros1-kdl-parser \
    ros1-orocos-kdl \
    ros1-roscpp \
    ros1-roslint \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    ros1-cmake-modules \
    ros1-geometry-msgs \
    ros1-kdl-parser \
    ros1-orocos-kdl \
    ros1-roscpp \
    ros1-roslint \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    ros1-cmake-modules \
    ros1-geometry-msgs \
    ros1-kdl-parser \
    ros1-orocos-kdl \
    ros1-roscpp \
    ros1-roslint \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_model_identifier/0.8.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_model_identifier"
SRC_URI = "git://github.com/ipa320/cob_control-release;${ROS_BRANCH};protocol=https"
SRCREV = "aa9e8a7c8a41b8d42c14c58eea78be5780eaeb34"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

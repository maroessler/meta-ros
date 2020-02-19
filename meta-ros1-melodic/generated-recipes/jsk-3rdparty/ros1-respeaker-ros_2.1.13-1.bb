# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The respeaker_ros package"
AUTHOR = "Yuki Furuta <furushchev@jsk.imi.i.u-tokyo.ac.jp>"
ROS_AUTHOR = "Yuki Furuta <furushchev@jsk.imi.i.u-tokyo.ac.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=211ba54883815de9f52a3dcd9f281523"

ROS_CN = "jsk_3rdparty"
ROS_BPN = "respeaker_ros"

ROS_BUILD_DEPENDS = " \
    ros1-dynamic-reconfigure \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-pyaudio} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-pyusb-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-speechrecognition-pip} \
    python-numpy \
    ros1-angles \
    ros1-audio-common-msgs \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-std-msgs \
    ros1-tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-pyaudio} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-pyusb-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-speechrecognition-pip} \
    python-numpy \
    ros1-angles \
    ros1-audio-common-msgs \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-std-msgs \
    ros1-tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-jsk-tools \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/respeaker_ros/2.1.13-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/respeaker_ros"
SRC_URI = "git://github.com/tork-a/jsk_3rdparty-release;${ROS_BRANCH};protocol=https"
SRCREV = "a33c4414578320646ff7cd948be0cfa50f44d229"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

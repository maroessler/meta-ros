# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A simple USB camera driver for the FLIR BOSON using OpenCV"
AUTHOR = "AutonomouStuff Software Development Team <software@autonomoustuff.com>"
ROS_AUTHOR = "Joe Driscoll <jdriscoll@autonomoustuff.com>"
HOMEPAGE = "http://wiki.ros.org/flir_boson_usb"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "flir_boson_usb"
ROS_BPN = "flir_boson_usb"

ROS_BUILD_DEPENDS = " \
    ros1-camera-info-manager \
    ros1-cv-bridge \
    ros1-image-transport \
    ros1-nodelet \
    ros1-roscpp \
    ros1-roslint \
    ros1-sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-camera-info-manager \
    ros1-cv-bridge \
    ros1-image-transport \
    ros1-nodelet \
    ros1-roscpp \
    ros1-sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-camera-info-manager \
    ros1-cv-bridge \
    ros1-image-transport \
    ros1-nodelet \
    ros1-roscpp \
    ros1-sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/astuff/flir_boson_usb-release/archive/release/melodic/flir_boson_usb/1.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/flir_boson_usb"
SRC_URI = "git://github.com/astuff/flir_boson_usb-release;${ROS_BRANCH};protocol=https"
SRCREV = "e6326a5e50bb7396cf35d1fa734a96d680f1941d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

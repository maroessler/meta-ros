# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ntpd_driver sends TimeReference message time to ntpd server"
AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
ROS_AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ntpd_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ntpd_driver"
ROS_BPN = "ntpd_driver"

ROS_BUILD_DEPENDS = " \
    poco \
    ros1-cmake-modules \
    ros1-message-generation \
    ros1-message-runtime \
    ros1-roscpp \
    ros1-sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    poco \
    ros1-cmake-modules \
    ros1-message-generation \
    ros1-message-runtime \
    ros1-roscpp \
    ros1-sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    poco \
    ros1-cmake-modules \
    ros1-message-generation \
    ros1-message-runtime \
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

# matches with: https://github.com/vooon/ntpd_driver-release/archive/release/melodic/ntpd_driver/1.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ntpd_driver"
SRC_URI = "git://github.com/vooon/ntpd_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "7858973136c8888f2901c90c1c5647eae8de0de8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

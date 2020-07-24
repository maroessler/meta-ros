# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Playstation 3 SIXAXIS or DUAL SHOCK 3 joystick driver.     Driver for the Sony PlayStation 3 SIXAXIS or DUAL SHOCK 3     joysticks. In its current state, this driver is not compatible     with the use of other Bluetooth HID devices. The driver listens     for a connection on the HID ports, starts the joystick     streaming data, and passes the data to the Linux uinput device     so that it shows up as a normal joystick."
AUTHOR = "Jonathan Bohren <jbo@jhu.edu>"
ROS_AUTHOR = "Blaise Gassend"
HOMEPAGE = "http://www.ros.org/wiki/ps3joy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "joystick_drivers"
ROS_BPN = "ps3joy"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_bluez} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libusb-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-bluez} \
    joystick \
    ros1-diagnostic-msgs \
    ros1-rosgraph \
    ros1-roslint \
    ros1-rospy \
    ros1-sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_bluez} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libusb-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-bluez} \
    joystick \
    ros1-diagnostic-msgs \
    ros1-rosgraph \
    ros1-rospy \
    ros1-sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_bluez} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libusb-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-bluez} \
    joystick \
    ros1-diagnostic-msgs \
    ros1-rosgraph \
    ros1-rospy \
    ros1-sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/ps3joy/1.14.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ps3joy"
SRC_URI = "git://github.com/ros-gbp/joystick_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "8b86921a8e0d3e0f2de5968d84a507586886816b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

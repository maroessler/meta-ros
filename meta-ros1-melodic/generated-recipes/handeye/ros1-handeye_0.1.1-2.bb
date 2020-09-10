# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The handeye package"
AUTHOR = "Francisco Suarez-Ruiz <fsuarez6@gmail.com>"
ROS_AUTHOR = "Francisco Suarez-Ruiz <fsuarez6@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/handeye"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=f5654d47d02d927c4f7a04f0a51abaa1"

ROS_CN = "handeye"
ROS_BPN = "handeye"

ROS_BUILD_DEPENDS = " \
    ros1-geometry-msgs \
    ros1-message-generation \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-geometry-msgs \
    ros1-message-runtime \
    ros1-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-matplotlib} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-scipy} \
    python-enum34 \
    python-numpy \
    ros1-baldor \
    ros1-criutils \
    ros1-geometry-msgs \
    ros1-message-runtime \
    ros1-std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/crigroup/handeye-release/archive/release/melodic/handeye/0.1.1-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/handeye"
SRC_URI = "git://github.com/crigroup/handeye-release;${ROS_BRANCH};protocol=https"
SRCREV = "3050519584094217a54fed21113b889265952809"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
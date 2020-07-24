# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Yujin Robot's open-source control software"
AUTHOR = "Jihoon Lee <jihoonl@yujinrobot.com>"
ROS_AUTHOR = "Yujin Robot"
HOMEPAGE = "http://ros.org/wiki/yujin_ocs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "yujin_ocs"
ROS_BPN = "yujin_ocs"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-yocs-cmd-vel-mux \
    ros1-yocs-controllers \
    ros1-yocs-diff-drive-pose-controller \
    ros1-yocs-joyop \
    ros1-yocs-keyop \
    ros1-yocs-math-toolkit \
    ros1-yocs-rapps \
    ros1-yocs-safety-controller \
    ros1-yocs-velocity-smoother \
    ros1-yocs-virtual-sensor \
    ros1-yocs-waypoints-navi \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-yocs-cmd-vel-mux \
    ros1-yocs-controllers \
    ros1-yocs-diff-drive-pose-controller \
    ros1-yocs-joyop \
    ros1-yocs-keyop \
    ros1-yocs-math-toolkit \
    ros1-yocs-rapps \
    ros1-yocs-safety-controller \
    ros1-yocs-velocity-smoother \
    ros1-yocs-virtual-sensor \
    ros1-yocs-waypoints-navi \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yujin_ocs/0.8.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/yujin_ocs"
SRC_URI = "git://github.com/yujinrobot-release/yujin_ocs-release;${ROS_BRANCH};protocol=https"
SRCREV = "9e78f68857af6a4fa0e5a448c85b3f5bf6cf0ce8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Non-ROS software for Kobuki, Yujin Robot's mobile research base."
AUTHOR = "Daniel Stonier <stonier@yujinrobot.com>"
ROS_AUTHOR = "Daniel Stonier <stonier@yujinrobot.com>"
HOMEPAGE = "http://ros.org/wiki/kobuki_core"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "kobuki_core"
ROS_BPN = "kobuki_core"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-kobuki-dock-drive \
    ros1-kobuki-driver \
    ros1-kobuki-ftdi \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-kobuki-dock-drive \
    ros1-kobuki-driver \
    ros1-kobuki-ftdi \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/kobuki_core-release/archive/release/melodic/kobuki_core/0.7.8-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/kobuki_core"
SRC_URI = "git://github.com/yujinrobot-release/kobuki_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "b058239dfa396df2d2f123002920030c6d88ee5d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

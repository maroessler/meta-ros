# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Includes emacs scripts, ros tool alias generator, and launch doc generator."
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Ryohei Ueda (ueda@jsk.t.u-tokyo.ac.jp)"
HOMEPAGE = "http://ros.org/wiki/jsk_tools"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "jsk_common"
ROS_BPN = "jsk_tools"

ROS_BUILD_DEPENDS = " \
    git \
    ros1-rosgraph-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_iproute2} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-colorama} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-percol} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-progressbar} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-pygithub3} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-requests} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-slacker-cli} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-tabulate-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-texttable} \
    python-rosdep \
    ros1-cv-bridge \
    ros1-jsk-gui-msgs \
    ros1-jsk-network-tools \
    ros1-jsk-topic-tools \
    ros1-rosbag \
    ros1-rosgraph-msgs \
    ros1-rospy \
    ros1-rqt-reconfigure \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_iproute2} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-colorama} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-percol} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-progressbar} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-pygithub3} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-requests} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-slacker-cli} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-tabulate-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-texttable} \
    python-rosdep \
    ros1-cv-bridge \
    ros1-jsk-gui-msgs \
    ros1-jsk-network-tools \
    ros1-jsk-topic-tools \
    ros1-rosbag \
    ros1-rosgraph-msgs \
    ros1-rospy \
    ros1-rqt-reconfigure \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-roslint \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_common-release/archive/release/melodic/jsk_tools/2.2.10-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/jsk_tools"
SRC_URI = "git://github.com/tork-a/jsk_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "60b907647377a49dcb4eef68fa28178cf35abfe0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

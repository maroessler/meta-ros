# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "pddl planner wrappers"
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Ryohei Ueda (ueda@jsk.t.u-tokyo.ac.jp)"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "jsk_planning"
ROS_BPN = "pddl_planner"

ROS_BUILD_DEPENDS = " \
    ros1-actionlib \
    ros1-pddl-msgs \
    ros1-rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_time} \
    ros1-actionlib \
    ros1-downward \
    ros1-ff \
    ros1-ffha \
    ros1-lpg-planner \
    ros1-pddl-msgs \
    ros1-rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_time} \
    ros1-actionlib \
    ros1-downward \
    ros1-ff \
    ros1-ffha \
    ros1-lpg-planner \
    ros1-pddl-msgs \
    ros1-rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_planning-release/archive/release/melodic/pddl_planner/0.1.12-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pddl_planner"
SRC_URI = "git://github.com/tork-a/jsk_planning-release;${ROS_BRANCH};protocol=https"
SRCREV = "4336e282179a249f6e1a0168fedcaea6a15bac43"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

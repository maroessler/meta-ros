# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Roboception rc_visard support meta package"
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
ROS_AUTHOR = "Heiko Hirschmueller <heiko.hirschmueller@roboception.de>"
HOMEPAGE = "http://roboception.com/rc_visard"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rc_visard"
ROS_BPN = "rc_visard"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-rc-hand-eye-calibration-client \
    ros1-rc-pick-client \
    ros1-rc-roi-manager-gui \
    ros1-rc-silhouettematch-client \
    ros1-rc-tagdetect-client \
    ros1-rc-visard-description \
    ros1-rc-visard-driver \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_visard/3.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rc_visard"
SRC_URI = "git://github.com/roboception-gbp/rc_visard-release;${ROS_BRANCH};protocol=https"
SRCREV = "befe0119af970a5ef19789f26aa3ebd43003a233"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

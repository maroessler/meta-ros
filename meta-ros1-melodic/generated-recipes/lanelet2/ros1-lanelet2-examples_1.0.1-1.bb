# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Examples for working with Lanelet2"
AUTHOR = "Fabian Poggenhans <fabian.poggenhans@kit.edu>"
ROS_AUTHOR = "Fabian Poggenhans <fabian.poggenhans@kit.edu>"
HOMEPAGE = "https://github.com/fzi-forschungszentrum-informatik/lanelet2.git"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "lanelet2"
ROS_BPN = "lanelet2_examples"

ROS_BUILD_DEPENDS = " \
    ros1-lanelet2-core \
    ros1-lanelet2-io \
    ros1-lanelet2-projection \
    ros1-lanelet2-python \
    ros1-lanelet2-routing \
    ros1-lanelet2-traffic-rules \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
    ros1-mrt-cmake-modules-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-lanelet2-core \
    ros1-lanelet2-io \
    ros1-lanelet2-projection \
    ros1-lanelet2-python \
    ros1-lanelet2-routing \
    ros1-lanelet2-traffic-rules \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ros1-mrt-cmake-modules-native \
"

ROS_EXEC_DEPENDS = " \
    ros1-lanelet2-core \
    ros1-lanelet2-io \
    ros1-lanelet2-projection \
    ros1-lanelet2-python \
    ros1-lanelet2-routing \
    ros1-lanelet2-traffic-rules \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
    ros1-rosbash \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fzi-forschungszentrum-informatik/lanelet2-release/archive/release/melodic/lanelet2_examples/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/lanelet2_examples"
SRC_URI = "git://github.com/fzi-forschungszentrum-informatik/lanelet2-release;${ROS_BRANCH};protocol=https"
SRCREV = "dadd82ddff7d33237e3f8080397882a5b9e3b842"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

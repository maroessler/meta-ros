# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A ROS driver for the SICK TiM and SICK MRS series of lidars.     This package is based on the original sick_tim-repository of Martin Günther et al."
AUTHOR = "Michael Lehning <michael.lehning@lehning.de>"
ROS_AUTHOR = "Michael Lehning <michael.lehning@lehning.de>"
HOMEPAGE = "http://wiki.ros.org/sick_scan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "sick_scan"
ROS_BPN = "sick_scan"

ROS_BUILD_DEPENDS = " \
    ros1-diagnostic-updater \
    ros1-dynamic-reconfigure \
    ros1-message-generation \
    ros1-roscpp \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-tf2 \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-roscpp \
    ros1-rospy \
    ros1-tf \
    ros1-tf2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-diagnostic-updater \
    ros1-dynamic-reconfigure \
    ros1-message-runtime \
    ros1-perception-pcl \
    ros1-roscpp \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-tf2 \
    ros1-visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SICKAG/sick_scan-release/archive/release/melodic/sick_scan/1.7.7-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/sick_scan"
SRC_URI = "git://github.com/SICKAG/sick_scan-release;${ROS_BRANCH};protocol=https"
SRCREV = "0b34bec6733b3776544bfecca6e833bba4796681"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "swri_image_util"
AUTHOR = "Kris Kozak <kkozak@swri.org>"
ROS_AUTHOR = "Kris Kozak"
HOMEPAGE = "https://github.com/swri-robotics/marti_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_common"
ROS_BPN = "swri_image_util"

ROS_BUILD_DEPENDS = " \
    boost \
    libeigen \
    ros1-camera-calibration-parsers \
    ros1-cv-bridge \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-image-transport \
    ros1-message-filters \
    ros1-nav-msgs \
    ros1-nodelet \
    ros1-roscpp \
    ros1-rospy \
    ros1-std-msgs \
    ros1-swri-geometry-util \
    ros1-swri-math-util \
    ros1-swri-nodelet \
    ros1-swri-opencv-util \
    ros1-swri-roscpp \
    ros1-tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    pkgconfig-native \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    libeigen \
    ros1-camera-calibration-parsers \
    ros1-cv-bridge \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-image-transport \
    ros1-message-filters \
    ros1-nav-msgs \
    ros1-nodelet \
    ros1-roscpp \
    ros1-rospy \
    ros1-std-msgs \
    ros1-swri-geometry-util \
    ros1-swri-math-util \
    ros1-swri-opencv-util \
    ros1-swri-roscpp \
    ros1-tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    libeigen \
    ros1-camera-calibration-parsers \
    ros1-cv-bridge \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-image-transport \
    ros1-message-filters \
    ros1-nav-msgs \
    ros1-nodelet \
    ros1-roscpp \
    ros1-rospy \
    ros1-std-msgs \
    ros1-swri-geometry-util \
    ros1-swri-math-util \
    ros1-swri-opencv-util \
    ros1-swri-roscpp \
    ros1-tf \
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

# matches with: https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_image_util/2.14.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/swri_image_util"
SRC_URI = "git://github.com/swri-robotics-gbp/marti_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "b75bbf9048a4ae2957f4a504c4a0d7c21d1fe2f5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
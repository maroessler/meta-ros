# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The jsk_rqt_plugins package"
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://jsk-docs.readthedocs.io/en/latest/jsk_visualization/doc/jsk_rqt_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_visualization"
ROS_BPN = "jsk_rqt_plugins"

ROS_BUILD_DEPENDS = " \
    ros1-image-view2 \
    ros1-message-generation \
    ros1-mk \
    ros1-rosbuild \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-sklearn} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-urlgrabber} \
    ros1-cv-bridge \
    ros1-image-publisher \
    ros1-image-view2 \
    ros1-jsk-gui-msgs \
    ros1-message-runtime \
    ros1-qt-gui-py-common \
    ros1-resource-retriever \
    ros1-rqt-gui \
    ros1-rqt-gui-py \
    ros1-rqt-image-view \
    ros1-rqt-plot \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-sklearn} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-urlgrabber} \
    ros1-cv-bridge \
    ros1-image-publisher \
    ros1-image-view2 \
    ros1-jsk-gui-msgs \
    ros1-message-runtime \
    ros1-qt-gui-py-common \
    ros1-resource-retriever \
    ros1-rqt-gui \
    ros1-rqt-gui-py \
    ros1-rqt-image-view \
    ros1-rqt-plot \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-roslaunch \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_visualization-release/archive/release/melodic/jsk_rqt_plugins/2.1.6-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/jsk_rqt_plugins"
SRC_URI = "git://github.com/tork-a/jsk_visualization-release;${ROS_BRANCH};protocol=https"
SRCREV = "299255d2a7608b0dd029b9e79ab666037abfea05"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

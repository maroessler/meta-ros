# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "This rqt plugin provides a way to view and edit parameters on nodes."
AUTHOR = "Scott K Logan <logans@cottsay.net>"
ROS_AUTHOR = "Isaac Saito"
HOMEPAGE = "http://wiki.ros.org/rqt_reconfigure"
SECTION = "devel"
LICENSE = "BSD & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_reconfigure"
ROS_BPN = "rqt_reconfigure"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python3-pyyaml \
    ros2-ament-index-python \
    ros2-python-qt-binding \
    ros2-qt-gui-py-common \
    ros2-rclpy \
    ros2-rqt-console \
    ros2-rqt-gui \
    ros2-rqt-gui-py \
    ros2-rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros2-ament-copyright \
    ros2-ament-flake8 \
    ros2-ament-xmllint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt_reconfigure-release/archive/release/dashing/rqt_reconfigure/1.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/rqt_reconfigure"
SRC_URI = "git://github.com/ros2-gbp/rqt_reconfigure-release;${ROS_BRANCH};protocol=https"
SRCREV = "4a5d19d62c45255811d58ca214cd4ba4344f1032"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}

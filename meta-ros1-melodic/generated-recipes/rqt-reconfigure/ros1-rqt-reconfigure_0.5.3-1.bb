# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This rqt plugin succeeds former dynamic_reconfigure's GUI     (reconfigure_gui), and provides the way to view and edit the parameters     that are accessible via dynamic_reconfigure.<br/>     <br/>     (12/27/2012) In the future, arbitrary parameters that are not associated     with any nodes (which are not handled by dynamic_reconfigure) might     become handled.     However, currently as the name indicates, this pkg solely is dependent     on dynamic_reconfigure that allows access to only those params latched     to nodes."
AUTHOR = "Scott K Logan <logans@cottsay.net>"
ROS_AUTHOR = "Isaac Saito"
HOMEPAGE = "http://wiki.ros.org/rqt_reconfigure"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_reconfigure"
ROS_BPN = "rqt_reconfigure"

ROS_BUILD_DEPENDS = " \
    ros1-roslint \
"

ROS_BUILDTOOL_DEPENDS = " \
    python-setuptools-native \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-pyyaml \
    ros1-dynamic-reconfigure \
    ros1-python-qt-binding \
    ros1-rospy \
    ros1-rqt-console \
    ros1-rqt-gui \
    ros1-rqt-gui-py \
    ros1-rqt-py-common \
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

# matches with: https://github.com/ros-gbp/rqt_reconfigure-release/archive/release/melodic/rqt_reconfigure/0.5.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rqt_reconfigure"
SRC_URI = "git://github.com/ros-gbp/rqt_reconfigure-release;${ROS_BRANCH};protocol=https"
SRCREV = "6677cc44e4448006cdb454cd7bb095c29f79c003"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

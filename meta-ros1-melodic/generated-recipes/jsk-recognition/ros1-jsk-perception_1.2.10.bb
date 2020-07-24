# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ROS nodes and nodelets for 2-D image perception."
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Manabu Saito"
HOMEPAGE = "http://jsk-docs.readthedocs.io/en/latest/jsk_recognition/doc/jsk_perception"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_recognition"
ROS_BPN = "jsk_perception"

ROS_BUILD_DEPENDS = " \
    git \
    libeigen \
    ros1-angles \
    ros1-cmake-modules \
    ros1-cv-bridge \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-image-transport \
    ros1-image-view2 \
    ros1-jsk-data \
    ros1-jsk-recognition-msgs \
    ros1-jsk-recognition-utils \
    ros1-jsk-topic-tools \
    ros1-libcmt \
    ros1-message-generation \
    ros1-mk \
    ros1-nodelet \
    ros1-opencv-apps \
    ros1-pcl-ros \
    ros1-posedetection-msgs \
    ros1-robot-self-filter \
    ros1-roscpp \
    ros1-roseus \
    ros1-rospack \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_leveldb} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-chainer-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-chainercv-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-dlib} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-fcn-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-h5py} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-sklearn} \
    libeigen \
    python-pyyaml \
    ros1-angles \
    ros1-cv-bridge \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-image-transport \
    ros1-image-view \
    ros1-image-view2 \
    ros1-imagesift \
    ros1-jsk-data \
    ros1-jsk-gui-msgs \
    ros1-jsk-recognition-msgs \
    ros1-jsk-recognition-utils \
    ros1-jsk-topic-tools \
    ros1-libcmt \
    ros1-message-runtime \
    ros1-mk \
    ros1-nodelet \
    ros1-opencv-apps \
    ros1-openni2-launch \
    ros1-pcl-ros \
    ros1-posedetection-msgs \
    ros1-robot-self-filter \
    ros1-rosbag \
    ros1-roscpp \
    ros1-roseus \
    ros1-rospack \
    ros1-rospy \
    ros1-rostopic \
    ros1-rqt-gui \
    ros1-rviz \
    ros1-sensor-msgs \
    ros1-sound-play \
    ros1-std-msgs \
    ros1-tf \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_leveldb} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-chainer-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-chainercv-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-dlib} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-fcn-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-h5py} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-sklearn} \
    libeigen \
    python-pyyaml \
    ros1-angles \
    ros1-cv-bridge \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-image-transport \
    ros1-image-view \
    ros1-image-view2 \
    ros1-imagesift \
    ros1-jsk-data \
    ros1-jsk-gui-msgs \
    ros1-jsk-recognition-msgs \
    ros1-jsk-recognition-utils \
    ros1-jsk-topic-tools \
    ros1-libcmt \
    ros1-message-runtime \
    ros1-mk \
    ros1-nodelet \
    ros1-opencv-apps \
    ros1-openni2-launch \
    ros1-pcl-ros \
    ros1-posedetection-msgs \
    ros1-robot-self-filter \
    ros1-rosbag \
    ros1-roscpp \
    ros1-roseus \
    ros1-rospack \
    ros1-rospy \
    ros1-rostopic \
    ros1-rqt-gui \
    ros1-rviz \
    ros1-sensor-msgs \
    ros1-sound-play \
    ros1-std-msgs \
    ros1-tf \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-jsk-tools \
    ros1-roslaunch \
    ros1-roslint \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_perception/1.2.10-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/jsk_perception"
SRC_URI = "git://github.com/tork-a/jsk_recognition-release;${ROS_BRANCH};protocol=https"
SRCREV = "fdf8ad98ac7d7cc0e25e1a03457f6916d3db9325"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

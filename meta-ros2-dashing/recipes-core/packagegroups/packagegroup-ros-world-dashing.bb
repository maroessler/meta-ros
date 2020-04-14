# Copyright (c) 2019-2020 LG Electronics, Inc.

DESCRIPTION = "All non-test packages for the target from files/dashing/cache.yaml"
LICENSE = "MIT"

inherit packagegroup
inherit ros_distro_dashing

PACKAGES = "${PN}"

RDEPENDS_${PN} = "${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES}"

# "rmw-ros2-fastrtps-dynamic-cpp" is mentioned in http://www.ros.org/reps/rep-2000.html, so make sure we always build it (it appears in
# ROS_SUPERFLORE_GENERATED_TESTS, so it's not been added to ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES).
RDEPENDS_${PN}_append = " ros2-rmw-fastrtps-dynamic-cpp"

# Remove these explicitly until they are dropped from the ROS_EXEC_DEPENDS of ros-core, after which (most of them) will not be in
# in ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES because they only appear in ROS_TEST_DEPENDS.
RDEPENDS_${PN}_remove = "ros2-ament-cmake"
RDEPENDS_${PN}_remove = "ros2-ament-cmake-auto"
RDEPENDS_${PN}_remove = "ros2-ament-cmake-gmock"
RDEPENDS_${PN}_remove = "ros2-ament-cmake-gtest"
RDEPENDS_${PN}_remove = "ros2-ament-cmake-pytest"
RDEPENDS_${PN}_remove = "ros2-ament-cmake-ros"
RDEPENDS_${PN}_remove = "ros2-ament-index-cpp"
RDEPENDS_${PN}_remove = "ros2-ament-index-python"
RDEPENDS_${PN}_remove = "ros2-ament-lint-auto"
RDEPENDS_${PN}_remove = "ros2-ament-lint-common"
RDEPENDS_${PN}_remove = "ros2-rosidl-default-generators"

# Can't build these until we figure out how to build clang-format without building all of clang.
RDEPENDS_${PN}_remove = "ros2-ament-clang-format"
RDEPENDS_${PN}_remove = "ros2-ament-clang-tidy"
RDEPENDS_${PN}_remove = "ros2-ament-cmake-clang-format"
RDEPENDS_${PN}_remove = "ros2-ament-cmake-clang-tidy"

# Not used by "dashing"; this allows us to defer fixing log4cxx v0.10.0-13 until working on "melodic".
RDEPENDS_${PN}_remove = "ros2-rcl-logging-log4cxx"

# Needs work to launch qemu to run tests on image on build machine.
RDEPENDS_${PN}_remove = "ros2-launch-testing"
RDEPENDS_${PN}_remove = "ros2-launch-testing-ament-cmake"
RDEPENDS_${PN}_remove = "ros2-launch-testing-ros"
RDEPENDS_${PN}_remove = "ros2-ros-testing"

# Depends on python3-docker which is available in meta-virtualization, but we don't want to add the
# dependency on this layer to meta-ros yet
RDEPENDS_${PN}_remove = "ros2-cross-compile"
RDEPENDS_${PN}_remove = "ros2-launch-ros-sandbox"

# sophus package is empty, so not created, crystal and melodic have bbappend to create empty package
# but that is quite useless, either we should fix the packaging to have something useful in PN
# or not to install completely empty package like here
RDEPENDS_${PN}_remove = "ros2-sophus"

# Contains only dev, dbg and staticdev files, so PN is empty and not created
RDEPENDS_${PN}_remove = "ros2-cloudwatch-metrics-common"

# Contains only dev, dbg and staticdev files, so PN is empty and not created
RDEPENDS_${PN}_remove = "ros2-lex-common"

# Depends on Qt4 (libqt4-dev libqt4-opengl-dev libqglviewer-qt4-dev) which we don't plan to support
RDEPENDS_${PN}_remove = "ros2-octovis"

# OE won't let us build ffmpeg unless LICENSE_FLAGS_WHITELIST contains "commerical". These packages depend on it:
RDEPENDS_${PN}_remove = "${@bb.utils.contains('LICENSE_FLAGS_WHITELIST', 'commercial', '', 'ros2-web-video-server', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('LICENSE_FLAGS_WHITELIST', 'commercial', '', 'ros2-h264-encoder-core', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('LICENSE_FLAGS_WHITELIST', 'commercial', '', 'ros2-h264-video-encoder', d)}"

# behaviortree-cpp-v3 and behaviortree-cpp are mutually exclusive because they install files in the same locations. Unlike
# behaviortree-cpp, nothing depends on behaviortree-cpp-v3, so exclude it.
RDEPENDS_${PN}_remove = "behaviortree-cpp-v3"

# desktop RDEPENDS on rviz packages.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-desktop ros-rviz', '', 'ros2-desktop', d)}"

# NB. gazebo-msgs is a dependency of non-Gazebo packages, so it doesn't appear here.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'ros2-dolly-gazebo', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'ros2-gazebo-rosdev', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'ros2-gazebo-plugins', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'ros2-gazebo-ros', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'ros2-gazebo-ros-pkgs', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'ros2-nav2-system-tests', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'ros2-turtlebot3-gazebo', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'ros2-turtlebot3-simulations', d)}"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-realsense', '', 'ros2-librealsense2', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-realsense', '', 'ros2-realsense-camera-msgs', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-realsense', '', 'ros2-realsense-ros2-camera', d)}"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-python-qt-binding', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-qt-dotgraph', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-qt-gui', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-qt-gui-app', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-qt-gui-core', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-qt-gui-cpp', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-qt-gui-py-common', d)}"
# Depends on pyqt5-dev-tools
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-py-trees-ros-tutorials', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-py-trees-js', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-py-trees-ros-viewer', d)}"
# Depends on qtbase
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-turtlesim', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-nav2-rviz-plugins', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-slam-toolbox', d)}"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-action', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-console', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-common-plugins', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-graph', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-gui', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-gui-cpp', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-gui-py', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-image-view', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-msg', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-plot', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-publisher', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-py-common', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-py-console', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-reconfigure', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-robot-steering', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-service-caller', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-shell', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-srv', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-top', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-topic', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt5', '', 'ros2-rqt-tf-tree', d)}"

# RViz requires the "opengl" distro feature.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'ros2-object-analytics-rviz', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'ros2-rviz-assimp-vendor', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'ros2-rviz-common', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'ros2-rviz-default-plugins', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'ros2-rviz-ogre-vendor', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'ros2-rviz-rendering', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'ros2-rviz-rendering-tests', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'ros2-rviz-visual-testing-framework', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'ros2-rviz2', d)}"

# Depends on unavailable UNRESOLVED-libopenvdb, UNRESOLVED-libopenexr-dev, UNRESOLVED-libopenvdb-dev
RDEPENDS_${PN}_remove = "ros2-spatio-temporal-voxel-layer"

# Depends on unavailable ROS_UNRESOLVED_PLATFORM_PKG_autoware_auto_cmake-native, ROS_UNRESOLVED_PLATFORM_PKG_autoware_auto_helper_functions
RDEPENDS_${PN}_remove = "ros2-serial-driver"

RDEPENDS_${PN}_remove = "ros2-test-osrf-testing-tools-cpp"

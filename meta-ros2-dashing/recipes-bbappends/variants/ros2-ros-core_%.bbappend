# Copyright (c) 2019 LG Electronics, Inc.

# Need this to launch anything ROS.
ROS_EXEC_DEPENDS += " \
    ros2-ros-workspace \
"

# core-* OE images do not support development.
ROS_EXEC_DEPENDS_remove = "ros2-ament-cmake"
ROS_EXEC_DEPENDS_remove = "ros2-ament-cmake-auto"
ROS_EXEC_DEPENDS_remove = "ros2-ament-cmake-gmock"
ROS_EXEC_DEPENDS_remove = "ros2-ament-cmake-gtest"
ROS_EXEC_DEPENDS_remove = "ros2-ament-cmake-pytest"
ROS_EXEC_DEPENDS_remove = "ros2-ament-cmake-ros"
ROS_EXEC_DEPENDS_remove = "ros2-ament-index-cpp"
ROS_EXEC_DEPENDS_remove = "ros2-ament-index-python"
ROS_EXEC_DEPENDS_remove = "ros2-ament-lint-auto"
ROS_EXEC_DEPENDS_remove = "ros2-ament-lint-common"
ROS_EXEC_DEPENDS_remove = "ros2-rosidl-default-generators"

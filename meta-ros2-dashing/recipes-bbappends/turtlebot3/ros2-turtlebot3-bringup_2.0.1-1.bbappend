ROS_EXEC_DEPENDS_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-rviz2', d)}"

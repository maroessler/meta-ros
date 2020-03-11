ROS_EXEC_DEPENDS_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'ros2-dolly-gazebo', d)}"

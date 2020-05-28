# Copyright (c) 2019 LG Electronics, Inc.

# warning: libdynamic_reconfigure_config_init_mutex.so, needed by /ros1-moveit-ros-warehouse/1.0.2-1-r0/recipe-sysroot/opt/ros/melodic/lib/libmoveit_planning_scene_monitor.so
# warning: libtf.so, needed by ros1-moveit-ros-warehouse/1.0.2-1-r0/recipe-sysroot/opt/ros/melodic/lib/libwarehouse_ros.so, not found (try using -rpath or -rpath-link)
OECMAKE_CXX_LINK_FLAGS += "-Wl,-rpath-link=${RECIPE_SYSROOT}${ros_libdir}"

# Files/directories were installed but not shipped in any package:
#   /opt/ros/melodic/lib/libmoveit_warehouse.so.1.0.2
inherit ros_insane_dev_so

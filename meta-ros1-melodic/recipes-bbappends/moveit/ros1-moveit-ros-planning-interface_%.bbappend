# Copyright (c) 2019 LG Electronics, Inc.

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += " \
    file://0001-Find-numpyconfig.patch \
"

# warning: libdynamic_reconfigure_config_init_mutex.so, needed by ros1-moveit-ros-planning-interface/1.0.2-1-r0/recipe-sysroot/opt/ros/melodic/lib/libmoveit_trajectory_execution_manager.so, not found (try using -rpath or -rpath-link)
# warning: libtf.so, needed by ros1-moveit-ros-planning-interface/1.0.2-1-r0/recipe-sysroot/opt/ros/melodic/lib/libwarehouse_ros.so, not found (try using -rpath or -rpath-link)
# warning: libresource_retriever.so, needed by ros1-moveit-ros-planning-interface/1.0.2-1-r0/recipe-sysroot/opt/ros/melodic/lib/libgeometric_shapes.so, not found (try using -rpath or -rpath-link)
OECMAKE_CXX_LINK_FLAGS += "-Wl,-rpath-link=${RECIPE_SYSROOT}${ros_libdir}"

# Files/directories were installed but not shipped in any package:
#   /opt/ros/melodic/lib/libmoveit_planning_scene_interface.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_common_planning_interface_objects.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_move_group_interface.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_py_bindings_tools.so.1.0.2
inherit ros_insane_dev_so

export RECIPE_SYSROOT
export libdir
export PYTHON_DIR
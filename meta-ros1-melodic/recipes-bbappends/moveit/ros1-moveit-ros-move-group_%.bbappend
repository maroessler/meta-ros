# Copyright (c) 2019 LG Electronics, Inc.

# warning: libresource_retriever.so, needed by ros1-moveit-ros-move-group/1.0.2-1-r0/recipe-sysroot/opt/ros/melodic/lib/libgeometric_shapes.so, not found (try using -rpath or -rpath-link)
OECMAKE_CXX_LINK_FLAGS += "-Wl,-rpath-link=${RECIPE_SYSROOT}${ros_libdir}"

# Files/directories were installed but not shipped in any package:
#   /opt/ros/melodic/lib/libmoveit_move_group_default_capabilities.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_move_group_capabilities_base.so.1.0.2
inherit ros_insane_dev_so
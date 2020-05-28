# warning: libresource_retriever.so, needed by ros1-moveit-ros-planning/1.0.2-1-r0/recipe-sysroot/opt/ros/melodic/lib/libgeometric_shapes.so, not found (try using -rpath or -rpath-link)
OECMAKE_CXX_LINK_FLAGS += "-Wl,-rpath-link=${RECIPE_SYSROOT}${ros_libdir}"

# Files/directories were installed but not shipped in any package:
#   /opt/ros/melodic/lib/libmoveit_collision_plugin_loader.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_planning_scene_monitor.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_trajectory_execution_manager.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_kinematics_plugin_loader.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_default_planning_request_adapter_plugins.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_planning_pipeline.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_rdf_loader.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_plan_execution.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_robot_model_loader.so.1.0.2
#   /opt/ros/melodic/lib/libmoveit_constraint_sampler_manager_loader.so.1.0.2
inherit ros_insane_dev_so
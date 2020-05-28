# warning: libresource_retriever.so, needed by ros1-moveit-planners-ompl/1.0.2-1-r0/recipe-sysroot/opt/ros/melodic/lib/libgeometric_shapes.so, not found (try using -rpath or -rpath-link)
OECMAKE_CXX_LINK_FLAGS += "-Wl,-rpath-link=${RECIPE_SYSROOT}${ros_libdir}"

inherit ros_insane_dev_so
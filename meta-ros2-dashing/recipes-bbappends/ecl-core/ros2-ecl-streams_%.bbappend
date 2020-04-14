# Copyright (c) 2019 LG Electronics, Inc.

CXXFLAGS += "-Wno-unused-local-typedefs"
FILES_${PN} += "${ros_prefix}/lib"

inherit ros-insane
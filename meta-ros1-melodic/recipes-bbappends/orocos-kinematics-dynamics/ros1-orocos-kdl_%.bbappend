# Copyright (c) 2019 LG Electronics, Inc.

# Missing license version in package.xml maps it to invalid LGPL-2
# https://github.com/orocos/orocos-kdl-release/issues/4
LICENSE = "LGPL-2.1"

inherit ros_insane_dev_so

# The cmake files aren't in their own "cmake" subdirectory.
FILES_${PN}-dev_prepend = " \
    ${datadir}/${ROS_BPN}/*.cmake \
"

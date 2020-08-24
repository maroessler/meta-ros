# Copyright (c) 2020 LG Electronics, Inc.

# Add dependency on melodic's octomap:
# meta-ros1-melodic/generated-recipes/octomap/octomap_1.9.0-1.bb
# it's not enabled as optional dependency on common recipe:
# meta-ros-common/recipes-extended/fcl/fcl_0.6.1.bb
# but moveit-core from melodic, needs octomap support to be enabled
DEPENDS += "ros1-octomap"
RDEPENDS_{PN} += "ros1-octomap"

INSANE_SKIP_${PN} += "file-rdeps"
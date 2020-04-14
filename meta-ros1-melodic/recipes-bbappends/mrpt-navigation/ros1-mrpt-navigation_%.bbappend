# Copyright (c) 2019 LG Electronics, Inc.

PNBLACKLIST[mrpt-navigation] = "${@ 'Requires mrpt-reactivenav2d, ... which depends on mrpt-bridge which depends on qtbase which requires meta-qt5 to be included' if 'qt5-layer' not in BBFILE_COLLECTIONS.split() else '' }"

# Depends on ffmpeg with this restriction:
LICENSE_FLAGS = "commercial"

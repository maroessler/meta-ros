# Copyright (c) 2019 LG Electronics, Inc.

PNBLACKLIST[qt-gui] = "${@ 'Requires qtbase which requires meta-qt5 to be included' if 'qt5-layer' not in BBFILE_COLLECTIONS.split() else '' }"

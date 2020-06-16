BBCLASSEXTEND = "native"

DEPENDS_remove = " \
    UNRESOLVED-libopenni-dev \
    UNRESOLVED-libvtk-qt \
    proj \
    libfreenect \
    pcl \
    ros1-cv-bridge \
    ros1-libg2o \
    ros1-octomap \
    ros1-qt-gui-cpp \
    sqlite3 \
    zlib \
"

RDEPENDS_${PN}_remove = " \
    UNRESOLVED-libopenni-dev \
    UNRESOLVED-libvtk-qt \
    proj \
    libfreenect \
    pcl \
    ros1-cv-bridge \
    ros1-libg2o \
    ros1-octomap \
    ros1-qt-gui-cpp \
    sqlite3 \
    zlib \
"

EXTRA_OECMAKE_append_class-native = " \
    -DANDROID_PREBUILD=ON \
    -DUNIX=TRUE \
"

# DEPENDS_append = " \
#     glibc-native \
# "
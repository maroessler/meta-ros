require suitesparse-5.4.0.inc

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM += "file://Doc/License.txt;md5=99ef727a9426a71dacc4e6dcbad36a2e"

DEPENDS = " \
    suitesparse-config \
"

S = "${WORKDIR}/SuiteSparse/BTF"

EXTRA_OEMAKE = "CC='${CC}'"

do_compile() {
    # build only the library, not the demo
    oe_runmake library
}

do_install() {
    oe_runmake install INSTALL=${D}${prefix}
}

DEPENDS_append_class-target = " chrpath-replacement-native"
# For some reason ends with bad RPATH
# ERROR: suitesparse-umfpack-5.7.7-r0 do_package_qa: QA Issue: package suitesparse-umfpack contains bad RPATH suitesparse-umfpack/5.7.7-r0/image/usr/lib in file suitesparse-umfpack/5.7.7-r0/packages-split/suitesparse-umfpack/usr/lib/libumfpack.so.5.7.8 [rpaths]
do_install_append() {
    chrpath --delete ${D}${libdir}/*${SOLIBS}
}
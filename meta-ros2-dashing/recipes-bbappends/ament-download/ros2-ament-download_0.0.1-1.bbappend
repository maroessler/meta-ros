do_install_append() {
    sed -i 's@^#!/bin/env@/usr/bin/env@g' ${D}${ros_datadir}/ament_download/cmake/download_checkmd5.py
}

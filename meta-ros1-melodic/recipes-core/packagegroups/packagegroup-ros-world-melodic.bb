# Copyright (c) 2019 LG Electronics, Inc.

DESCRIPTION = "All non-test packages for the target from files/crystal/cache.yaml"
LICENSE = "MIT"

inherit packagegroup
inherit ros_distro_melodic

PACKAGES = "${PN}"

RDEPENDS_${PN} = "${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES}"

RDEPENDS_${PN}_remove = "${@ '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_QT}' if 'qt5-layer' not in BBFILE_COLLECTIONS.split() else '' }"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_QT = " \
    ros1-adi-driver \
    ros1-agni-tf-tools \
    ros1-ainstein-radar \
    ros1-ainstein-radar-rviz-plugins \
    ros1-asmach-tutorials \
    ros1-cartographer-rviz \
    ros1-cis-camera \
    ros1-cob-command-tools \
    ros1-cob-dashboard \
    ros1-cob-manipulation \
    ros1-common-tutorials \
    ros1-dataspeed-pds-rqt \
    ros1-desktop \
    ros1-desktop-full \
    ros1-distance-map \
    ros1-distance-map-rviz \
    ros1-dynamixel-workbench \
    ros1-dynamixel-workbench-single-manager-gui \
    ros1-fetch-gazebo-demo \
    ros1-fetch-simulation \
    ros1-find-object-2d \
    ros1-fkie-potree-rviz-plugin \
    ros1-fmi-adapter-examples \
    ros1-franka-example-controllers \
    ros1-franka-ros \
    ros1-fsrobo-r \
    ros1-fsrobo-r-bringup \
    ros1-fsrobo-r-moveit-config \
    ros1-geometry-tutorials \
    ros1-gl-dependency \
    ros1-grid-map \
    ros1-grid-map-demos \
    ros1-grid-map-rviz-plugin \
    ros1-husky-desktop \
    ros1-husky-viz \
    ros1-imagesift \
    ros1-imu-tools \
    ros1-jackal-desktop \
    ros1-jackal-viz \
    ros1-jsk-common \
    ros1-jsk-data \
    ros1-jsk-interactive \
    ros1-jsk-interactive-marker \
    ros1-jsk-interactive-test \
    ros1-jsk-pcl-ros \
    ros1-jsk-pcl-ros-utils \
    ros1-jsk-perception \
    ros1-jsk-recognition \
    ros1-jsk-recognition-utils \
    ros1-jsk-rqt-plugins \
    ros1-jsk-rviz-plugins \
    ros1-jsk-tools \
    ros1-jsk-visualization \
    ros1-libqt-concurrent \
    ros1-libqt-core \
    ros1-libqt-gui \
    ros1-libqt-opengl \
    ros1-libqt-opengl-rosdev \
    ros1-libqt-rosdev \
    ros1-libqt-svg-rosdev \
    ros1-libqt-network \
    ros1-libqt-widgets \
    ros1-librviz-tutorial \
    ros1-linux-networking \
    ros1-mapviz \
    ros1-mapviz-plugins \
    ros1-mir-gazebo \
    ros1-mir-robot \
    ros1-moveit \
    ros1-moveit-ros \
    ros1-moveit-ros-visualization \
    ros1-moveit-setup-assistant \
    ros1-mrpt-bridge \
    ros1-multi-map-server \
    ros1-multimaster-fkie \
    ros1-multires-image \
    ros1-neonavigation \
    ros1-neonavigation-launch \
    ros1-neonavigation-rviz-plugins \
    ros1-node-manager-fkie \
    ros1-octomap-rviz-plugins \
    ros1-open-manipulator \
    ros1-open-manipulator-control-gui \
    ros1-open-manipulator-with-tb3 \
    ros1-panda-moveit-config \
    ros1-pilz-robots \
    ros1-plotjuggler \
    ros1-pr2eus-tutorials \
    ros1-prbt-gazebo \
    ros1-prbt-grippers \
    ros1-prbt-moveit-config \
    ros1-prbt-pg70-support \
    ros1-python-qt-binding \
    ros1-qt-dotgraph \
    ros1-qt-gui \
    ros1-qt-gui-app \
    ros1-qt-gui-core \
    ros1-qt-gui-cpp \
    ros1-qt-gui-py-common \
    ros1-qt-qmake \
    ros1-ridgeback-desktop \
    ros1-ridgeback-viz \
    ros1-ros-controllers \
    ros1-ros-tutorials \
    ros1-rosbag-editor \
    ros1-rosmon \
    ros1-rqt \
    ros1-rqt-action \
    ros1-rqt-bag \
    ros1-rqt-bag-plugins \
    ros1-rqt-common-plugins \
    ros1-rqt-console \
    ros1-rqt-controller-manager \
    ros1-rqt-dep \
    ros1-rqt-ez-publisher \
    ros1-rqt-graph \
    ros1-rqt-gui \
    ros1-rqt-gui-cpp \
    ros1-rqt-gui-py \
    ros1-rqt-image-view \
    ros1-rqt-joint-trajectory-controller \
    ros1-rqt-launch \
    ros1-rqt-launchtree \
    ros1-rqt-logger-level \
    ros1-rqt-moveit \
    ros1-rqt-msg \
    ros1-rqt-multiplot \
    ros1-rqt-nav-view \
    ros1-rqt-plot \
    ros1-rqt-pose-view \
    ros1-rqt-publisher \
    ros1-rqt-py-common \
    ros1-rqt-py-console \
    ros1-rqt-py-trees \
    ros1-rqt-reconfigure \
    ros1-rqt-robot-dashboard \
    ros1-rqt-robot-monitor \
    ros1-rqt-robot-plugins \
    ros1-rqt-robot-steering \
    ros1-rqt-rosmon \
    ros1-rqt-rotors \
    ros1-rqt-runtime-monitor \
    ros1-rqt-rviz \
    ros1-rqt-service-caller \
    ros1-rqt-shell \
    ros1-rqt-srv \
    ros1-rqt-tf-tree \
    ros1-rqt-top \
    ros1-rqt-topic \
    ros1-rqt-web \
    ros1-rtabmap-ros \
    ros1-rviz \
    ros1-rviz-imu-plugin \
    ros1-rviz-plugin-tutorials \
    ros1-rviz-python-tutorial \
    ros1-rviz-visual-tools \
    ros1-seed-r7-bringup \
    ros1-seed-r7-moveit-config \
    ros1-seed-r7-ros-pkg \
    ros1-seed-r7-samples \
    ros1-seed-r7-typef-moveit-config \
    ros1-sick-safetyscanners \
    ros1-slam-toolbox \
    ros1-swri-console \
    ros1-swri-profiler-tools \
    ros1-tile-map \
    ros1-towr-ros \
    ros1-trajectory-tracker-rviz-plugins \
    ros1-turtle-actionlib \
    ros1-turtle-tf \
    ros1-turtle-tf2 \
    ros1-turtlesim \
    ros1-turtlesim-dash-tutorial \
    ros1-urdf-sim-tutorial \
    ros1-urdf-tutorial \
    ros1-visualization-tutorials \
    ros1-viz \
    ros1-warthog-desktop \
    ros1-warthog-viz \
    ros1-webkit-dependency \
"

# OE won't let us build ffmpeg unless LICENSE_FLAGS_WHITELIST contains "commerical".
RDEPENDS_${PN}_remove = "${@ '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_FFMPEG}' if not d.getVar('LICENSE_FLAGS_WHITELIST') or 'commercial' not in d.getVar('LICENSE_FLAGS_WHITELIST').split() else '' }"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_FFMPEG = " \
    ros1-codec-image-transport \
    ros1-h264-encoder-core \
    ros1-h264-video-encoder \
    ros1-movie-publisher \
    ros1-mrpt1 \
    ros1-mrpt-bridge \
    ros1-mrpt-ekf-slam-2d \
    ros1-mrpt-ekf-slam-3d \
    ros1-mrpt-graphslam-2d \
    ros1-mrpt-icp-slam-2d \
    ros1-mrpt-local-obstacles \
    ros1-mrpt-localization \
    ros1-mrpt-map \
    ros1-mrpt-navigation \
    ros1-mrpt-rawlog \
    ros1-mrpt-rbpf-slam \
    ros1-mrpt-reactivenav2d \
    ros1-mrpt-slam \
    ros1-mvsim \
    ros1-parrot-arsdk \
    ros1-pose-cov-ops \
    ros1-rospilot \
    ros1-usb-cam \
    ros1-web-video-server \
"

# OE won't let us build gstreamer1.0-plugins-ugly unless LICENSE_FLAGS_WHITELIST contains "commerical".
RDEPENDS_${PN}_remove = "${@ '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GSTREAMER1.0_PLUGINS_UGLY}' if not d.getVar('LICENSE_FLAGS_WHITELIST') or 'commercial' not in d.getVar('LICENSE_FLAGS_WHITELIST').split() else '' }"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GSTREAMER1.0_PLUGINS_UGLY = " \
    ros1-audio-capture \
    ros1-audio-common \
    ros1-audio-play \
    ros1-jsk-3rdparty \
    ros1-jsk-pr2eus \
    ros1-jsk-topic-tools \
    ros1-julius-ros \
    ros1-pr2eus \
    ros1-pr2eus-moveit \
    ros1-resized-image-transport \
    ros1-ros-speech-recognition \
    ros1-sound-play \
    ros1-tts \
    ros1-voice-text \
"

# NB. gazebo-msgs is a dependency of non-Gazebo packages, so it doesn't appear here.
RDEPENDS_${PN}_remove = "${@ '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GAZEBO}' if 'ros-gazebo' not in d.getVar('DISTRO_FEATURES').split() else '' }"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GAZEBO = " \
    ros1-ainstein-radar-gazebo-plugins \
    ros1-audibot \
    ros1-audibot-gazebo \
    ros1-blender-gazebo \
    ros1-cob-common \
    ros1-cob-description \
    ros1-cob-gazebo-objects \
    ros1-cob-gazebo-plugins \
    ros1-cob-gazebo-ros-control \
    ros1-cob-gazebo-worlds \
    ros1-cob-grasp-generation \
    ros1-cob-hardware-config \
    ros1-desistek-saga-control \
    ros1-desistek-saga-description \
    ros1-desistek-saga-gazebo \
    ros1-eca-a9-description \
    ros1-eca-a9-gazebo \
    ros1-eusurdf \
    ros1-fetch-gazebo \
    ros1-fetchit-challenge \
    ros1-fsrobo-r-description \
    ros1-gazebo-plugins \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-gazebo-ros-pkgs \
    ros1-gazebo-rosdev \
    ros1-hector-gazebo \
    ros1-hector-gazebo-plugins \
    ros1-hector-gazebo-thermal-camera \
    ros1-hector-gazebo-worlds \
    ros1-hector-sensors-gazebo \
    ros1-husky-gazebo \
    ros1-husky-simulator \
    ros1-igvc-self-drive-description \
    ros1-igvc-self-drive-gazebo \
    ros1-igvc-self-drive-gazebo-plugins \
    ros1-igvc-self-drive-sim \
    ros1-jackal-gazebo \
    ros1-jackal-simulator \
    ros1-ksql-airport \
    ros1-lauv-control \
    ros1-lauv-description \
    ros1-lauv-gazebo \
    ros1-mcmillan-airfield \
    ros1-mecanum-gazebo-plugin \
    ros1-mir-description \
    ros1-mir-driver \
    ros1-mir-navigation \
    ros1-nmea-gps-plugin \
    ros1-open-manipulator-gazebo \
    ros1-open-manipulator-simulations \
    ros1-open-manipulator-with-tb3-gazebo \
    ros1-open-manipulator-with-tb3-simulations \
    ros1-pr2-controller-configuration-gazebo \
    ros1-pr2-gazebo \
    ros1-pr2-gazebo-plugins \
    ros1-pr2-simulator \
    ros1-raw-description \
    ros1-rexrov2-control \
    ros1-rexrov2-description \
    ros1-rexrov2-gazebo \
    ros1-ridgeback-gazebo \
    ros1-ridgeback-gazebo-plugins \
    ros1-ridgeback-simulator \
    ros1-rotors-gazebo \
    ros1-rotors-gazebo-plugins \
    ros1-rotors-simulator \
    ros1-sand-island \
    ros1-turtlebot3-gazebo \
    ros1-turtlebot3-simulations \
    ros1-urdf-sim-tutorial \
    ros1-usv-gazebo-plugins \
    ros1-uuv-descriptions \
    ros1-uuv-gazebo-plugins \
    ros1-uuv-gazebo-ros-plugins \
    ros1-uuv-gazebo-worlds \
    ros1-uuv-sensor-ros-plugins \
    ros1-uuv-simulator \
    ros1-uuv-world-plugins \
    ros1-uuv-world-ros-plugins \
    ros1-velodyne-gazebo-plugins \
    ros1-velodyne-simulator \
    ros1-vrx-gazebo \
    ros1-wamv-gazebo \
    ros1-warthog-gazebo \
    ros1-warthog-simulator \
    ros1-wave-gazebo \
    ros1-wave-gazebo-plugins \
    ros1-yosemite-valley \
"

# Depends on libqt4-dev from https://git.yoctoproject.org/cgit/cgit.cgi/meta-qt4
RDEPENDS_${PN}_remove = "${@ '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_QT4}' if 'qt4-layer' not in BBFILE_COLLECTIONS.split() else '' }"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_QT4 = " \
    ros1-hector-geotiff \
    ros1-hector-geotiff-plugins \
    ros1-hector-slam \
    ros1-hector-slam-launch \
"

# Depends on vlc from meta-multimedia
RDEPENDS_${PN}_remove = "${@ '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_MULTIMEDIA}' if 'multimedia-layer' not in BBFILE_COLLECTIONS.split() else '' }"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_MULTIMEDIA = " \
    ros1-cob-android \
    ros1-cob-android-script-server \
    ros1-cob-command-gui \
    ros1-cob-default-robot-behavior \
    ros1-cob-driver \
    ros1-cob-helper-tools \
    ros1-cob-mimic \
    ros1-cob-monitoring \
    ros1-cob-script-server \
    ros1-cob-sound \
    ros1-cob-teleop \
"

RDEPENDS_${PN}_remove = "${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_WXPYTHON}"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_WXPYTHON = " \
    ros1-smach-viewer \
    ros1-executive-smach-visualization \
"

# Depends on mesa or libglu which requires opengl or vulkan DISTRO_FEATURE
RDEPENDS_${PN}_remove = "${@ '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OPENGL}' if 'opengl' not in d.getVar('DISTRO_FEATURES').split() else '' }"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OPENGL = " \
    ros1-abb \
    ros1-abb-irb2400-moveit-config \
    ros1-abb-irb6640-moveit-config \
    ros1-cob-collision-monitor \
    ros1-cob-obstacle-distance-moveit \
    ros1-cob-moveit-bringup \
    ros1-cob-moveit-interface \
    ros1-desktop-full \
    ros1-exotica \
    ros1-exotica-aico-solver \
    ros1-exotica-collision-scene-fcl \
    ros1-exotica-collision-scene-fcl-latest \
    ros1-exotica-core \
    ros1-exotica-core-task-maps \
    ros1-exotica-examples \
    ros1-exotica-ik-solver \
    ros1-exotica-levenberg-marquardt-solver \
    ros1-exotica-ompl-solver \
    ros1-exotica-python \
    ros1-exotica-time-indexed-rrt-connect-solver \
    ros1-fetch-bringup \
    ros1-fetch-moveit-config \
    ros1-fetch-ros \
    ros1-fsrobo-r-trajectory-filters \
    ros1-industrial-core \
    ros1-industrial-trajectory-filters \
    ros1-libg2o \
    ros1-moveit-commander \
    ros1-moveit-fake-controller-manager \
    ros1-moveit-planners \
    ros1-moveit-planners-ompl \
    ros1-moveit-plugins \
    ros1-moveit-pr2 \
    ros1-moveit-ros-benchmarks \
    ros1-moveit-ros-manipulation \
    ros1-moveit-ros-move-group \
    ros1-moveit-ros-perception \
    ros1-moveit-ros-planning \
    ros1-moveit-ros-planning-interface \
    ros1-moveit-ros-robot-interaction \
    ros1-moveit-ros-warehouse \
    ros1-moveit-runtime \
    ros1-moveit-sim-controller \
    ros1-moveit-visual-tools \
    ros1-navigation-stage \
    ros1-navigation-tutorials \
    ros1-open-manipulator-controller \
    ros1-open-manipulator-moveit \
    ros1-open-manipulator-with-tb3-tools \
    ros1-open-manipulator-with-tb3-waffle-moveit \
    ros1-open-manipulator-with-tb3-waffle-pi-moveit \
    ros1-pilz-industrial-motion \
    ros1-pilz-robot-programming \
    ros1-pilz-trajectory-generation \
    ros1-pr2-moveit-config \
    ros1-rc-visard \
    ros1-robot-body-filter \
    ros1-roomba-stage \
    ros1-rtabmap \
    ros1-rtabmap-ros \
    ros1-seed-r7-navigation \
    ros1-simulators \
    ros1-stage \
    ros1-stage-ros \
    ros1-teb-local-planner \
    ros1-teb-local-planner-tutorials \
    ros1-uwsim \
    ros1-uwsim-bullet \
    ros1-uwsim-osgbullet \
    ros1-uwsim-osgocean \
    ros1-uwsim-osgworks \
    ros1-wxwidgets \
    ros1-rc-roi-manager-gui \
    ros1-rqt-pose-view \
"

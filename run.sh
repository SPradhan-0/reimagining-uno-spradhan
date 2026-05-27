#!/bin/sh
set -eu

java -Djava.library.path=lib/native/macosx -cp "bin:lib/slick.jar:lib/jar/*" main.Game

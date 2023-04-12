#!/usr/bin/sh

cd target/uberjar/

java -server -Xmx300M -XX:+UseG1GC -jar "app.jar" 
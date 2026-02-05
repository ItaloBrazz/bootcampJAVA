#!/bin/bash
export PORT=${PORT:-8080}
java -jar /home/site/wwwroot/app.jar --server.port=$PORT

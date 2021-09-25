#!/bin/bash

docker pull owasp/zap2docker-stable
docker run -i owasp/zap2docker-stable zap-baseline.py -t "http://35.200.200.123/" -l PASS > zap_baseline_report.html

echo $? > /dev/null

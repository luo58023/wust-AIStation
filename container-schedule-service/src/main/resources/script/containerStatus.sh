#!/bin/bash
podName=$1
result=$(kubectl get pod -n kube-system|grep ${podName} |awk '{print $3}')
if [ "$result" == "Running" ]; then
   echo true
else
   echo "not running"
   exit 1;
fi
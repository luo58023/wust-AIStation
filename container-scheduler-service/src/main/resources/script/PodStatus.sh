#!/bin/bash
namespace=$1
podName=$2
result=$(kubectl get pod -n ${namespace}|grep ${podName} |awk '{print $3}')
if [[ "$result" == "Running" ]]; then
   echo "is running"
else if [[ "$result" == "" ]]; then
    echo "not found"
    exit 1;
fi
   echo "not running"
   exit 2;
fi
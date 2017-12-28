#!/usr/bin/env bash

echo -n "Creating Service Registry..."
{
  cf create-service p-service-registry standard registry-service
} &> /dev/null
until [ `cf service registry-service | grep -c "succeeded"` -eq 1  ]
do
  echo -n "."
done
echo
echo "Service Registry is created."
#!/usr/bin/env bash

echo -n "Creating hystrix dashboard Service..."
{
  cf create-service p-circuit-breaker-dashboard standard circuit-breaker-dashboard
} &> /dev/null
until [ `cf service circuit-breaker-dashboard | grep -c "succeeded"` -eq 1  ]
do
  echo -n "."
done
echo
echo "Hystrix dashboard Service is created."
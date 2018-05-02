#!/usr/bin/env bash

echo -n "Creating Config Server..."
{
  cf create-service -c '{ "git": { "uri": "https://github.com/Haybu/temp-config-repo.git", "label": "master" } }' p-config-server standard config-server
} &> /dev/null
until [ `cf service config-server | grep -c "succeeded"` -eq 1  ]
do
  echo -n "."
done
echo
echo "Config Server is created."
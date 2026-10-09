#!/usr/bin/env sh

set -e

cd "$(dirname "$0")"

# Regenerates the code generated from the OpenAPI specifications, e.g. for the IDE to pick up API changes.
./gradlew \
  :modelix.kubernetes:openapi:api-server-stubs-ktor:fabriktGenerate \
  :modelix.kubernetes:openapi:api-client-ktor:generateKtorClient \
  :modelix.kubernetes:dashboard:generateApis

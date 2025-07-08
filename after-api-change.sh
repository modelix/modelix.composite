#!/usr/bin/env sh

set -e

cd "$(dirname "$0")"

./gradlew :modelix.openapi:api-server-stubs-ktor:fabriktGenerate
./gradlew :modelix.openapi:api-client-ktor:generateKtorClient
./gradlew :modelix.openapi:redocly:npm_run_bundle
./gradlew :modelix.dashboard:generateApis
#./gradlew :modelix.dashboard:publishToMavenLocal
#./gradlew :modelix.kubernetes:copyDashboard

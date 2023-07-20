/*
 * Copyright (C) 2020 The ORT Project Authors (see <https://github.com/oss-review-toolkit/ort/blob/main/NOTICE>)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * License-Filename: LICENSE
 */

import com.cloudbees.groovy.cps.NonCPS

import java.io.IOException

import org.jenkinsci.plugins.pipeline.modeldefinition.Utils

final DOCKER_BUILD_ARGS = '--build-arg http_proxy=$http_proxy --build-arg https_proxy=$https_proxy --build-arg ORT_VERSION='

// Disable the entry point to work around https://issues.jenkins-ci.org/browse/JENKINS-51307.
final DOCKER_RUN_ARGS = '-e http_proxy -e https_proxy --entrypoint=""'

// The status code ORT commands return for failures (like rule violations), not errors (like existing output files).
final ORT_FAILURE_STATUS_CODE = 2

@NonCPS
static sortProjectsByPathDepth(projects) {
    return projects.toSorted { it.definition_file_path.count("/") }
}

def projectVcsCredentials = []
def ortConfigVcsCredentials = []
def ortVersion = 'JENKINS-SNAPSHOT'

pipeline {
    agent { label 'docker-agent-ort' }

    parameters {
        /*
         * Parameters about the project to run ORT on.
         */

        string(
            name: 'PROJECT_VCS_URL',
            description: 'The VCS clone URL of the project.',
            defaultValue: 'https://github.com/swissKeys/automated-licensing.git'
        )

        string(
            name: 'PROJECT_VCS_REVISION',
            description: 'Optional VCS revision of the project (prefix Git tags with "refs/tags/").',
            defaultValue: ''
        )

        credentials(
            name: 'PROJECT_VCS_CREDENTIALS',
            description: 'Optional Jenkins credentials to use for the VCS checkout.',
            defaultValue: ''
        )

        /*
         * General ORT parameters.
         */

        string(
            name: 'ORT_CONFIG_VCS_URL',
            description: 'Optional VCS clone URL of the ORT configuration.',
            defaultValue: 'https://github.com/oss-review-toolkit/ort-config.git'
        )

        string(
            name: 'ORT_CONFIG_VCS_REVISION',
            description: 'Optional VCS revision of the ORT configuration (prefix Git tags with "refs/tags/").',
            defaultValue: ''
        )

        credentials(
            name: 'ORT_CONFIG_VCS_CREDENTIALS',
            description: 'Optional Jenkins credentials to use for the VCS checkout.',
            defaultValue: ''
        )

        choice(
            name: 'LOG_LEVEL',
            description: 'The logging level.',
            choices: ['', '--error', '--warn', '--info', '--debug']
        )

        booleanParam(
            name: 'STACKTRACE',
            description: 'Show the stacktrace for all exceptions.',
            defaultValue: false
        )

        /*
         * ORT analyzer tool parameters.
         */

        booleanParam(
            name: 'ALLOW_DYNAMIC_VERSIONS',
            description: 'Allow dynamic versions of dependencies (support projects without lock files).',
            defaultValue: false
        )

        booleanParam(
            name: 'USE_ORT_CONFIG_CURATIONS',
            description: 'Use package curation data from the ORT config repository.',
            defaultValue: false
        )

        booleanParam(
            name: 'USE_CLEARLY_DEFINED_CURATIONS',
            description: 'Use package curation data from the ClearlyDefined service.',
            defaultValue: true
        )

        string(
            name: 'ENABLED_PACKAGE_MANAGERS',
            description: 'A comma-separated list of package managers to enable. By default all package managers are enabled.',
            defaultValue: ''
        )

        string(
            name: 'DISABLED_PACKAGE_MANAGERS',
            description: 'A comma-separated list of package managers to disable. By default no package manager is disabled.',
            defaultValue: ''
        )

        /*
         * ORT scanner tool parameters.
         */

        booleanParam(
            name: 'RUN_SCANNER',
            description: 'Run the scanner tool.',
            defaultValue: true
        )

        booleanParam(
            name: 'SKIP_CONCLUDED',
            description: 'Enable to skip scanning packages that have a concluded license and authors set.',
            defaultValue: true
        )

        choice(
            name: 'PROJECT_SCANNER',
            description: 'The scanner to use for project source code.',
            choices: ['ScanCode', 'Askalono', 'BoyterLc', 'Licensee', 'ScanOSS', '<NONE>']
        )

        choice(
            name: 'PACKAGE_SCANNER',
            description: 'The scanner to use for package source code.',
            choices: ['ScanCode', 'Askalono', 'BoyterLc', 'Licensee', 'ScanOSS', '<NONE>']
        )

        booleanParam(
            name: 'USE_CLEARLY_DEFINED_SCAN_STORAGE',
            description: 'Use the ClearlyDefined service to retrieve existing scan results. This overrides any other scan storage configuration.',
            defaultValue: true
        )

        /*
         * ORT advisor tool parameters.
         */

        booleanParam(
            name: 'RUN_ADVISOR',
            description: 'Run the advisor tool. The OSV provider (https://osv.dev/) is enabled by default.',
            defaultValue: true
        )

        string(
            name: 'VULNERABLE_CODE_API_KEY',
            description: 'Optional API key to enable VulnerableCode (see https://public.vulnerablecode.io/account/request_api_key/).',
            defaultValue: ''
        )

        /*
         * ORT evaluator tool parameters.
         */

        booleanParam(
            name: 'RUN_EVALUATOR',
            description: 'Run the evaluator tool.',
            defaultValue: true
        )

        /*
         * ORT reporter tool parameters.
         */

        booleanParam(
            name: 'RUN_REPORTER',
            description: 'Run the reporter tool.',
            defaultValue: true
        )
    }
    options { skipDefaultCheckout true }
    stages {


        stage('Build ORT Docker image') {

            steps {
                sh '''
                echo 'hello world'
                '''
            }
        }
    }
}
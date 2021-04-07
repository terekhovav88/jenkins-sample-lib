def call(Map stageParams) {
    checkout([
            $class: 'GitSCM',
            branches: [[name:  stageParams.branch ]],
            userRemoteConfigs: [[credentialsId: stageParams.cred, url: stageParams.url ]]
    ])
}
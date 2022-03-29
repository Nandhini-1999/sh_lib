def call(Map stageParams) {
	checkout([
		$class: 'GitSCM',
		branches: [[name: stageParams.branch]],
		userRemoteConfigs: [[credentialsId: 'Nandhini-1999', url: stageParams.url]]
		])
	}

pipeline {
    agent any

    // Trigger Jenkins automatically when code is pushed to GitHub
    triggers {
        githubPush()
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone the repo from GitHub
                git branch: 'main', url: 'https://github.com/at885599/Dec2025FullRepo.git'
            }
        }

        stage('Test') {
            steps {
                // Move into the FirstProject folder
                dir('FirstProject') {
                    // Run only amazonHomepage test class
                    sh 'mvn test -Dtest=amazonHomepage'
                }
            }
        }
    }
}
pipeline{
     agent any
  tools{
      jdk 'java8'
      maven 'maven'
  }
  environment{
      NEW_VERSION='1.2.0'
  
  }
  parameters{
    string(name: 'Branch',defaultValue: 'main',descrition: 'please type branch')
    choice(name: 'Version',choices: ['1.2.0','1.2.1','1.2.2'],descrpion: 'select version')
    booleanParam(name: 'executeTests',defaultValue: true,descrption: 'test')
  }
  stages{
    stage("build"){
      steps{
         echo "build application"
      }
    }
    stage("test"){
      when{
        expression{params.executeTests}
      }
      steps{
         echo "test application"
      }
    }
    stage("deploy"){
      when{
        expression{params.Branch=='main'
      }
      steps{
         echo "deploy application"
      }
    }
  }
}
  

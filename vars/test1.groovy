def call(String repoUrl, String branch){
   def workingDir = "${env.WORKSPACE}"
   sh "git pull ${repoUrl}"
   sh "git checkout -b ${branch}"
   return "hi"
}

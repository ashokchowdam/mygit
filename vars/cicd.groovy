def newDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}
def newBuild(repo)
{
  git sh 'mvn package'
}

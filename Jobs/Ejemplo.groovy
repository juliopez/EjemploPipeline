project_name= "EjemploPipline"
repo ="git@github.com:juliopez/EjemploPipeline.git"
repo_name ="repositorio"

pipelineJob (poject_name)
{
  definition
  {
    triggers
    {
     scm('H/1 * * * *')
    }
    cpsScm
    {
      scm
      {
	git
        {
	  remote
          {
	   name(repo_name)
	   url(repo)
	  }
	}
	scriptPath("Jenkinsfile")
       }
     }
   }
}
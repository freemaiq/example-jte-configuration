/*
  specify which libraries to load: 
    In the Governance Tier configuration file, 
    these should be configurations common across 
    all apps governed by this config. 
*/
libraries{
  maven
}

stages{
    continuous_integration{
        build
    }
}

keywords {
  CONTAINER_REGISTRY = "docker-nexus.devops.weecover.io"
  CODE_REPO = "https://github.com/WEECOVER/ms-konnectoren.git"
  DEPLOY_REPO = "https://github.com/WEECOVER/plat-helm-deploy-konnectoren"
}

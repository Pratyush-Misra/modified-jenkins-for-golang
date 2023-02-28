#!groovy
import jenkins.model.* 
def jenkins = Jenkins.getInstance() jenkins.setSecurityRealm(new hudson.security.HudsonPrivateSecurityRealm(false))
def strategy = new hudson.security.FullControlOnceLoggedInAuthorizationStrategy()
jenkins.setAuthorizationStrategy(strategy) 
def user = jenkins.getSecurityRealm().createAccount("admin", "password")
user.save()

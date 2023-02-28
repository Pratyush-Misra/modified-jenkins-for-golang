FROM jenkins/jenkins
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
COPY users.groovy /usr/share/jenkins/ref/init.groovy.d/
RUN jenkins-plugin-cli -f /usr/share/jenkins/ref/plugins.txt

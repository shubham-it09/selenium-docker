FROM ibmjava:jre
#Working Directory
WORKDIR /usr/share/udemydir
# Add all the jar files 
Add target/selenium-docker.jar      selenium-docker.jar
Add target/selenium-docker-tests.jar     selenium-docker-tests.jar
Add target/libs libs
#Add Suite Files:
Add testng1.xml testng1.xml
Add testng.xml testng.xml

# BROWSER
#HUBHOST
#MODULE
ENTRYPOINT java -cp selenium-docker.jar;selenium-docker-tests.jar;libs/* -DBROWSER=$BROWSER -DHUB_HOST=$HUB_HOST org.testng.TestNG $MODULE



SeleniumAutomationTest

- Import

	cd /path/to/project/src/selene/
	
	java -cp "../../../../lib/antlr-4.7.1-complete.jar"  org.antlr.v4.Tool -package selene SELENE.g4
	
	Eclipse: File > Import > Maven > Existing Maven Projects > path/to/project

- Build

	 Requirement: Apache Maven, jdk 1.8
	 
	cd /path/to/project/
	
	mvn package
	
	jar executing file in /path/to/project/target/SeleniumAutomationTest-{version}.jar

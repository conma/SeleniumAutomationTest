SeleniumAutomationTest

- Import

	cd /path/to/project/src/main/java/selene/
	java -cp "../../../../lib/antlr-4.7.1-complete.jar"  org.antlr.v4.Tool -package selene SELENE.g4
	Eclipse: File > Import > Maven > Existing Maven Projects > path/to/project

- Build

	Requirement: Apache Maven, jdk 1.8
	cd /path/to/project/
	mvn package
	executable jar file in /path/to/project/target/SeleniumAutomationTest-{version}.jar

- Run

	Requirement:
		browser (ff/ie/chrome) is installed
		webdriver file in same folder with jar file
		test case file in same folder with jar file, has structure like this https://github.com/conma/SeleniumAutomationTest/blob/master/testcases/Testcase.xls
	java -jar SeleniumAutomationTest-{version}.jar -g -x
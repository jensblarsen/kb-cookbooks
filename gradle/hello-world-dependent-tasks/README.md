# hello-world-dependent-tasks

This project just shows a hello world with task chaining and task dependencies. Running the project with the following command should provide three lines of the text Gradle rocks!

	gradle groupTherapy
	
Here is sample output:

:startSession
[ant:echo] Repeat after me...
:yayGradle0
Gradle rocks!
:yayGradle1
Gradle rocks!
:yayGradle2
Gradle rocks!
:groupTherapy


In this script, the group therapy task has been set as the parent task, yayGradle2 depends on yayGradle1 and yayGradle0, yayGradle0 depends on startSession which calls chant first. Based on dependencies, the remaining tasks will fire. 
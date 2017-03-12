# initial-webapp

## Overview

This is a project that I generated using Yeoman's webapp generator. 

When I initially created the project, bower was not installed, so the NPM execution failed. I installed bower:

	npm install -g bower
	
Next, I needed to run bower install, which grabbed the bower dependencies. 

## Folders and Files

As part of the generation of the project, here are some of the details of the files and folders created:

- /app - Contains the actual application artifacts, including fonts, images, scripts, styles and the main page. 
- /test - Contains the test page
- bower.json - Bower dependencies
- gulpfile.js - Gulp build script
- package.json - NPM package descriptor

## Execution

I ran the command: 

	gulp serve
	
Which then opened a browser:

	http://localhost:9000/
	


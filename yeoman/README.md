# Yeoman Cookbook

## Overview

Yeoman is a scaffolding tool that uses generators to create apps. It can create any type of app, including Python, Web, Java and C#. 

## Yeoman Workflow

Yeoman has the concept of a workflow comprising of three tools:

1. yo - Tool for writing the build ocnfiguration and pulling in relevant build tasks and package management dependencies. 
2. build system - Tool for building, previewing and tesitng the project. Gulp and Grunt are common options. 
3. package management - Tool for management of dependencies. NPM and Bower are common options.

## Installation

Yeoman installs via NPM using the command below for global installation:

	npm install -g yo

After installing Yeoman, you can then install one or more generators, also using NPM commands:

	npm install -g generator-webapp

## Execution

After a generator is installed, simply run a command like the one below from the directory of the project folder:

	cd initial-webapp
	yo webapp

After running the command, dependening on the generator, there will be one or more input prompts to allow you to enter or select features to be installed. 
	
## Project Folders

Under this folder are sample projects that I created using Yeoman. Each project may be slightly different based on the options I chose. 

### initial-webapp

For this project, I ran the following commands:

	cd initial-webapp
	yo webapp

Then made the following selections:

1. Which additional features would you like to include? Sass, Bootstrap, Modernizr
2. Which version of Bootstrap would you like to include? Bootstrap 4
3. Choose your style of DSL TDD

## Management

Running the command yo alone will bring up the list of options to manage generators. Generators can be individually executed, can be updated or new generators can be installed. 

Along with generating new projects, there are also options that can be used with the yo command to add new features, such as an Angular controller. 
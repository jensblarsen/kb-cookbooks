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
	



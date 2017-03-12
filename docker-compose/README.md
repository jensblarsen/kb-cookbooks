# Docker Compose

## Overview

Docker Compose provides a tool for defining multi-container applications.

## Dockerfile

The Dockerfile is a definition of environment-specific execution related to the application. It contains all the commands a user could call on the command line to assemble an image. 

* **# -** Comment
* **# escape=\** - this is a parser directive. It allows you to define the escape character. This parse directive can only be defined once and it must be defined at the top most of the file.
* **${variable_name:-word}** - variable name, if not set though it will default to word. Word can also be an environment variable. 
* **${variable_name:+word}** - variable name, if set return word; otherwise, return empty string. Word can also be an environment variable. 
* **ADD <src> <dest> OR ADD ["<src>", "<dest>"]** - copies new files, directories or remote file URLs from the SRCs and adds them to the filesystem of the container at the path DEST. 
    * Supports wildcards. 
    * DEST is either an absolute path or a path relative to WORKDIR. 
* **CMD** - provides defaults for an executing container
      * CMD ["executable", "param1", "paramx"] - exec form, which is preferred. 
      * CMD ["param1", "paramx"] - default parameters to ENTRYPOINT
    * CMD command param1 paramx - shell form
    * Similar to RUN, exec form does not invoke a command shell. 
    * There can only be one CMD in a Dockerfile
    * The difference between RUN and CMD is that RUN actually executes a command and commits the results while CMD does not execute anything, but specifies the intended command for the image.
* **COPY** <src> <dest> - copies new files or directories from SRC and adds them to the filesystem of the container at the path DEST. 
    * The SRC path must be inside the context of the build. 
    * If SRC is a directory, the entire directory will be copied. 
    * If DEST does not end with a slash, it will be considered a file. 
* **ENTRYPOINT** - configures a container that will run as an executable. 
* **ENV abc=xxx** - sets the environment variable value. This form is preferred vs. not using = as it creates a single layer of cache. Variables are persisted when a container is run from the resulting image and can be viewed via docker inspect. Variables can be overridden by a docker run command using the --env parameter. 
* **EXPOSE** - informs Docker that the container listens on the specified port(s) at runtime. The actual expose of the port happens through Docker networking. 
* **FROM** - This is the first instruction that should be defined in the file. It specifies the base image from which the build is based on. 
    * There are also options to use :<tag> for a specific version tag (otherwise latest is default) and @<digest>. From can 
    * From can appear multiple times within a single Dockerfile in order to create multiple images. 
* **LABEL - <key>=<value>** - Adds metadata to an image. Can use spaces with quotes. Examples may include defining the version, description, etc. 
* **MAINTAINER** - sets the author field of the generated images. 
* **RUN** - executes a command in a new layer on top of the current image and commits the results.
    * RUN <command> will run a shell command, which is either /bin/sh -c on Linux or cmd /S /C on Windows. 
    * RUN ["executable", "param1", "paramx"] 
    * Running with an executable seems preferred as it avoids shell string munging. 
    * Running a command with shell supports the \ to continue a single instruction onto the next line
    * The exec form does not invoke a command shell, so things like variable substitution are not supported unless the shell form is used to wrap the execution. 
* **USER** - the user account 
* **WORKDIR** - 

## .dockerignore File

This file is in conjunction with the Dockerfile. This would be placed in the root directory of the context. The ignore file contents include file names and extensions to be used for exclusion. 

## Docker-Compose.YML

A yaml file that defines the configuration for Docker compose on an application.

## Execution

Docker execution is based on commands, including the ability to start, stop and rebuild services, view the status of running services, stream the log output of running services and run one-off commands on a service.

	docker-compose up - starts docker compose

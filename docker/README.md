# Docker

![Docker Image](https://www.docker.com/sites/default/files/whale_0.png)

## Overview

Docker allows you to make your infrastructure more manageable, like an application. I can get my application into a container and then install that container as well as ship it up the chain of environments. The goal is immutable delivery.

There are two key reasons to use Docker:

1. **Faster Application Delivery** - As a developer, I can write applications into a local container. I can then use continuous integration to build and verify my image and finally deploy my container to its eventual target, say the cloud, a VM, etc. 
2. **Deploy and Scale Faster and More Efficient** - The docker container allows for highly-portable workloads. Can scale quickly. Since its lightweight containers, it also makes it more manageable. 

There are four key concepts to understand related to the Docker product:

1. **Images** - Images act as a blueprint with the layers needed to define the image. Layers are on top of each other. For example, you have the OS as a layer, then Node, then an NPM install. Each layer is its own image usually and each gets its own UID. When the image is pulled, it sees if it already has some stuff, so it won't re-download it. The image is the "build" where the container is the "run"
2. **Containers** - Containers run the application created by the images. They can be run, started, stopped, moved and deleted. 
3. **Registries** - Distribution component of Docker. Public Docker Hub is a registry. Can also run your own internal Docker Trusted Registry. 
4. **Docker Daemon** - Runs on a host machine and does the heavy lifting of building, running and distributing Docker containers. 
# Java Spring hello world - Noventiq value point

__A demo hello world java spring boot application__

___Running on port :___ 9001

___Endpoints :___   
    /vps-welcome   
    /vps-welcome/hello

___Environment variables :___   
APP_TITLE=string


## How to run in local

mvn spring-boot:run 

## Run as container

podman build -t springboot-hello:v1.0 -f .\Dockerfile .

podman run -d -p 9001:9001 --name springboot-hello springboot-hello:v1.0

## Deploy in k8s-ocp

oc apply -f ./k8s-manifests -n demo-namespace
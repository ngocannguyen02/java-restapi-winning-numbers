# Winning numbers

Winning numbers is a Java REST API with a mongo database.

## Installation

```bash
mvn clean install
docker build -t winning-numbers .
docker-compose up
```

If you want to run with kubernetes or minikube locally

```bash
kubectl apply -f deployment-mongo.yaml
kubectl apply -f deployment-service.yaml
```


Also don't forget with minikube to reference local docker environment

```bash
eval $(minikube docker-env)
```

And if you work with minikube, you can open the service with

```bash
minikube service winning-numbers-service
```

## Usage

http://localhost:8080/swagger-ui.html#/jackpot-controller/


## Misc

A gitlab pipeline is available (.gitlab-ci.yml). TODO Another useful to do would be to create a JenkinsFile which is most used by others. Already used at work but I prefer gitLab.
Interesting to be able to run locally your jenkins pipeline with docker
https://hub.docker.com/r/ppiper/jenkinsfile-runner


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
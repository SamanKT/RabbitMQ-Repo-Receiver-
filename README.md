# RabbitMQ-Repo-Receiver

This is a reciever service for consuming the published messages that is sent by RabbitMQ-Repo-Sender service. 

### Project features:

- a multi-stage Dockerfile which mounts a specific Maven version.
- a git repository dependent docker compose file (the only thing you should do is to copy the contents of docker-compose file and mount 
the services in your local docker destop shell :) no need to download the project files! :wink:)
- and official image of the RabbitMQ wil be pulled automatically. 

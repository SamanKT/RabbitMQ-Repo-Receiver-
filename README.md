# RabbitMQ-Repo-Receiver

![image](https://user-images.githubusercontent.com/49819814/209792551-58c0c9e1-d49b-4655-baee-d6b2d771b82f.png)

This is a reciever service for consuming the published messages that is sent by [RabbitMQ-Repo-Sender](https://github.com/SamanKT/RabbitMQ-Repo-Sender) service. 

### Project features:

- a multi-stage Dockerfile which mounts a specific Maven version.
- a **git repository dependent docker compose file** (the only thing you should do is to copy the contents of docker-compose file and mount 
the services in your local docker destop shell :) **no need to download the project files!** :wink:)
- and official image of the RabbitMQ wil be pulled automatically. 

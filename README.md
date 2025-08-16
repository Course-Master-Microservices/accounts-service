# accounts-service
Accounts Mircroservices

## Docker
### Build
```bash
docker build -t accounts-service .
```
### Run
```bash
docker run -d --name accounts-service -p 8080:8080 accounts-service
```

## Docker compose

### Config File

- docker-compose.yml

### Run
```bash
docker compose up -d
```
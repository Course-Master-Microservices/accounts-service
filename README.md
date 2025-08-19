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

## Jib Configuration
```
<plugin>
    <groupId>com.google.cloud.tools</groupId>
    <artifactId>jib-maven-plugin</artifactId>
    <version>3.4.6</version>
    <configuration>
      <to>
        <image>myimage</image>
      </to>
    </configuration>
</plugin>
```

### Build Docker Image

```
mvn compile jib:build
```
or
```
mvn compile jib:dockerBuild
```

See the [Jib documentation](https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin#build-your-image)
# Sonar false positive reproducer for java:S4449

1. Start a local SonarQube in docker from the latest version at the time of creation, specifically this [one for ARM64](https://hub.docker.com/layers/library/sonarqube/latest/images/sha256-8cc3d4f2a50c426d9a6df5ca9be19fcf6d9577066f89f3a0b846094ad0cf2ced):

```
docker run -d --name sonarqube -p 9000:9000 sonarqube:latest
```

2. Connect and configure a local project / this project directly from GitHub
3. Specify a local run and copy the configuration for Gradle
4. Build and run the sonar step against the repository
5. See the false positive alert in SonarQube
<img width="1187" alt="Screenshot 2025-02-24 at 15 08 13" src="https://github.com/user-attachments/assets/41712fd9-c1b8-453b-a7c1-41efe9e8cc01" />

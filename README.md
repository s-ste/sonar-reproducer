# Sonar false positive reproducer

1. Start a local SonarQube in docker from the latest version:

```
docker run -d --name sonarqube -p 9000:9000 sonarqube:latest
```

2. Connect and configure a local project / this project directly from GitHub
3. Build and run the sonar step against the Gradle repository
4. See the false positive alert in SonarQube
<img width="1187" alt="Screenshot 2025-02-24 at 15 08 13" src="https://github.com/user-attachments/assets/41712fd9-c1b8-453b-a7c1-41efe9e8cc01" />

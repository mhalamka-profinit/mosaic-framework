# Mosaic Microservice Parent
The purpose of this Maven parent project is to define all the common dependencies, plugins and their versions in one
place instead of copy-pasting the same dependencies into every project. It is done by including this project as a parent
project in the POM file.

## Usage
In `pom.xml` file of your project use this:
```xml
<parent>
	<groupId>com.psl</groupId>
	<artifactId>mosaic-microservice-parent</artifactId>
	<version>0.0.2</version>
</parent>
```
In order to be able to download the parent project artifact from the GitHub Packages, in `settings.xml` Maven file
create `<repository>` and `<server>` tags as shown here:
```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <activeProfiles>
    <activeProfile>github</activeProfile>
  </activeProfiles>

  <profiles>
    <profile>
      <id>github</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
        </repository>
        <repository>
          <id>github-gojoko-mosaic-microservice-parent</id>
          <url>https://maven.pkg.github.com/gojoko-marketing/mosaic-microservice-parent</url>
          <snapshots><enabled>true</enabled></snapshots>
          <releases><enabled>true</enabled></releases>
        </repository>
      </repositories>
    </profile>
  </profiles>

  <servers>
    <server>
      <id>github-gojoko-mosaic-microservice-parent</id>
      <username>YOUR-GITHUB-USERNAME</username>
      <password>YOUR-GITHUB-PERSONAL-ACCESS-TOKEN</password>
    </server>
  </servers>
</settings>
```
When generating your GitHub Personal Access Token (GitHub -> Settings -> Developer settings -> Personal access tokens)
make sure to check the permission `read:packages`.

## List of actual common dependencies and plugins
Defined dependencies:
- org.springframework.boot:spring-boot-starter-data-jpa:2.7.0
- org.springframework.boot:spring-boot-starter-webflux:2.7.0
- org.springframework.boot:spring-boot-configuration-processor:2.7.0
- mysql:mysql-connector-java:8.0.29
- com.amazonaws:aws-java-sdk:1.12.237
- software.amazon.awssdk:secretsmanager:2.17.206
- com.amazonaws:aws-java-sdk-core:1.12.237
- com.amazonaws:aws-java-sdk-secretsmanager:1.12.237
- com.amazonaws:aws-java-sdk-s3:1.12.237
- org.eclipse.jetty:jetty-reactive-httpclient:3.0.5

Included dependencies:
- org.springframework.boot:spring-boot-starter-web:2.7.0
- org.springframework.boot:spring-boot-starter-validation:2.7.0
- org.springframework.boot:spring-boot-devtools:2.7.0
- org.projectlombok:lombok:1.18.24
- org.springframework.boot:spring-boot-starter-test:2.7.0
- org.springframework.boot:spring-boot-starter-actuator:2.7.0
- org.json:json:20220320
- com.zaxxer:HikariCP:5.0.1
- org.springdoc:springdoc-openapi-ui:1.6.9

Plugins:
- io.github.git-commit-id:git-commit-id-maven-plugin:5.0.0
- org.jacoco:jacoco-maven-plugin:0.8.3
- org.apache.maven.plugins:maven-release-plugin:3.0.0-M6
- org.springframework.boot:spring-boot-maven-plugin:2.7.0
- org.apache.maven.plugins:maven-surefire-plugin:3.0.0-M7

## Version changes
### 0.0.2
Only define (not include) those dependencies:
- org.springframework.boot:spring-boot-starter-web:2.7.0
- org.springframework.boot:spring-boot-starter-validation:2.7.0
- org.springframework.boot:spring-boot-devtools:2.7.0
- org.projectlombok:lombok:1.18.24
- org.springframework.boot:spring-boot-starter-test:2.7.0
- org.springframework.boot:spring-boot-starter-actuator:2.7.0
- org.json:json:20220320
- com.zaxxer:HikariCP:5.0.1
- org.springdoc:springdoc-openapi-ui:1.6.9

### 0.0.1
initial version

Included dependencies:
- org.springframework.boot:spring-boot-starter-data-jpa:2.7.0
- org.springframework.boot:spring-boot-starter-webflux:2.7.0
- org.springframework.boot:spring-boot-configuration-processor:2.7.0
- org.springframework.boot:spring-boot-starter-web:2.7.0
- org.springframework.boot:spring-boot-starter-validation:2.7.0
- org.springframework.boot:spring-boot-devtools:2.7.0
- org.projectlombok:lombok:1.18.24
- org.springframework.boot:spring-boot-starter-test:2.7.0
- org.springframework.boot:spring-boot-starter-actuator:2.7.0
- org.json:json:20220320
- com.zaxxer:HikariCP:5.0.1
- org.springdoc:springdoc-openapi-ui:1.6.9
- mysql:mysql-connector-java:8.0.29
- com.amazonaws:aws-java-sdk:1.12.237
- software.amazon.awssdk:secretsmanager:2.17.206
- com.amazonaws:aws-java-sdk-core:1.12.237
- com.amazonaws:aws-java-sdk-secretsmanager:1.12.237
- com.amazonaws:aws-java-sdk-s3:1.12.237
- org.eclipse.jetty:jetty-reactive-httpclient:3.0.5

Plugins:
- io.github.git-commit-id:git-commit-id-maven-plugin:5.0.0
- org.jacoco:jacoco-maven-plugin:0.8.3
- org.apache.maven.plugins:maven-release-plugin:3.0.0-M6
- org.springframework.boot:spring-boot-maven-plugin:2.7.0
- org.apache.maven.plugins:maven-surefire-plugin:3.0.0-M7
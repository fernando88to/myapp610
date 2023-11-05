## My App 

Aplicação de estudo do grails 6.1.0

### Create Controller

grails create-controller

### Anotações

A ferramente de cobertura do intellij com a opção jacoco até que funcionou bem


### Lista todas as tasks

./gradlew tasks --all

### Docker

`
./gradlew war
docker build .  -t myapp:latest
docker run --rm -d -p 8080:8080 myapp:latest
`

### Tabela de comandos

| Comando Grails |Comando Gladew  |
|--|--|
|grails war  | ./gradlew assemble |
|grails check  | ./gradlew test-app |
|grails test  | grails test-app -unit |
|grails integrationTest  | grails test-app -integration |


### Ativação do hot Reloading

É necessário da seguinte dependência

`
developmentOnly("org.springframework.boot:spring-boot-devtools")
`



### Grails 6.1.0 Documentation

- [User Guide](https://docs.grails.org/6.1.0/guide/index.html)
- [API Reference](https://docs.grails.org/6.1.0/api/index.html)
- [Grails Guides](https://guides.grails.org/index.html)
---

### Feature asset-pipeline-grails documentation

- [Grails Asset Pipeline Core documentation](https://www.asset-pipeline.com/manual/)

### Feature geb documentation

- [Grails Geb Functional Testing for Grails documentation](https://github.com/grails3-plugins/geb#readme)

- [https://www.gebish.org/manual/current/](https://www.gebish.org/manual/current/)

### Feature scaffolding documentation

- [Grails Scaffolding Plugin documentation](https://grails.github.io/scaffolding/latest/groovydoc/)

- [https://grails-fields-plugin.github.io/grails-fields/latest/guide/index.html](https://grails-fields-plugin.github.io/grails-fields/latest/guide/index.html)
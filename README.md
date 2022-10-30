# Pismo - Test

### Pré-requisitos:
* [java 17](https://openjdk.org/install/)
* [gradle 7.5.1](https://gradle.org/install/)
* [docker 20.10.12](https://docs.docker.com/engine/install/)
* [docker-compose 1.25.0](https://docs.docker.com/compose/install/linux/)

### Como executar:
Primeiro, é necessário executar o banco de dados através do docker-compose. Pra isso, precisamos acessar o diretório docker-compose/, executar o serviço e inicializar a base com os seguintes comandos:

##### Acesse o diretório docker-compose/:
``` 
$ cd docker-compose/
``` 
##### Execute o serviço:
```
$ docker-compose up -d
```
##### Inicialize o banco de dados:
```
$ sh postgres/init.sh
```

Com o banco de dados inicializado, podemos rodar a aplicação. Para isso precisamos voltar para o diretório raiz, buildar a aplicação e depois executa-la com os seguintes comandos:

##### Volte para o diretório raiz:
```
$ cd ../
```
##### Rode o build:
```
$ gradle clean build
```
##### Execute o serviço:
```
$ gradle bootrun
```
Pronto, o serviço já pode ser acessado através da porta 8080. Caso queira testar os endpoints através do Postman, uma coleção com os endpoints está disponível para ser importada no diretório postman/.

# Arquitetura
A arquitetura utilizada na solução é a arquitetura hexagonal. O intuito é isolar as classes de dominio a ponto de não dependerem do framework utilizado, diminuir o acoplamento e facilitar os testes unitários. Sabemos que em aplicações pequenas, essa seria uma solução exagerada, mas no contexto empresarial, sistemas de informações crescem conforme novas necessidades aparecem e sem uma arquitetura bem definida, as classes naturalmente se acoplam cada vez mais, dificultando a manutenção da aplicação e criando sistemas legados.
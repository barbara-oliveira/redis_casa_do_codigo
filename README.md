# Redis
Exemplos do livro "Armazenando dados com Redis" do Rodrigo Lazoti

# setup

  - Baixe o código fonte: https://redis.io/download
  - Descompacte e entre na pasta redis-6.x.x via linha de comando
  - Execute o comando make
  - Entre em ./src
  - Execute o comando ./redis-server
  - Execute o comando ./redis-cli

O terminal deve ficar assim:
```sh
127.0.0.1:6379> algum_comando_aqui 
```

### Comandos
ECHO: Apresenta a mensagem que é recebida como parâmetro
```sh
$ ECHO "ola mundo"
```
SET: Recebe dois argumentos (chave e valor) e gera um registro no banco.
```sh
$ SET ultimo_usuario_logado "Bruce Wayne"
```
GET: Apresenta o valor através da chave que é recebida como parâmetro.
```sh
$ GET ultimo_usuario_logado "Bruce Wayne"
```
DEL: Remove o registro através de chave que é recebida como parâmetro.
```sh
$ DEL ultimo_usuario_logado
```

### Tipos de dados 

- String
- List
- Hash
- Set
- Sorted Set 

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

### Analisar o desempenho do redis

- Dentro do diretório /redis-6.0.7/src executar o comando a seguir: 

```
./redis-benchmark -c 10 -n 10000 -q
```

### Observações

O comando "MONITOR" é utilizado para analisar os comandos de outras instancias executados pelo redis, ele é útil para analisar possíveis problemas.

 
 - Exemplo de retorno:
 ```
 127.0.0.1:6379> MONITOR
 OK
 1602445498.563685 [0 127.0.0.1:59044] "get" "numero-de-acessos"
 ```
- IMPORTANTE: Este comando diminui em quase 50% o desempenho do Redis, cuidado ao utilizá-lo.

Além do redis-server e redis-cli, existe o redis-benchmark que faz uma análise do desempenho do redis.

- Comando:
 ```
./redis-benchmark -c 10 -n 10000 -q
 ```
 
 - -c 10 (10 conexões paralelas)
   
 - -n 10000 (10.000 requisições)
 
 - -q (modo silencioso, exibe apenas o resultado)
 
 - Exemplo de retorno:
```
PING_INLINE: 73529.41 requests per second
PING_BULK: 75187.97 requests per second
SET: 71942.45 requests per second
GET: 71942.45 requests per second
INCR: 74626.87 requests per second
LPUSH: 64516.13 requests per second
RPUSH: 63291.14 requests per second
LPOP: 71942.45 requests per second
RPOP: 76923.08 requests per second
SADD: 74626.87 requests per second
HSET: 75187.97 requests per second
SPOP: 75187.97 requests per second
ZADD: 71428.57 requests per second
ZPOPMIN: 70921.98 requests per second
LPUSH (needed to benchmark LRANGE): 75187.97 requests per second
LRANGE_100 (first 100 elements): 42553.19 requests per second
LRANGE_300 (first 300 elements): 16863.41 requests per second
LRANGE_500 (first 450 elements): 12594.46 requests per second
LRANGE_600 (first 600 elements): 9775.17 requests per second
MSET (10 keys): 69444.45 requests per second
 ```

- FLUSHDB: Apaga todas as chaves do banco atual do redis.
 ```
127.0.0.1:6379[8]&gt; FLUSHDB
OK
127.0.0.1:6379[8]&gt; keys *
(empty array)
127.0.0.1:6379[8]&gt; 
 ```

- FLUSHALL: Apaga todas as chaves de todos os bancos do redis.

package com.example.redis;

import redis.clients.jedis.Jedis;

public class Application {
    public static void main(String [] args) {

        Jedis jedis = new Jedis("localhost");
        String resultadoEcho = jedis.echo("ola redis!");
        System.out.println(resultadoEcho);

        String resultadoSet = jedis.set("ultimo_usuario_logado", "Mulher-Maravilha");
        System.out.println(resultadoSet);

        String resultadoGet = jedis.get("ultimo_usuario_logado");
        System.out.println(resultadoGet);

//        String resultadoDel = String.valueOf(jedis.del("ultimo_usuario_logado"));
//        System.out.println(resultadoDel);

    }
}

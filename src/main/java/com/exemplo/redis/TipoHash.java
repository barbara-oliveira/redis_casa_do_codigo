package com.exemplo.redis;

import redis.clients.jedis.Jedis;

public class TipoHash {
    public static void main(String[] args) {
        String ganhadores1 = "34";
        String dataDoSorteio1 = "04-09-2013";
        String numeroDoSorteio1 = "01, 23, 6, 9";
        String chavesDoSorteio1 = String.format("resultado:%s:megasena", dataDoSorteio1);

        Jedis jedis = new Jedis("localhost");
//        Long res1 = jedis.hset("novachave", "ganhadores", ganhadores1);
//        Long res11 = jedis.hset("novachave", "numeros", numeroDoSorteio1);

        String retorno = jedis.hget("novachave", "numeros");
        System.out.println(retorno);


    }
}

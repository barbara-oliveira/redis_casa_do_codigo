package com.exemplo.redis;

import redis.clients.jedis.Jedis;

public class Tipos {
    public static void main(String[] args) {
        String dataDoSorteio1 = "04-09-2013";
        String numerDoSorteio1 = "01, 23, 6, 9";
        String chavesDoSorteio1 = String.format("resultado:%s:megasena", dataDoSorteio1);

        String dataDoSorteio2 = "04-10-2013";
        String numerDoSorteio2 = "02, 33, 46, 29";
        String chavesDoSorteio2 = String.format("resultado:%s:megasena", dataDoSorteio2);

        String dataDoSorteio3 = "07-09-2013";
        String numerDoSorteio3 = "11, 3, 61, 91";
        String chavesDoSorteio3 = String.format("resultado:%s:megasena", dataDoSorteio3);

        Jedis jedis = new Jedis("localhost");

        String resultado = jedis.mset(
                chavesDoSorteio1, numerDoSorteio1,
                chavesDoSorteio2, numerDoSorteio2,
                chavesDoSorteio3, numerDoSorteio3
        );

        System.out.println(resultado);
    }



}

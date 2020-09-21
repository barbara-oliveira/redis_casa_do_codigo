package com.example.redis;

import redis.clients.jedis.Jedis;

import java.util.List;

public class ExemploListaRedis {
    public static void main(String[] args) {
        String chave = "ultimas_paginas_visitadas";
        String[] paginasVisitadas = {
                "/inicio",
                "/contato",
                "/sobre-mim",
                "/todos-os-posts",
                "/armazenando-dados-no-redis"
        };

        Jedis jedis = new Jedis("localhost");
//        Long resultado = jedis.lpush(chave, paginasVisitadas);
//        System.out.println(
//                String.format("A lista %s contém %d elementos", chave, resultado)
//        );
//
//        List<String> paginas = jedis.lrange(chave, 0, 2);
//        System.out.println("As 3 ultimas págnias visitadas são:");
//        for (String pagina: paginas) {
//            System.out.println(pagina);
//        }

        String resultado = jedis.ltrim(chave, 0, 2);
        System.out.println(String.format("Resultado: %s", resultado));
    }
}

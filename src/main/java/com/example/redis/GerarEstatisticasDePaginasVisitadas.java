package com.example.redis;

import redis.clients.jedis.Jedis;

public class GerarEstatisticasDePaginasVisitadas {
    public void gerarEstatistica(String pagina, String data) {
        String chave = String.format("pagina:%s:%s", pagina, data);
        Jedis jedis = new Jedis("localhost");
        long resultado = jedis.incr(chave);
        System.out.println(String.format("A página %s teve %d acessos em %s", pagina, resultado, data));
    }
}

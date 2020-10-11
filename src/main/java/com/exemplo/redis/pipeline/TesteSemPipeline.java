package com.exemplo.redis.pipeline;

import redis.clients.jedis.Jedis;

public class TesteSemPipeline {
    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();
        Jedis jedis = new Jedis("localhost");

        for(int i = 1; i < 100000; i++) {
            jedis.set("chave-" + i, String.valueOf(i));
        }

        long tempoFinal = System.currentTimeMillis();
        System.out.println(String.format("Tempo total: %.2f segundos", (tempoFinal - tempoInicial) / 1000.0));
    }
}

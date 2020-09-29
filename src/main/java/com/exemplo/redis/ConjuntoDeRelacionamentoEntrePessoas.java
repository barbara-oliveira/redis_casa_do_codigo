package com.exemplo.redis;

import redis.clients.jedis.Jedis;

import java.util.Arrays;

public class ConjuntoDeRelacionamentoEntrePessoas {
    public void adicionaAmigos(String pessoa, String[] amigos) {
        String chave = String.format("pessoas:%s:relacionamentos", pessoa);
        Jedis jedis = new Jedis("localhost");
        long resultado = jedis.sadd(chave, amigos);
        System.out.println(String.format("%s tem %d amigos %s", pessoa, resultado, Arrays.toString(amigos)));
    }

    public static void main(String[] args) {
        ConjuntoDeRelacionamentoEntrePessoas relacionamentos = new ConjuntoDeRelacionamentoEntrePessoas();
        relacionamentos.adicionaAmigos("rafael", new String[]{"gustavo", "andressa", "rodrigo", "tereza"});
        relacionamentos.adicionaAmigos("andressa", new String[]{"cristiane", "gustavo", "rodrigo", "rafael"});
        relacionamentos.adicionaAmigos("gustavo", new String[]{"carlos", "andressa", "rafael", "tereza"});
        relacionamentos.adicionaAmigos("cristiane", new String[]{"carlos", "andressa", "tereza"});
        relacionamentos.adicionaAmigos("carlos", new String[]{"cristiane", "gustavo", "rodrigo"});
        relacionamentos.adicionaAmigos("rodrigo", new String[]{"carlos", "andressa", "rafael"});
        relacionamentos.adicionaAmigos("tereza", new String[]{"cristiane", "gustavo", "rafael"});
    }
}

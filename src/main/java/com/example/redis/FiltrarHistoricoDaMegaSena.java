package com.example.redis;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

public class FiltrarHistoricoDaMegaSena {
    public Set<String> filtrarResultados(int mes, int ano) {
        String chave = String.format("resultado:0*-%02d-%04d:megasena", mes, ano);
        Jedis jedis = new Jedis("localhost");
        return jedis.keys(chave);
    }

    public void buscaPorMultiplasChaves() {
        Jedis jedis = new Jedis("localhost");
        List<String> valores = jedis.mget("ultimo_usuario_logado", "resultado:07-09-2013:megasena");
        System.out.println(valores);
    }

    public void buscaTamanhoValor() {
        Jedis jedis = new Jedis("localhost");
        long tamanho = jedis.strlen("ultimo_usuario_logado");
        System.out.println(tamanho);
    }

    public void buscaPedacoValor(int inicio, int fim) {
        Jedis jedis = new Jedis("localhost");
        String pedaco = jedis.getrange("resultado:07-09-2013:megasena", inicio, fim);
        System.out.println(pedaco);
    }
}

package com.example.redis;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpirandoChaves {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        String codigoUsuario = "1962";
        String nomeUsuario = "Peter Parker";
        String emailUsuario = "spider@marvel.com";

        String chave = "chave:"+codigoUsuario+":sessao";

        Map<String, String> campos = new HashMap<String, String>() {{
                put("codigo", codigoUsuario);
                put("nome", nomeUsuario);
                put("email", emailUsuario);

        }};

        int trintaMinutosEmSegundos = 1800;

        String resultado = jedis.hmset(chave, campos);
        System.out.println(resultado);

        Long resultadoExpire = jedis.expire(chave, trintaMinutosEmSegundos);
        System.out.println(resultadoExpire);

        Long resultadoPersiste = jedis.persist(chave);
        List<String> camposMget = jedis.hmget(chave, "nome", "email", "codigo");
        System.out.println(camposMget);

    }
}

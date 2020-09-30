package com.exemplo.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

import java.util.Iterator;
import java.util.Set;

public class Top5Jogadores {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
//        Set<String> jogadores = jedis.zrevrange("scores", 0, 4);
//        Iterator<String> iterator = jogadores.iterator();
//        for (int index = 1; iterator.hasNext(); index++) {
//            System.out.println(
//                    String.format("Posição %d - %s", index,
//                            iterator.next())
//            );
//        }

        Set<Tuple> jogadores =
                jedis.zrevrangeWithScores("scores", 0, 4);
        Iterator<Tuple> iterator = jogadores.iterator();
        for (int index = 1; iterator.hasNext(); index++) {
            Tuple tuple = iterator.next();
            System.out.println(String.format(
                    "Posição %d - %s (%.0f pontos)",
                    index,
                    tuple.getElement(),
                    tuple.getScore()
                    )
            );
        }
    }
}

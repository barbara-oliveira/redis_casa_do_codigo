package com.example.redis;

import java.util.Set;

public class BuscaRedis {
    public static void main(String[] args) {
        int mes = 9;
        int ano = 2013;

        FiltrarHistoricoDaMegaSena filtrarHistoricoDaMegaSena = new FiltrarHistoricoDaMegaSena();

//        Set<String> chaves = filtrarHistoricoDaMegaSena.filtrarResultados(mes, ano);
//        System.out.println(chaves);

        filtrarHistoricoDaMegaSena.buscaPorMultiplasChaves();

        filtrarHistoricoDaMegaSena.buscaTamanhoValor();

        filtrarHistoricoDaMegaSena.buscaPedacoValor(0, 1);
        filtrarHistoricoDaMegaSena.buscaPedacoValor(11, 12);
    }
}

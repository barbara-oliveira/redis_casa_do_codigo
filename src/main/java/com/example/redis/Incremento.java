package com.example.redis;

public class Incremento {
    public static void main(String[] args) {
        String data = "02/09/2013";
        String[] paginasVisitadas = {
                "/inicio",
                "/contato",
                "/sobre-mim"
        };

        GerarEstatisticasDePaginasVisitadas gerarEstatisticasDePaginasVisitadas = new GerarEstatisticasDePaginasVisitadas();
        gerarEstatisticasDePaginasVisitadas.gerarEstatistica(paginasVisitadas[0], data);
        gerarEstatisticasDePaginasVisitadas.gerarEstatistica(paginasVisitadas[1], data);
        gerarEstatisticasDePaginasVisitadas.gerarEstatistica(paginasVisitadas[2], data);
    }
}

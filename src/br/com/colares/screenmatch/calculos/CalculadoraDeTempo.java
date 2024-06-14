package br.com.colares.screenmatch.calculos;

import br.com.colares.screenmatch.modelos.Filme;
import br.com.colares.screenmatch.modelos.Serie;
import br.com.colares.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}

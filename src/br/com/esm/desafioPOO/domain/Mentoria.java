package br.com.esm.desafioPOO.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {


    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescicaoConteudo() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}

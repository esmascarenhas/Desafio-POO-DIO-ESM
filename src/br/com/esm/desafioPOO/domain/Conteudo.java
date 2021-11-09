package br.com.esm.desafioPOO.domain;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String DescicaoConteudo;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescicaoConteudo() {
        return DescicaoConteudo;
    }

    public void setDescicaoConteudo(String descicaoConteudo) {
        DescicaoConteudo = descicaoConteudo;
    }
}

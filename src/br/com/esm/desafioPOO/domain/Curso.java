package br.com.esm.desafioPOO.domain;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public String toString() {
        return "Cursos{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescicaoConteudo() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}

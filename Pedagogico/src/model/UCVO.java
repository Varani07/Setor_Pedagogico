package model;

public class UCVO {
    private int id_uc, modulo, curso, cargaHoraria;

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    private String nome_uc;

    public int getId_uc() {
        return id_uc;
    }

    public void setId_uc(int id_uc) {
        this.id_uc = id_uc;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome_uc() {
        return nome_uc;
    }

    public void setNome_uc(String nome_uc) {
        this.nome_uc = nome_uc;
    }
}

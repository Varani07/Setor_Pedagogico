package model;

public class ModVO {
    private int id_modulo, curso;

    public int getId_modulo() {
        return id_modulo;
    }

    public void setId_modulo(int id_modulo) {
        this.id_modulo = id_modulo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getNome_modulo() {
        return nome_modulo;
    }

    public void setNome_modulo(String nome_modulo) {
        this.nome_modulo = nome_modulo;
    }
    String nome_modulo;
}

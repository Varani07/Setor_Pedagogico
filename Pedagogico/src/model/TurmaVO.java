package model;

import java.sql.Date;

public class TurmaVO {
    private boolean m1 = false, m2 = false, m3 = false, m4 = false;
    private String nome_turma, turno, ano_turma;
    private int id_turma, curso;

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public boolean isM1() {
        return m1;
    }

    public void setM1(boolean m1) {
        this.m1 = m1;
    }

    public boolean isM2() {
        return m2;
    }

    public void setM2(boolean m2) {
        this.m2 = m2;
    }

    public boolean isM3() {
        return m3;
    }

    public void setM3(boolean m3) {
        this.m3 = m3;
    }

    public boolean isM4() {
        return m4;
    }

    public void setM4(boolean m4) {
        this.m4 = m4;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public String getAno_turma() {
        return ano_turma;
    }

    public void setAno_turma(String ano_turma) {
        this.ano_turma = ano_turma;
    }
}

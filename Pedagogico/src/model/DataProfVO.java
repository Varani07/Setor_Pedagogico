package model;

import java.sql.Date;

public class DataProfVO {
    private int id, id_cronograma, id_professor, id_uc;
    private String turno;
    private Date data_inicio, data_fim;

    public int getId_uc() {
        return id_uc;
    }

    public void setId_uc(int id_uc) {
        this.id_uc = id_uc;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cronograma() {
        return id_cronograma;
    }

    public void setId_cronograma(int id_cronograma) {
        this.id_cronograma = id_cronograma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }
}

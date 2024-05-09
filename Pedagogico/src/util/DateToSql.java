package util;

public class DateToSql {
    public java.sql.Date convertDatatosql(java.util.Date data){
        java.sql.Date sqlDate = new java.sql.Date(data.getTime());
        return sqlDate;
    }
}

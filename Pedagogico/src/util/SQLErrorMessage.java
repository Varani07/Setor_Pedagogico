package util;

public class SQLErrorMessage {
    public String sqlError(String field, String db_name){
        String duplicateKey = "Duplicate entry '" + field + "' for key '" + db_name + "'";
        return duplicateKey;
    }
}

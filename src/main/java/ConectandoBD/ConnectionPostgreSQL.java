package ConectandoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class ConnectionPostgreSQL {

    private static String URL = "jdbc:postgresql://localhost:5433/agenda_";
    private static String USER = "postgres";
    private static String PASSWORD = "admin";

    public static Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexao realizada com sucesso!");
        }catch (SQLException ex){
            System.out.println("Erro ao tentar conectar o BD!");
        }
        return connection;
    }

}

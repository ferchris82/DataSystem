package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection conectar(){
        try{
            Connection cn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ds","root","root");
            return cn;        
        }catch(SQLException e){
            System.err.println("Ha ocurrido un SQLException " + e.getMessage());
        }
        return(null);
    }
}
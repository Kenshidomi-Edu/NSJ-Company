package Controlador;

import ConexionBD.Conexion;
import Modelo.Producto;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class ControladorVentas {

    public boolean buscar(Producto producto) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = con.getconectar();

        try {

            ps = conexion.prepareStatement("select codigoI,nombre,precio,stock from producto where codigoI=?");
            ps.setString(1, producto.getCodigoI());
            rs = ps.executeQuery();
            
            if(rs.next()){
                producto.setCodigoI(rs.getString("codigoI"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setStock(rs.getInt("stock"));
                return true;
            }else{
                return false;
            }
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
            System.err.println("Error, "+ex);
            }    
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Persona;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Alexis Murillo
 */
public class PersonaDAO implements CRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p = new Persona();

    @Override
    public List listar() {
        ArrayList<Persona> list = new ArrayList<>();
        String sql = "Select * from clientes";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona per = new Persona();
                per.setNumero(rs.getInt("numero_cliente"));
                per.setNombre(rs.getString("nombre_cliente"));
                per.setEmail(rs.getString("email"));
                per.setPoliza(rs.getString("tipo_poliza"));
                per.setSuma(rs.getInt("suma_asegurada"));
                per.setFecha(rs.getString("fecha_inicio_poliza"));
                list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Persona list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Persona per) {
        String sql = "insert into clientes (numero_cliente, nombre_cliente, email, tipo_poliza, suma_asegurada, fecha_inicio_poliza) values ('" + per.getNumero() + "', '" + per.getNombre() + "', '" + per.getEmail() + "', '" + per.getPoliza() + "', '" + per.getSuma() + "', '" + per.getFecha() + "')";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}

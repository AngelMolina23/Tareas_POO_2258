package org.example.database;

import org.example.modelo.Kpop;
import org.example.vista.VentanaKpop;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class KpopDAO implements InterfazDAO{
    private VentanaKpop view;
    public KpopDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Kpop(nombre,integrantes,agencia,fundacion,imagen) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Kpop.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,(((Kpop)obj)).getNombre());
        pstm.setInt(2,(((Kpop)obj)).getNumeroDeIntegrantes());
        pstm.setString(3,(((Kpop)obj)).getAgencia());
        pstm.setInt(4,(((Kpop)obj)).getFundacion());
        pstm.setString(5,(((Kpop)obj)).getImagen());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE kpop SET nombre = ?, integrantes = ?, agencia = ?, fundacion = ?, imagen = ? WHERE id = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Kpop.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,(((Kpop)obj)).getNombre());
        pstm.setInt(2,(((Kpop)obj)).getNumeroDeIntegrantes());
        pstm.setString(3,(((Kpop)obj)).getAgencia());
        pstm.setInt(4,(((Kpop)obj)).getFundacion());
        pstm.setString(5,(((Kpop)obj)).getImagen());
        pstm.setInt(6,(((Kpop)obj)).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete (String id) throws SQLException {
        String sqlDelete = "DELETE FROM kpop WHERE id = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Kpop.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT *FROM kpop";
        ArrayList<Kpop> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("Kpop.db").getConnection().createStatement();

        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Kpop(rst.getInt(1),rst.getString(2),rst.getInt(3),
                            rst.getString(4),rst.getInt(5),rst.getString(6))
                    );
        }
        return resultado;

    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT *FROM kpop WHERE id = ? ;";
        Kpop kpop = null;
        PreparedStatement pstm = ConexionSingleton.getInstance("Kpop.db").getConnection().prepareStatement(sql);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            kpop = new Kpop(rst.getInt(1),rst.getString(2),rst.getInt(3),
                    rst.getString(4),rst.getInt(5),rst.getString(6));
            return kpop;
        }
        return null;

    }
}

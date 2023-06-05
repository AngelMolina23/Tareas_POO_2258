package org.example.modelo;

import org.example.database.KpopDAO;
import org.example.controlador.ControladorKpop;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaKpop implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<Kpop> datos;
    private KpopDAO ldao;

    public ModeloTablaKpop() {
        ldao = new KpopDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaKpop(ArrayList<Kpop> datos) {
        this.datos = datos;
        ldao = new KpopDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Numero de Integrantes";
            case 3:
                return "Agencia";
            case 4:
                return "Año de Fundacion";
            case 5:
                return "Url imagen";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return String.class;
            case 4:
                return Integer.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 0)
            return false;
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Kpop tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getNumeroDeIntegrantes();
            case 3:
                return tmp.getAgencia();
            case 4:
                return tmp.getFundacion();
            case 5:
                return tmp.getImagen();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                 datos.get(rowIndex).setId(0);
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) o);
                break;
            case 2:
                datos.get(rowIndex).setNumeroDeIntegrantes((Integer) o);
                break;
            case 3:
                datos.get(rowIndex).setAgencia((String) o);
                break;
            case 4:
                datos.get(rowIndex).setFundacion((Integer) o);
                break;
            case 5:
                datos.get(rowIndex).setImagen((String) o);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try {
            datos = ldao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    public boolean eliminarGrupo (String id){
        boolean resultado = false;
        try {
            if (ldao.delete(id)){
                resultado = true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqlle){
            System.out.println(sqlle.getMessage());
        }
        return resultado;
    }

    public boolean actualizarGrupo (Kpop kpopActualizada){
        boolean resultado = false;
        try {
            if (ldao.update(kpopActualizada)){
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqlee){
            System.out.println(sqlee.getMessage());
        }
        return resultado;
    }
    public Kpop getGrupoAtIndex (int index){
        return datos.get(index);
    }

    public boolean agregarGrupo (Kpop kpop){
        boolean resultado = false;
        try{
            if (ldao.insertar(kpop)){
                datos.add(kpop);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

}

package org.example.controlador;

import org.example.modelo.Kpop;
import org.example.modelo.ModeloTablaKpop;
import org.example.vista.VentanaKpop;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;

public class ControladorKpop extends MouseAdapter {
    private VentanaKpop view;
    private ModeloTablaKpop modelo;

    public ControladorKpop(VentanaKpop view) {
        this.view = view;
        modelo = new ModeloTablaKpop();
        this.view.getTblKpop().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblKpop().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
    }

//eventps del mouse
    @Override
    public void mouseClicked(MouseEvent e) {
        //boton cargar
        if (e.getSource() == this.view.getBtnCargar()){
            modelo = new ModeloTablaKpop();
            modelo.cargarDatos();
            this.view.getTblKpop().setModel(modelo);

        }
       //evento boton de eliminar
        if (e.getSource() == this.view.getBtnEliminar()){
            int  fila = this.view.getTblKpop().getSelectedRow();
            String id = String.valueOf(modelo.getGrupoAtIndex(fila).getId());
            //confirmacion de eliminar fila
            int confirmacion =JOptionPane.showConfirmDialog(view, "¿Seguro que quieres borrar el elemento con indice: "
                    + id + "?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if(confirmacion == 0){
                if(modelo.eliminarGrupo(id)){
                    JOptionPane.showMessageDialog(view, "Se borro ese renglon");
                    modelo.cargarDatos();
                    this.view.getTblKpop().setModel(modelo);
                    this.view.getTblKpop().updateUI();
                } else{
                    JOptionPane.showMessageDialog(view, "No has cargado la tabla");
                }
            }

        }

            if (e.getSource() == this.view.getTblKpop()){
                int index = this.view.getTblKpop().getSelectedRow();
                Kpop tmp = modelo.getGrupoAtIndex(index);
                try {
                    this.view.getLblImagePanel3().setIcon(tmp.getImage());
                }catch (MalformedURLException mfue){
                    System.out.println(e.toString());
                }

            }
         //Actualizacion de grupo
        if (e.getSource() == this.view.getBtnActualizar()){
            Kpop kpopActualizada = new Kpop();
            int  fila = this.view.getTblKpop().getSelectedRow();
            String id = String.valueOf(modelo.getGrupoAtIndex(fila).getId());
            kpopActualizada.setId(Integer.parseInt(id));
            kpopActualizada.setNombre(this.view.getTblKpop().getValueAt(fila,1).toString());
            kpopActualizada.setAgencia(this.view.getTblKpop().getValueAt(fila,3).toString());
            kpopActualizada.setImagen(this.view.getTblKpop().getValueAt(fila,5).toString());
            try {
                kpopActualizada.setNumeroDeIntegrantes(Integer.parseInt(this.view.getTblKpop().getValueAt(fila,2).toString()));
                kpopActualizada.setFundacion(Integer.parseInt(this.view.getTblKpop().getValueAt(fila,4).toString()));
            }catch (NumberFormatException cce){
                System.out.println(cce.getMessage());
            }
            System.out.println(kpopActualizada);
            int confirmacion =JOptionPane.showConfirmDialog(view, "¿Seguro que quieres actulizar la fila con indice: "
                    + id + "?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (confirmacion == 0){
                if (modelo.actualizarGrupo(kpopActualizada)){
                JOptionPane.showMessageDialog(view,"el campo selecciona se actualizo correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblKpop().updateUI();
            }else {
                JOptionPane.showMessageDialog(view,"No se pudo agregar a la base de datos. Por favor revise su conexion","Error al insertar",JOptionPane.ERROR_MESSAGE);
            }

            }

        }
        //sentencia para agregar grupo
        if (e.getSource() == this.view.getBtnAgregar()){
            Kpop kpop = new Kpop();
            kpop.setId(0);
            kpop.setNombre(this.view.getTxtNombre().getText());
            kpop.setNumeroDeIntegrantes(Integer.parseInt(this.view.getTxtNumeroIntegrantes().getText()));
            kpop.setAgencia(this.view.getTxtAgencia().getText());
            kpop.setFundacion(Integer.parseInt(this.view.getTxtAnoFundacion().getText()));
            kpop.setImagen(this.view.getTxtImagen().getText());

            if (modelo.agregarGrupo(kpop)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblKpop().updateUI();
            }else {
                JOptionPane.showMessageDialog(view,"No se pudo agregar a la base de datos. Por favor revise su conexion","Error al insertar",JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }
    }

}
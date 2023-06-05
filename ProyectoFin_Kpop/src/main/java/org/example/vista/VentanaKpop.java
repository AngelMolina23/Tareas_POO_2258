package org.example.vista;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class VentanaKpop extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblNumeroIntegrantes;
    private JLabel lblAgencia;
    private JLabel lblAnoFundacion;
    private JLabel lblImagen;
    private JTextField txtId;
    private JTextField txtNombre;
    private JLabel lblImagePanel3;
    private JTextField txtNumeroIntegrantes;
    private JTextField txtAgencia;
    private JTextField txtAnoFundacion;
    private JTextField txtImagen;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JTable tblKpop;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1; //Formulario para capturar grupos de kpop
    private JPanel panel2;//Tabla para mostrar los grupos
    private JPanel panel3;// Imagen
    private JPanel panel4;// Editar tabla
    private JLabel lblInfoActualizar;//mensaje para actulizar
    //instruciones para actualizar
    private JLabel lblInfoActualizarInt1;
    private JLabel lblInfoActualizarInt2;
    private JLabel lblInfoActualizarInt3;
    private JLabel lblInfo;//mensaje corto de como funcionan los botones
    private JButton btnEliminar; //boton de eliminar reglones
    private JButton btnActualizar; //boton para actualizar

    public VentanaKpop(String title) throws HeadlessException {
        super(title);
        this.setSize(700,700);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(117, 121, 225));
        lblId = new JLabel("Id: ");
        lblNombre = new JLabel("Nombre: ");
        lblNumeroIntegrantes = new JLabel("Numero de integrantes: ");
        lblAgencia = new JLabel("Agencia: ");
        lblAnoFundacion = new JLabel("Año de fundacion: ");
        lblImagen = new JLabel("Url Imagen: ");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtNombre = new JTextField(20);
        txtNumeroIntegrantes = new JTextField(15);
        txtAgencia = new JTextField(15);
        txtAnoFundacion = new JTextField(15);
        txtImagen = new JTextField(25);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblNumeroIntegrantes);
        panel1.add(txtNumeroIntegrantes);
        panel1.add(lblAgencia);
        panel1.add(txtAgencia);
        panel1.add(lblAnoFundacion);
        panel1.add(txtAnoFundacion);
        panel1.add(lblImagen);
        panel1.add(txtImagen);
        panel1.add(btnAgregar);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(120, 208, 101));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblKpop = new JTable();
        scrollPane = new JScrollPane(tblKpop);
        panel2.add(scrollPane);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(213, 109, 229));
        lblImagePanel3 = new JLabel("");
        panel3.add(lblImagePanel3);



        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(225, 174, 164));
        lblInfo =new JLabel("Para eliminar la fila, selecciona la fila y preciona el boton eliminar \n ");
        btnEliminar = new JButton("Eliminar");
        lblInfoActualizar =new JLabel("NOTA:Para actualizar los elementos de la tabla sigue las instrucciones: \n");
        lblInfoActualizarInt1 = new JLabel("1.solo se podra hacer actulizacion de una fila a la vez.");
        lblInfoActualizarInt2 = new JLabel("2.edita los campos que quieras en la tabla del panel2.");
        lblInfoActualizarInt3 = new JLabel("3.despues de editar la fila que quieres mantenla selecciona y preciona el boton actualizar.");
        btnActualizar = new JButton("Actualizar");
        panel4.add(lblInfo);
        panel4.add(btnEliminar);
        panel4.add(lblInfoActualizar);
        panel4.add(lblInfoActualizarInt1);
        panel4.add(lblInfoActualizarInt2);
        panel4.add(lblInfoActualizarInt3);
        panel4.add(btnActualizar);



        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }
    public JLabel getLblNumeroIntegrantes() {
        return lblNumeroIntegrantes;
    }

    public void setLblNumeroIntegrantes(JLabel lblNumeroIntegrantes) {
        this.lblNumeroIntegrantes = lblNumeroIntegrantes;
    }
    public JLabel getLblAgencia() {
        return lblAgencia;
    }

    public void setLblAgencia(JLabel lblAgencia) {
        this.lblAgencia = lblAgencia;
    }
    public JLabel getLblAnoFundacion() {
        return lblAnoFundacion;
    }

    public void setLblAnoFundacion(JLabel lblAnoFundacion) {
        this.lblAnoFundacion = lblAnoFundacion;
    }
    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }
    public void setLblImagePanel3(JLabel lblImagePanel3) {
        this.lblImagePanel3 = lblImagePanel3;
    }
    public JLabel getLblImagePanel3() {
        return lblImagePanel3;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }
    public JTextField getTxtNumeroIntegrantes() {
        return txtNumeroIntegrantes;
    }

    public void setTxtNumeroIntegrantes(JTextField txtNumeroIntegrantes) {
        this.txtNumeroIntegrantes = txtNumeroIntegrantes;
    }
    public JTextField getTxtAgencia() {
        return txtAgencia;
    }

    public void setTxtAgencia(JTextField txtAgencia) {
        this.txtAgencia = txtAgencia;
    }

    public JTextField getTxtAnoFundacion() {
        return txtAnoFundacion;
    }

    public void setTxtAnoFundacion(JTextField txtAnoFundacion) {
        this.txtAnoFundacion = txtAnoFundacion;
    }
    public JTextField getTxtImagen() {
        return txtImagen;
    }

    public void setTxtImagen(JTextField txtImagen) {
        this.txtImagen = txtImagen;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblKpop() {
        return tblKpop;
    }

    public void setTblKpop(JTable tblKpop) {
        this.tblKpop = tblKpop;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }
    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }
    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public void limpiar(){
        txtNombre.setText("");
        txtAnoFundacion.setText("");
        txtNumeroIntegrantes.setText("");
        txtAgencia.setText("");
        txtImagen.setText("");
    }
}


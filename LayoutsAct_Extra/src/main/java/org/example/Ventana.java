package org.example;

import java.awt.*;

public class Ventana extends Frame {

    private Label lbletiqueta1;
    private Label lbletiqueta2;
    private TextField txtCuadro1;
    private TextField txtCuadro2;
    private Button boton1;
    private FlowLayout Layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        Layout = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(Layout);
        lbletiqueta1 = new Label("Etiqueta 1");
        this.add(lbletiqueta1);
        txtCuadro1 = new TextField(60);
        this.add(txtCuadro1);
        lbletiqueta2 = new Label("Etiqueta 2");
        this.add(lbletiqueta2);
        txtCuadro2 = new TextField(60);
        this.add(txtCuadro2);


        this.setSize(800,600);
        this.setVisible(true);


    }
}

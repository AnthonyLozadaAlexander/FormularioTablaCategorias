/*
 * Created by JFormDesigner on Mon Nov 10 22:42:53 ECT 2025
 */

package IGU;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author USUARIO
 */
public class Formulario extends JFrame {
    private DefaultTableModel modelo; // modelo de la tabla, para poder manipular sus datos.
    String regex =  "^\\d+(\\.\\d+)?$";

    public Formulario() {
        initComponents();
        lblImporte.setVisible(false);
        txtImporte.setVisible(false);
        String[] columns = {"ID", "Marca", "Propietario", "Numero Patente", "Categoria"};
        modelo = new DefaultTableModel(columns, 0);
        tabla.setModel(modelo);
    }

    private boolean isEmpty(String txt){
        if(txt == null || txt.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Error: Campos Vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    private void agregarFila(String id, String marca, String propietario, String numeroPatente, String Categoria){
        // Objeto de tipo arreglo para agregar una fila
        Object[] fila = {id, marca, propietario, numeroPatente, Categoria};
        modelo.addRow(fila);
    }

    private double Double(String txt){
        return Double.parseDouble(txt.trim());
    }
    private void agregar(){

        String id = txtID.getText();
        String marca = txtMarca.getText();
        String propietario = txtPropietario.getText();
        String numeroPatente = txtNumeroPatente.getText();
        Double importe = Double(txtImporte.getText());
        String categoria = (String) cboCategoria.getSelectedItem();

        if(("Utilidad").equals(categoria)){
            JOptionPane.showMessageDialog(this, "Se le ha agregado un importe del " + importe, "INFO",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        agregarFila(id, marca, propietario, numeroPatente, categoria);
    }

    private void btnIngresar(ActionEvent e) {
        if(isEmpty(txtID.getText()) || isEmpty(txtMarca.getText()) || isEmpty(txtPropietario.getText()) || isEmpty(txtNumeroPatente.getText()) || isEmpty(txtImporte.getText())){
            return;
        }

        if(!txtImporte.getText().matches(regex)){
            JOptionPane.showMessageDialog(this, "Error: Importe Invalido", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(cboCategoria.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Error: Debe Seleccionar Una Categoria", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        agregar();
    }

    private void btnModificar(ActionEvent e) {
        int indexRow = tabla.getSelectedRow();
        if(indexRow < 0){
            JOptionPane.showMessageDialog(this, "Error: Debe Seleccionar Una Fila", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void btnEliminar(ActionEvent e) {
        int indexRow = tabla.getSelectedRow();
        if(indexRow < 0){
            JOptionPane.showMessageDialog(this, "Error: Debe Seleccionar Una Fila", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void btnBuscar(ActionEvent e) {
        String ID = JOptionPane.showInputDialog(this, "Ingrese el ID a Buscar: ");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
        Fondo = new JPanel();
        Titulo = new JPanel();
        label1 = new JLabel();
        cboCategoria = new JComboBox<>();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        txtID = new JTextField();
        txtMarca = new JTextField();
        txtPropietario = new JTextField();
        txtNumeroPatente = new JTextField();
        txtCategoria = new JTextField();
        btnIngresar = new JButton();
        btnLimpiar = new JButton();
        scrollPane1 = new JScrollPane();
        tabla = new JTable();
        btnModificar = new JButton();
        btnEliminar = new JButton();
        btnBuscar = new JButton();
        txtImporte = new JTextField();
        lblImporte = new JLabel();

        //======== this ========
        setName("this");
        var contentPane = getContentPane();

        //======== Fondo ========
        {
            Fondo.setBackground(Color.white);
            Fondo.setName("Fondo");

            //======== Titulo ========
            {
                Titulo.setBackground(new Color(0xffffcc));
                Titulo.setName("Titulo");

                //---- label1 ----
                label1.setText("Formulario Gestion Vehiculos");
                label1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 24));
                label1.setName("label1");

                GroupLayout TituloLayout = new GroupLayout(Titulo);
                Titulo.setLayout(TituloLayout);
                TituloLayout.setHorizontalGroup(
                    TituloLayout.createParallelGroup()
                        .addGroup(TituloLayout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(label1)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                TituloLayout.setVerticalGroup(
                    TituloLayout.createParallelGroup()
                        .addGroup(TituloLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(label1)
                            .addContainerGap(32, Short.MAX_VALUE))
                );
            }

            //---- cboCategoria ----
            cboCategoria.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 16));
            cboCategoria.setModel(new DefaultComboBoxModel<>(new String[] {
                "Seleccione",
                "Utilidad",
                "Dise\u00f1o",
                "Planta",
                "Invencion"
            }));
            cboCategoria.setName("cboCategoria");

            //---- label2 ----
            label2.setText("ID:");
            label2.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));
            label2.setName("label2");

            //---- label3 ----
            label3.setText("Marca:");
            label3.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));
            label3.setName("label3");

            //---- label4 ----
            label4.setText("Propietario:");
            label4.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));
            label4.setName("label4");

            //---- label5 ----
            label5.setText("Numero Patente:");
            label5.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));
            label5.setName("label5");

            //---- label6 ----
            label6.setText("Categoria:");
            label6.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));
            label6.setName("label6");

            //---- txtID ----
            txtID.setName("txtID");

            //---- txtMarca ----
            txtMarca.setName("txtMarca");

            //---- txtPropietario ----
            txtPropietario.setName("txtPropietario");

            //---- txtNumeroPatente ----
            txtNumeroPatente.setName("txtNumeroPatente");

            //---- txtCategoria ----
            txtCategoria.setName("txtCategoria");

            //---- btnIngresar ----
            btnIngresar.setText("Ingresar");
            btnIngresar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));
            btnIngresar.setName("btnIngresar");
            btnIngresar.addActionListener(e -> btnIngresar(e));

            //---- btnLimpiar ----
            btnLimpiar.setText("Limpiar");
            btnLimpiar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));
            btnLimpiar.setName("btnLimpiar");

            //======== scrollPane1 ========
            {
                scrollPane1.setName("scrollPane1");

                //---- tabla ----
                tabla.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 14));
                tabla.setModel(new DefaultTableModel(2, 0));
                tabla.setName("tabla");
                scrollPane1.setViewportView(tabla);
            }

            //---- btnModificar ----
            btnModificar.setText("Modificar");
            btnModificar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));
            btnModificar.setName("btnModificar");
            btnModificar.addActionListener(e -> btnModificar(e));

            //---- btnEliminar ----
            btnEliminar.setText("Eliminar");
            btnEliminar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));
            btnEliminar.setName("btnEliminar");
            btnEliminar.addActionListener(e -> btnEliminar(e));

            //---- btnBuscar ----
            btnBuscar.setText("Buscar");
            btnBuscar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));
            btnBuscar.setName("btnBuscar");
            btnBuscar.addActionListener(e -> btnBuscar(e));

            //---- txtImporte ----
            txtImporte.setName("txtImporte");

            //---- lblImporte ----
            lblImporte.setText("Importe");
            lblImporte.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));
            lblImporte.setName("lblImporte");

            GroupLayout FondoLayout = new GroupLayout(Fondo);
            Fondo.setLayout(FondoLayout);
            FondoLayout.setHorizontalGroup(
                FondoLayout.createParallelGroup()
                    .addComponent(Titulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(FondoLayout.createParallelGroup()
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnBuscar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIngresar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpiar, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addGap(0, 165, Short.MAX_VALUE)
                                .addGroup(FondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnModificar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup()
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(label2))
                                    .addComponent(label5)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(FondoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(FondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtPropietario, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtID, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtNumeroPatente, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(FondoLayout.createParallelGroup()
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(FondoLayout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                                .addGap(0, 12, Short.MAX_VALUE)
                                                .addComponent(label6)
                                                .addGap(37, 37, 37))
                                            .addGroup(GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                                .addGroup(FondoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtImporte, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                                    .addComponent(txtMarca)
                                                    .addGroup(GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                                                        .addGap(45, 45, 45)
                                                        .addComponent(label3)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addComponent(txtCategoria)
                                                    .addComponent(cboCategoria, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                                                .addGap(18, 18, 18))))
                                    .addGroup(GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                        .addComponent(lblImporte)
                                        .addGap(53, 53, 53)))))
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 616, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
            );
            FondoLayout.setVerticalGroup(
                FondoLayout.createParallelGroup()
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(Titulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(FondoLayout.createParallelGroup()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 504, GroupLayout.PREFERRED_SIZE)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label6)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addGap(14, 14, 14)
                                        .addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label4)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPropietario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(FondoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(cboCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(FondoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNumeroPatente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImporte))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtImporte, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(FondoLayout.createParallelGroup()
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(btnIngresar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar))
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(btnModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar)))
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)))
                        .addContainerGap(39, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(Fondo, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(Fondo, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
    private JPanel Fondo;
    private JPanel Titulo;
    private JLabel label1;
    private JComboBox<String> cboCategoria;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField txtID;
    private JTextField txtMarca;
    private JTextField txtPropietario;
    private JTextField txtNumeroPatente;
    private JTextField txtCategoria;
    private JButton btnIngresar;
    private JButton btnLimpiar;
    private JScrollPane scrollPane1;
    private JTable tabla;
    private JButton btnModificar;
    private JButton btnEliminar;
    private JButton btnBuscar;
    private JTextField txtImporte;
    private JLabel lblImporte;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

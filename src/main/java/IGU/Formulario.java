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
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;

/**
 * @author USUARIO
 */
public class Formulario extends JFrame {
    public Formulario() {
        initComponents();
    }

    private void btnIngresar(ActionEvent e) {
        // TODO add your code here
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
                            .addContainerGap(544, Short.MAX_VALUE))
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

            GroupLayout FondoLayout = new GroupLayout(Fondo);
            Fondo.setLayout(FondoLayout);
            FondoLayout.setHorizontalGroup(
                FondoLayout.createParallelGroup()
                    .addComponent(Titulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
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
                                .addGroup(FondoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnIngresar)
                                    .addComponent(txtNumeroPatente, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(FondoLayout.createParallelGroup()
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FondoLayout.createParallelGroup()
                                    .addComponent(txtMarca, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(label3)
                                        .addGap(0, 40, Short.MAX_VALUE))
                                    .addComponent(txtCategoria, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(cboCategoria, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(label6)
                                .addGap(37, 37, 37)))
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            FondoLayout.setVerticalGroup(
                FondoLayout.createParallelGroup()
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(Titulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(FondoLayout.createParallelGroup()
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
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumeroPatente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnIngresar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)
                                .addGap(0, 225, Short.MAX_VALUE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(185, Short.MAX_VALUE))))
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

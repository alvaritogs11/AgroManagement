/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.controlador;

/**
 *
 * @author platon
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diagCrearUsuario = new javax.swing.JDialog();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmar = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmar = new javax.swing.JPasswordField();
        btnCrearUsuario = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menuFincas = new javax.swing.JMenu();
        itCrearFinca = new javax.swing.JMenuItem();
        itVerFinca = new javax.swing.JMenuItem();
        itModificarFinca = new javax.swing.JMenuItem();
        itBorrarFinca = new javax.swing.JMenuItem();
        menuRecursos = new javax.swing.JMenu();
        itCrearRecurso = new javax.swing.JMenuItem();
        itVerRecurso = new javax.swing.JMenuItem();
        itModificarRecurso = new javax.swing.JMenuItem();
        itBorrarRecurso = new javax.swing.JMenuItem();
        menuTrabajos = new javax.swing.JMenu();
        itCrearTrabajo = new javax.swing.JMenuItem();
        itVerTrabajo = new javax.swing.JMenuItem();
        itModificarTrabajo = new javax.swing.JMenuItem();
        itBorrarTrabajo = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        itCrearUsuario = new javax.swing.JMenuItem();
        itVerUsuario = new javax.swing.JMenuItem();
        itModificarUsuario = new javax.swing.JMenuItem();
        itBorrarUsuario = new javax.swing.JMenuItem();

        diagCrearUsuario.setMinimumSize(new java.awt.Dimension(235, 180));

        txtUsuario.setColumns(10);

        lblUsuario.setText("Usuario");

        lblPassword.setText("Password");

        lblConfirmar.setText("Confirmar");

        txtPassword.setColumns(10);

        txtConfirmar.setColumns(10);

        btnCrearUsuario.setText("Crear");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout diagCrearUsuarioLayout = new javax.swing.GroupLayout(diagCrearUsuario.getContentPane());
        diagCrearUsuario.getContentPane().setLayout(diagCrearUsuarioLayout);
        diagCrearUsuarioLayout.setHorizontalGroup(
            diagCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diagCrearUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diagCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diagCrearUsuarioLayout.createSequentialGroup()
                        .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addGroup(diagCrearUsuarioLayout.createSequentialGroup()
                        .addGroup(diagCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diagCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(lblConfirmar)
                                .addGap(18, 18, 18)
                                .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(diagCrearUsuarioLayout.createSequentialGroup()
                                .addGroup(diagCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblPassword))
                                .addGap(18, 18, 18)
                                .addGroup(diagCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPassword)
                                    .addComponent(txtUsuario))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        diagCrearUsuarioLayout.setVerticalGroup(
            diagCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diagCrearUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diagCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(diagCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(diagCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmar)
                    .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(diagCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearUsuario)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuFincas.setText("Fincas");

        itCrearFinca.setText("Crear");
        menuFincas.add(itCrearFinca);

        itVerFinca.setText("Ver");
        menuFincas.add(itVerFinca);

        itModificarFinca.setText("Modificar");
        menuFincas.add(itModificarFinca);

        itBorrarFinca.setText("Borrar");
        menuFincas.add(itBorrarFinca);

        menu.add(menuFincas);

        menuRecursos.setText("Recursos");

        itCrearRecurso.setText("Crear");
        menuRecursos.add(itCrearRecurso);

        itVerRecurso.setText("Ver");
        menuRecursos.add(itVerRecurso);

        itModificarRecurso.setText("Modificar");
        menuRecursos.add(itModificarRecurso);

        itBorrarRecurso.setText("Borrar");
        menuRecursos.add(itBorrarRecurso);

        menu.add(menuRecursos);

        menuTrabajos.setText("Trabajos");

        itCrearTrabajo.setText("Crear");
        menuTrabajos.add(itCrearTrabajo);

        itVerTrabajo.setText("Ver");
        menuTrabajos.add(itVerTrabajo);

        itModificarTrabajo.setText("Modificar");
        menuTrabajos.add(itModificarTrabajo);

        itBorrarTrabajo.setText("Borrar");
        menuTrabajos.add(itBorrarTrabajo);

        menu.add(menuTrabajos);

        menuUsuarios.setText("Usuarios");

        itCrearUsuario.setText("Crear");
        menuUsuarios.add(itCrearUsuario);

        itVerUsuario.setText("Ver");
        menuUsuarios.add(itVerUsuario);

        itModificarUsuario.setText("Modificar");
        menuUsuarios.add(itModificarUsuario);

        itBorrarUsuario.setText("Borrar");
        menuUsuarios.add(itBorrarUsuario);

        menu.add(menuUsuarios);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JDialog diagCrearUsuario;
    private javax.swing.JMenuItem itBorrarFinca;
    private javax.swing.JMenuItem itBorrarRecurso;
    private javax.swing.JMenuItem itBorrarTrabajo;
    private javax.swing.JMenuItem itBorrarUsuario;
    private javax.swing.JMenuItem itCrearFinca;
    private javax.swing.JMenuItem itCrearRecurso;
    private javax.swing.JMenuItem itCrearTrabajo;
    private javax.swing.JMenuItem itCrearUsuario;
    private javax.swing.JMenuItem itModificarFinca;
    private javax.swing.JMenuItem itModificarRecurso;
    private javax.swing.JMenuItem itModificarTrabajo;
    private javax.swing.JMenuItem itModificarUsuario;
    private javax.swing.JMenuItem itVerFinca;
    private javax.swing.JMenuItem itVerRecurso;
    private javax.swing.JMenuItem itVerTrabajo;
    private javax.swing.JMenuItem itVerUsuario;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuFincas;
    private javax.swing.JMenu menuRecursos;
    private javax.swing.JMenu menuTrabajos;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JPasswordField txtConfirmar;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

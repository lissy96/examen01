
package vista;

import controlador.Controlador_FRM_MantenimientoRegistro;


public class GUI_Botones extends javax.swing.JPanel {

  Controlador_FRM_MantenimientoRegistro controlador;
    public GUI_Botones() {
        initComponents();
    }
 public void agregarEventos(Controlador_FRM_MantenimientoRegistro controlador)
    {
        this.controlador=controlador;
        
        this.btn_Agregar.addActionListener(controlador);
        this.btn_Buscar.addActionListener(controlador);
        this.btn_Eliminar.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
    }
 public void estadoInicial()
    {
        this.btn_Buscar.setEnabled(true);
        this.btn_Agregar.setEnabled(false);
        this.btn_Eliminar.setEnabled(false);
        this.btn_Modificar.setEnabled(false);
    }
 // este metodo deshabilita agregar si ya se encuentra agregado
 public void deshabilitarAgregar()
     {
        this.btn_Agregar.setEnabled(false);
     }
 // este metodo solo me habilita agregar
 public void habilitarAgregar()
    {
        this.btn_Agregar.setEnabled(true);
    }
 public void habilitarModificarEliminar()
 {
     this.btn_Modificar.setEnabled(true);
     this.btn_Eliminar.setEnabled(true);
 }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Buscar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        btn_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_BuscarKeyPressed(evt);
            }
        });

        btn_Agregar.setText("Agregar");

        btn_Modificar.setText("Modificar");

        btn_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Buscar)
                .addGap(18, 18, 18)
                .addComponent(btn_Agregar)
                .addGap(18, 18, 18)
                .addComponent(btn_Modificar)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Buscar)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_BuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_BuscarKeyPressed
        if(evt.getKeyCode()==10)
        {
           this.btn_Buscar.addActionListener(controlador);
        }
        
    }//GEN-LAST:event_btn_BuscarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    // End of variables declaration//GEN-END:variables
}

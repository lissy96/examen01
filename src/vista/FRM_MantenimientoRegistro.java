
package vista;

import controlador.Controlador_FRM_MantenimientoRegistro;
import javax.swing.JOptionPane;


public class FRM_MantenimientoRegistro extends javax.swing.JFrame {

  Controlador_FRM_MantenimientoRegistro controlador;
    public FRM_MantenimientoRegistro() 
    {
        initComponents();
        controlador=new Controlador_FRM_MantenimientoRegistro(this);
       this.gUI_Botones1.agregarEventos(controlador);
       estadoInicial();
       
    }
    
     public String[] devolverInformacion()
    {
        return this.gUI_InformacionRegistro1.devolverInformacion();
    }
       public void mostrarInformacion(String arreglo[])
    {
        this.gUI_InformacionRegistro1.mostrarInformacion(arreglo);
    }
    public String devolverNumeroRegistro()
    {
        return this.gUI_InformacionRegistro1.devolverNumeroRegistro();
    }
    
    public void mensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null,mensaje);
    }
    public void estadoInicial()
    {
        this.gUI_Botones1.estadoInicial();
        this.gUI_InformacionRegistro1.estadoInicialTexto();
        this.gUI_InformacionRegistro1.limpiarTextos();
    }
  
       public void habilitarEliminarModificar()
       {
           this.gUI_Botones1.habilitarModificarEliminar();
           this.gUI_InformacionRegistro1.habilitarEspacios();
       }
            
       public void agregarHabilitado()
       {
           this.gUI_Botones1.habilitarAgregar();
           this.gUI_InformacionRegistro1.habilitarEspacios();
       }
    
       public void agregarDeshabilitado()
       {
           this.gUI_Botones1.deshabilitarAgregar();
       }
        public void aumentarCodigo(String codigo)
    {
        this.gUI_InformacionRegistro1.aumentarCodigo(codigo);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_InformacionRegistro1 = new vista.GUI_InformacionRegistro();
        gUI_Botones1 = new vista.GUI_Botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gUI_InformacionRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gUI_InformacionRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_MantenimientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_MantenimientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_MantenimientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_MantenimientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_MantenimientoRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.GUI_Botones gUI_Botones1;
    private vista.GUI_InformacionRegistro gUI_InformacionRegistro1;
    // End of variables declaration//GEN-END:variables
}

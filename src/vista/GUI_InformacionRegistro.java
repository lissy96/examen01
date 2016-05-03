
package vista;


public class GUI_InformacionRegistro extends javax.swing.JPanel {

    /**
     * Creates new form GUI_InformacionRegistro
     */
    public GUI_InformacionRegistro() {
        initComponents();
    }

  public String[] devolverInformacion() 
    {
        String arreglo[];
        arreglo=new String[4];
        
        arreglo[0]=this.jt_NumeroRegistro.getText();
        arreglo[1]=this.jt_NombreDueño.getText();
        arreglo[2]=this.jt_CedulaDueño.getText();
        arreglo[3]=this.jt_Placa.getText();
        
        return arreglo;
    }
    
    public void mostrarInformacion(String arreglo[])
    {
        this.jt_NombreDueño.setText(arreglo[0]);
        this.jt_CedulaDueño.setText(arreglo[1]);
        this.jt_Placa.setText(arreglo[2]);
    }
    
    public void aumentarCodigo(String codigo)
    {
        this.jt_NumeroRegistro.setText(codigo);
    }
            
    public String devolverNumeroRegistro()
    {
        return this.jt_NumeroRegistro.getText();
    }
    public void estadoInicialTexto()
    {
        this.jt_NumeroRegistro.setEnabled(true);
        this.jt_CedulaDueño.setEnabled(false);
        this.jt_NombreDueño.setEnabled(false);
        this.jt_Placa.setEnabled(false);
        
    }
     public void limpiarTextos()
    {   
        this.jt_NombreDueño.setText("");
        this.jt_Placa.setText("");
        this.jt_CedulaDueño.setText("");
    }
   // este metodo si busca y encuentra entonces me deshabilita solamente el numero de registro que no se puede modificar

    
   public void habilitarEspacios()
   {
       this.jt_NumeroRegistro.setEnabled(false);
       this.jt_NombreDueño.setEnabled(true);
       this.jt_CedulaDueño.setEnabled(true);
        this.jt_Placa.setEnabled(true);
   }
   

             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NumeroRegistro = new javax.swing.JLabel();
        jl_NombreDueño = new javax.swing.JLabel();
        jl_CedulaDueño = new javax.swing.JLabel();
        jl_Placa = new javax.swing.JLabel();
        jt_NumeroRegistro = new javax.swing.JTextField();
        jt_NombreDueño = new javax.swing.JTextField();
        jt_CedulaDueño = new javax.swing.JTextField();
        jt_Placa = new javax.swing.JTextField();

        jl_NumeroRegistro.setText("Numero de Registro");

        jl_NombreDueño.setText("Nombre del Dueño");

        jl_CedulaDueño.setText("Cedula del Dueño");

        jl_Placa.setText("Placa del Automovil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_NumeroRegistro)
                    .addComponent(jl_NombreDueño)
                    .addComponent(jl_CedulaDueño)
                    .addComponent(jl_Placa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jt_NombreDueño, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jt_NumeroRegistro)
                    .addComponent(jt_CedulaDueño)
                    .addComponent(jt_Placa))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NumeroRegistro)
                    .addComponent(jt_NumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NombreDueño)
                    .addComponent(jt_NombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CedulaDueño)
                    .addComponent(jt_CedulaDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Placa)
                    .addComponent(jt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_CedulaDueño;
    private javax.swing.JLabel jl_NombreDueño;
    private javax.swing.JLabel jl_NumeroRegistro;
    private javax.swing.JLabel jl_Placa;
    private javax.swing.JTextField jt_CedulaDueño;
    private javax.swing.JTextField jt_NombreDueño;
    private javax.swing.JTextField jt_NumeroRegistro;
    private javax.swing.JTextField jt_Placa;
    // End of variables declaration//GEN-END:variables
}

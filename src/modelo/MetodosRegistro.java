
            package modelo;

            import java.util.ArrayList;
        import javax.swing.JOptionPane;


            public class MetodosRegistro
            {
                ArrayList <Registro> arrayRegistro;
                String arregloInformacionConsultada[];
                boolean existeRegistro=false;

                public MetodosRegistro()
                {
                    arrayRegistro= new ArrayList<Registro>();
                    arregloInformacionConsultada= new String [3];
                }// fin de MetodosRegistro

                //*************METODO AGREGAR REGISTRO**************//

                public boolean agregarRegistro(String arreglo[])
                {
                    boolean agrego=false;
                 Registro temporal=new Registro(arreglo[0],arreglo[1],arreglo[2],arreglo[3]);

                    if(existeRegistro==false)
                        {
                            arrayRegistro.add(temporal);
                            existeRegistro=true;
                            agrego=true;
                        }
                        else{
                             for(int contador=0; contador<arrayRegistro.size(); contador++)
                        {
                            if(arrayRegistro.get(contador).getNumeroRegistro().equals(arreglo[0]))
                            {
                            }
                            else
                            {
                               arrayRegistro.add(temporal);
                               agrego=true;
                               
                            }//  fin del else
                        }// fin del for 
                        }// fin del else
                    return agrego;
                }// fin del metodo agregarRegistro

                 //*************METODO BUSCAR REGISTRO**************//

                public boolean buscarRegistro(String numeroRegistro)
                {
                    boolean busco=false;
                    for(int contador=0; contador<arrayRegistro.size(); contador++)
                    {
                        if(arrayRegistro.get(contador).getNumeroRegistro().equals(numeroRegistro))
                        {
                            arregloInformacionConsultada[0]= arrayRegistro.get(contador).getNombreDueño();
                            arregloInformacionConsultada[1]=arrayRegistro.get(contador).getCedulaDueño();
                            arregloInformacionConsultada[2]=arrayRegistro.get(contador).getPlaca();
                            busco=true;
                         //   JOptionPane.showMessageDialog(null, "se encontro el registro");
                            System.out.println("busca");
                        }// fin del if 
                        else
                        {
                            //JOptionPane.showMessageDialog(null, "NO se encontro el registro");
                        }
                    }// fin del for
                    return busco;
                }// fin del metodo buscar registro

                 //*************METODO MODIFICAR REGISTRO**************//
                    public boolean modificarRegistro(String arreglo[])
                    {
                        boolean modifico=false;
                        for(int contador=0; contador<arrayRegistro.size(); contador++)
                        {
                          if(arrayRegistro.get(contador).getNumeroRegistro().equals(arreglo[0]))
                            {
                                arrayRegistro.get(contador).setNombreDueño(arreglo[1]);
                                arrayRegistro.get(contador).setCedulaDueño(arreglo[2]);
                                arrayRegistro.get(contador).setPlaca(arreglo[3]);
                                modifico= true;
                               // JOptionPane.showMessageDialog(null, "se modifico el registro");
                            }//  fin del if 
                            
                        }// fin del for
                            return modifico;

                    }// fin del  metodo modificar

                    public boolean eliminarRegistro(String arreglo[])
                    {
                        boolean elimino=false;
                        for(int contador=0; contador<arrayRegistro.size(); contador++)
                        {
                            if(arrayRegistro.get(contador).getNumeroRegistro().equals(arreglo[0]))
                            {
                                arrayRegistro.remove(contador);
                                elimino=true;
                               // JOptionPane.showMessageDialog(null, "se elimino el registro");            
                            }// fin del if
                           
                        }// fin del for 

                        return elimino;
                    }// fin del metodo eiliminar registro
                    public String[] mostrarInformacion()
        {
            return this.arregloInformacionConsultada;
        }

                    public String numeroConsecutivo()
                    { 
                        String consecutivo="";

                if(arrayRegistro.size()==0)
                {
                    consecutivo="1";
                }
                else
                {
                        for(int contador=0;contador<arrayRegistro.size();contador++)
                        {
                            if(arrayRegistro.get(contador)!=null)
                            {
                                consecutivo=arrayRegistro.get(contador).getNumeroRegistro();
                            }
                        }
                    int numero=Integer.parseInt(consecutivo);
                    numero++;
                    consecutivo=""+numero;
                }

               return consecutivo;
            }

   
}



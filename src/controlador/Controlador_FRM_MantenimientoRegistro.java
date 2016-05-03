/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MetodosRegistro;
import vista.FRM_MantenimientoRegistro;

/**
 *
 * @author liis
 */
public class Controlador_FRM_MantenimientoRegistro implements ActionListener
{
   
     FRM_MantenimientoRegistro frm_registro;
    MetodosRegistro metodos;
    
    public Controlador_FRM_MantenimientoRegistro(   FRM_MantenimientoRegistro frm_registro)
    {
         this.frm_registro=frm_registro;
        metodos=new MetodosRegistro();
        frm_registro.aumentarCodigo(metodos.numeroConsecutivo());
    }// fin del constructor 
    
     public void actionPerformed(ActionEvent e) 
    {
      
        if(e.getActionCommand().equals("Buscar"))  
          {
              if(metodos. buscarRegistro(frm_registro.devolverNumeroRegistro()))
              {
                 // System.out.println("buscar");
                frm_registro.mensaje("Se encontró el registro");
                frm_registro.mostrarInformacion(metodos.mostrarInformacion());
                frm_registro.habilitarEliminarModificar();
              }
              else
              {
                  frm_registro.agregarHabilitado();       
                   //System.out.println("buscar");
                  frm_registro.mensaje("No se encontro el registro");
     
              }
           //System.out.println("buscar");
          }
         if(e.getActionCommand().equals("Agregar"))  
          {
              if(metodos.agregarRegistro(frm_registro.devolverInformacion()))
              {
                 //System.out.println("agregar");
                  frm_registro.mensaje("Se agregó el registro");
                  frm_registro.estadoInicial();
                  metodos.mostrarInformacion();
                  frm_registro.devolverInformacion();
                  frm_registro.aumentarCodigo(metodos.numeroConsecutivo());   
              }
              else
              {
                   System.out.println("agregar");
                  frm_registro.mensaje("No se agregó correctamente");
              }
          
          }// fin del if agregar
          if(e.getActionCommand().equals("Modificar"))  
          {
              if(metodos.modificarRegistro(frm_registro.devolverInformacion()))
              {
                   //System.out.println("modificar");
                  metodos.modificarRegistro(frm_registro.devolverInformacion());
                  frm_registro.agregarDeshabilitado();
                  frm_registro.estadoInicial();
                 frm_registro.mensaje("Se modificó correctamente");
                 frm_registro.aumentarCodigo(metodos.numeroConsecutivo());
                  
              }
              else
              {
                 //  System.out.println("modificar");
                 frm_registro.mensaje("No se modificó correctamente");
              }
           //System.out.println("modifiar");
          }
        if(e.getActionCommand().equals("Eliminar"))  
          {
              if(metodos.eliminarRegistro(frm_registro.devolverInformacion()))
              {
                  metodos.eliminarRegistro(frm_registro.devolverInformacion());
                  frm_registro.mensaje("Se eliminó correctamente");
                 frm_registro.aumentarCodigo(metodos.numeroConsecutivo());
                 frm_registro.estadoInicial();
                
                  
              }
              else
              {
                 frm_registro.mensaje("No se eliminó correctamente");
                 
                  
              }
           //System.out.println("eliminar");
          }
    
    }// fin del metodo actionPerformed

   
}
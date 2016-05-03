
package modelo;


public class Registro
{
    private String numeroRegistro;
    private String nombreDueño;
    private String cedulaDueño;
    private String placa;

    public Registro(String numeroRegistro, String nombreDueño, String cedulaDueño, String placa) {
        this.numeroRegistro = numeroRegistro;
        this.nombreDueño = nombreDueño;
        this.cedulaDueño = cedulaDueño;
        this.placa = placa;
    }

    /**
     * @return the numeroRegistro
     */
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * @param numeroRegistro the numeroRegistro to set
     */
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    /**
     * @return the nombreDueño
     */
    public String getNombreDueño() {
        return nombreDueño;
    }

    /**
     * @param nombreDueño the nombreDueño to set
     */
    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    /**
     * @return the cedulaDueño
     */
    public String getCedulaDueño() {
        return cedulaDueño;
    }

    /**
     * @param cedulaDueño the cedulaDueño to set
     */
    public void setCedulaDueño(String cedulaDueño) {
        this.cedulaDueño = cedulaDueño;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
            
    
}

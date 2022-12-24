/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compit5;

/**
 *
 * @author USUARIO
 */
public class Token {

    private String nombre;
    private int lineadecodigo;

    public Token() {
    }

    public int getLineadecodigo() {
        return lineadecodigo;
    }

    public void setLineadecodigo(int lineadecodigo) {
        this.lineadecodigo = lineadecodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    ////////////////////////////////////////////////////////////////////////////
    //Metodos para reconocer tokens
    public boolean isdigit(char c) {
        Object tempo = (Object) c;
        if (tempo.hashCode() > 47 && tempo.hashCode() < 58) {
            return true;
        }
        return false;
    }

    public boolean isletra(char c) {
        Object tempo = (Object) c;
        if (tempo.hashCode() > 96 && tempo.hashCode() < 123 || tempo.hashCode() > 64 && tempo.hashCode() < 91) {
            return true;
        }

        return false;
    }

    public boolean isoperadormatematico(char c) {

        Object tempo = (Object) c;
        if (tempo.hashCode() == 42 || tempo.hashCode() == 43 || tempo.hashCode() == 45 || tempo.hashCode() == 47) {
            return true;
        }

        return false;
    }

    public boolean isllaves(char c) {
     Object tempo = (Object) c;
        if (tempo.hashCode() == 123 || tempo.hashCode() == 125 ) {
            return true;
        }

        return false;
    }

    public boolean isPalabraReservada(String c)
    {
     if(c.compareTo("if")==0)
        return true;
    return false;

    }
       public boolean isoperadorlogico(char c) {

        Object tempo = (Object) c;
        if (tempo.hashCode() == 38 || tempo.hashCode() == 124) {
            return true;
        }

        return false;
    }


}

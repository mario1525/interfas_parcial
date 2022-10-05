
package clases;

import clases_abstractas.muebles;
import interfaces.transporte;


public class armario extends muebles implements transporte {
    private int volumenalmacenaje;

    public armario() {
    }

    public armario(int volumenalmacenaje) {
        this.volumenalmacenaje = volumenalmacenaje;
    }

    public int getVolumenalmacenaje() {
        return volumenalmacenaje;
    }

    public void setVolumenalmacenaje(int volumenalmacenaje) {
        this.volumenalmacenaje = volumenalmacenaje;
    }
    
    

    @Override
    public void montar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()+ "armario{" + "volumenalmacenaje=" + volumenalmacenaje + '}';
    }

    @Override
    public void llevarMueble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void subirMueble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

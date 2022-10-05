
package clases;

import clases_abstractas.muebles;
import interfaces.transporte;


public class mesa extends muebles implements transporte {
    private int comensales;

    public mesa(int comensales) {
        this.comensales = comensales;
    }

    public mesa() {
    }
    

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }
    
    

    @Override
    public void montar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()+"mesa{" + "comensales=" + comensales + '}';
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

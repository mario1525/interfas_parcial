
package clases_abstractas;

/**
 *
 * @author Unireformada
 */
public abstract class muebles {
    private int numPatas;
    private String color;

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract void montar();

    @Override
    public String toString() {
        return "muebles{" + "numPatas=" + numPatas + ", color=" + color + '}';
    }
    
    
    
    
}

package inventario;

public class Producto {
    public String n;
    public double p;
    public int s;
    
    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public Producto(String nombre, double precio, int stock) {
        this.n = nombre;
        this.p = precio;
        this.s = stock;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + n + " | Precio: " + p + " | Stock: " + s);
    }

    public void borrarDatos() {
        n = "";
        p = 0.0;
        s = 0;
    }
}
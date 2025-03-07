package inventario;

public class Producto {
    public String nombre;
    public double precio;
    public int stock;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public static Producto crearProducto(String nombre, double precio, int stock) {
    return new Producto(nombre, precio, stock);
    }
    
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }
}
public class Alojamiento {
    private String nombre;
    private double precioNoche;
    private String ciudad;

    public Alojamiento(String nombre, double precioNoche, String ciudad) {
        this.nombre = nombre;
        this.precioNoche = precioNoche;
        this.ciudad = ciudad;
    }

    public Alojamiento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double calcularPrecio(int numNoches){
        double precio = numNoches * this.precioNoche;
        return precio;
    }

    @Override
    public String toString() {
        return this.nombre + ", en " + this.ciudad;
    }
}

public class Hotel extends Alojamiento{
    private int estrellas;
    private boolean desayunoIncluido;

    public Hotel(String nombre, double precioNoche, String ciudad, int estrellas, boolean desayunoIncluido) {
        super(nombre, precioNoche, ciudad);
        this.estrellas = estrellas;
        this.desayunoIncluido = desayunoIncluido;
    }

    public Hotel(String nombre, double precioNoche, String ciudad) {
        super(nombre, precioNoche, ciudad);
    }

    public Hotel(String nombre, double precioNoche, String ciudad, int estrellas) {
        super(nombre, precioNoche, ciudad);
        this.estrellas = estrellas;
        this.desayunoIncluido = false;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        return this.getNombre() + ", en " + this.getCiudad() + " (hotel de (" + this.estrellas + " estrellas)";
    }
}

public class Hotel extends Alojamiento{
    private int estrellas;
    private boolean desayunoIncluido;

    public Hotel(String nombre, double precioNoche, String ciudad, int estrellas, boolean desayunoIncluido) {
        super(nombre, precioNoche, ciudad);
        this.estrellas = estrellas;
        this.desayunoIncluido = desayunoIncluido;
    }

    public Hotel() {
    }

    public Hotel(String nombre, double precioNoche, String ciudad, int estrellas) {
        super(nombre, precioNoche, ciudad);
        this.estrellas = estrellas;
        // el boolean en minúscula ya adquiere un valor "false" por defecto
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        // opcion 1
        return this.getNombre() + ", en " + this.getCiudad() + " (hotel de " + this.estrellas + " estrellas)";
        //opcion 2
        // return this.nombre + ", en " + this.ciudad + " (hotel de " + this.estrellas + " estrellas)";
        // opcion 3 (llamar al toString del padre)
        // return super.toString() + + " (hotel de " + this.estrellas + " estrellas)";
    }
}

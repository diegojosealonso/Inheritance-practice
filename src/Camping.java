public class Camping extends Alojamiento{
    private int numCaravanas;
    private int capacidadCaravanas;
    private boolean tienePiscina;

    public Camping(String nombre, double precioNoche, String ciudad, int numCaravanas, int capacidadCaravanas, boolean tienePiscina) {
        super(nombre, precioNoche, ciudad);
        this.numCaravanas = numCaravanas;
        this.capacidadCaravanas = capacidadCaravanas;
        this.tienePiscina = tienePiscina;
    }

    public Camping(String nombre, double precioNoche, String ciudad) {
        super(nombre, precioNoche, ciudad);
    }

    public int getNumCaravanas() {
        return numCaravanas;
    }

    public void setNumCaravanas(int numCaravanas) {
        this.numCaravanas = numCaravanas;
    }

    public int getCapacidadCaravanas() {
        return capacidadCaravanas;
    }

    public void setCapacidadCaravanas(int capacidadCaravanas) {
        this.capacidadCaravanas = capacidadCaravanas;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }


}

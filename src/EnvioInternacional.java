public class EnvioInternacional extends Envio {
    private double tasaAduana;
    private String paisDestino;

    public EnvioInternacional(String codigo, String destino, double peso, double costeBase, double tasaAduana, String paisDestino) {
        super(codigo, destino, peso, costeBase);
        this.tasaAduana = tasaAduana;
        this.paisDestino = paisDestino;
    }

    public EnvioInternacional() {
    }

    public double getTasAduana() {
        return tasaAduana;
    }

    public void setTasAduana(double tasAduana) {
        this.tasaAduana = tasAduana;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public double getCosteTotal(double costeTotal) {
        return this.getCosteBase() + (this.getCosteBase() * this.tasaAduana /100);
    }

    public String toString() {
        return "Envio nacional" + getCodigo() + " con destino " + getDestino();

    }
}

public class EnvioUrgente extends Envio {
    private double recargo;

    public EnvioUrgente(double recargo) {
        this.recargo = recargo;
    }

    public EnvioUrgente() {
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public double getCosteTotal(double costeTotal) {
        return this.getCosteBase() + this.recargo;
    }

    public String toString() {
        return "Envio nacional" + getCodigo() + " con destino " + getDestino();
    }
}

public class EnvioNacional extends Envio {
    private double iva;


    public EnvioNacional(String codigo, String destino, double peso, double costeBase, double iva) {
        super(codigo, destino, peso, costeBase);
        this.iva = iva;
    }

    public EnvioNacional() {
    }

    public EnvioNacional(String codigo, String destino, double peso, double costeBase) {
        super(codigo, destino, peso, costeBase);
        this.iva = 21;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getCosteTotal(double costeTotal){
        return this.getCosteBase() + (this.getCosteBase() * this.iva / 100);
    }

    @Override
    public String toString() {
        return "Envio nacional " + this.getCodigo() + " con destino " + this.getDestino();
    }
}



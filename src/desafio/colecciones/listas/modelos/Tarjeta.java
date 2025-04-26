package desafio.colecciones.listas.modelos;

public class Tarjeta {
    private double limiteTarjeta;
    private double saldoActual;

    public Tarjeta(double limiteTarjeta){
        this.limiteTarjeta=limiteTarjeta;
        saldoActual=limiteTarjeta;
    }
    public double getLimiteTarjeta() {
        return limiteTarjeta;
    }

    public void setLimiteTarjeta(double limiteTarjeta) {
        this.limiteTarjeta = limiteTarjeta;
    }

    public void descontarSaldo(double cantidad){
        saldoActual-=cantidad;
    }

    public double getSaldoActual(){
        return saldoActual;
    }
}

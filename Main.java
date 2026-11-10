public class Main {
    public static void main(String[] args) {
        CuentaFidelidad cuenta = new CuentaFidelidad(101, "oro");
        cuenta.acumularPuntos(5000);
        cuenta.acumularPuntos(2500);
        cuenta.canjearPremios(50);
        cuenta.canjearPremios(150);
        cuenta.mostrarEstado();
    }
}

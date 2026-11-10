public class CuentaFidelidad {
    private int numeroSocio;
    private String nivelMembresia;
    private int puntos;

    public CuentaFidelidad(int numeroSocio, String nivelMembresia) {
        this.numeroSocio = numeroSocio;
        this.nivelMembresia = nivelMembresia;
        this.puntos = 0;
    }
    public void acumularPuntos(double montoCompra) {
        if (montoCompra > 0) {
            int puntosGanados = (int) montoCompra / 100;
            puntos = puntos + puntosGanados;
            System.out.println("puntos acumulados: " + puntosGanados);
        } else {
            System.out.println("monto de compra invalida");
        }
    }

    public boolean canjearPremios(int puntosRequeridos) {
        if (puntosRequeridos > 0 && puntos >= puntosRequeridos) {
            puntos = puntos - puntosRequeridos;
            System.out.println("canje realizado con exito");
            return true;
        } else {
            System.out.println("no tienes puntos suficientes");
            return false;
        }
    }
    public void mostrarEstado() {
        System.out.println("numero de socio: " + numeroSocio);
        System.out.println("nivel de membresia: " + nivelMembresia);
        System.out.println("puntos disponibles: " + puntos);
    }
}

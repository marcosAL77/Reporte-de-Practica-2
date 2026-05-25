import java.time.LocalDate;

public class Pedido {

    private Proveedor proveedor;
    private int cantidadPedida;
    private LocalDate fechaPedido;
    private int cantidadRecibida;
    private LocalDate fechaLlegada;

    public Pedido(Proveedor proveedor, int cantidadPedida, LocalDate fechaPedido) {
        this.proveedor = proveedor;
        this.cantidadPedida = cantidadPedida;
        this.fechaPedido = fechaPedido;
    }

    public void registrarLlegada(int cantidadRecibida, LocalDate fechaLlegada) {
        this.cantidadRecibida = cantidadRecibida;
        this.fechaLlegada = fechaLlegada;
    }

    public int getCantidadRecibida() {
        return cantidadRecibida;
    }
}
import java.time.LocalDate;
import java.util.ArrayList;

public class Mercancia {

    private String nombre;
    private int existencia;
    private LocalDate fechaUltimaEntrada;
    private int puntoReorden;

    private ArrayList<Proveedor> proveedores;
    private ArrayList<Pedido> pedidos;

    public Mercancia(String nombre, int existencia, int puntoReorden) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.puntoReorden = puntoReorden;
        proveedores = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public void agregarProveedor(Proveedor p) {
        proveedores.add(p);
    }

    public void hacerPedido(Proveedor proveedor, int cantidad) {
        Pedido p = new Pedido(proveedor, cantidad, LocalDate.now());
        pedidos.add(p);
    }

    public void recibirPedido(Pedido p, int cantidad) {
        p.registrarLlegada(cantidad, LocalDate.now());
        existencia += cantidad;
        fechaUltimaEntrada = LocalDate.now();
    }

    public int getExistencia() {
        return existencia;
    }
}
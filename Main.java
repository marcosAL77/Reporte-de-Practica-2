import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Proveedor p1 = new Proveedor("Proveedor A", "2711234567", "Córdoba");
        Proveedor p2 = new Proveedor("Proveedor B", "2717654321", "Orizaba");

        Mercancia arroz = new Mercancia("Arroz", 50, 20);

        arroz.agregarProveedor(p1);
        arroz.agregarProveedor(p2);

        arroz.hacerPedido(p1, 30);

        System.out.println("Existencia actual: " + arroz.getExistencia());
    }
}
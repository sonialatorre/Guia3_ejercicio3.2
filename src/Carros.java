import java.util.ArrayList;
import java.util.Scanner;

public class Carros {

    private String marca;
    private Integer Stock;

    ArrayList<Carros> vehiculos;

    public Carros() {
        this.vehiculos = new ArrayList<>();
    }

    public Carros(String marca, Integer stock, ArrayList<Carros> vehiculos) {
        this.marca = marca;
        Stock = stock;
        this.vehiculos = vehiculos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

    public ArrayList<Carros> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Carros> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void addVehiculo() {
        Scanner sc = new Scanner(System.in);
        String fin;

        do {
            Carros carro = new Carros();
            System.out.println("Ingrese la marca del vehiculo");
            marca = sc.next();
            carro.setMarca(marca);

            System.out.println("Ingrese el stock del vehiculo");
            Stock = sc.nextInt();
            carro.setStock(Stock);

            System.out.println("Si desea agregar otra marca digite S de lo contrario digite cualquier letra para salir");
            fin = sc.next();

            añadirVehiculo(carro);


        } while (fin.equalsIgnoreCase("S"));
    }

    public void añadirVehiculo(Carros carro) {
        this.vehiculos.add(carro);
    }

    public void VerListado() {

        for (Carros c : vehiculos) {
            System.out.println(c);
        }
    }

    public void MenorVehiculo() {
        for (Carros c : vehiculos) {
            if (c.getStock() < 3) {
                System.out.println(c);
            }

        }
    }

    public void MayorVehiculo() {
        for (Carros c : vehiculos) {
            if (c.getStock() > 10) {
                System.out.println(c);
            }
        }
    }

    @Override
    public String toString() {
        return
                "Marca  del Vehículo = " + "\n" + marca + "\n"+
                "Stock de la Marca =" +"\n"+ Stock +
                " Vehiculos= " + "\n" + vehiculos
                ;
    }
}

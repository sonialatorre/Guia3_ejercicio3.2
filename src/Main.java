public class Main {
    public static void main(String[] args) {
        Carros carro = new Carros();
        carro.addVehiculo();

        System.out.println("Listado de vehiculos");
        carro.VerListado();
        System.out.println(" ");

        System.out.println("Listado de Marcas con menos de 3 Vehículos en Stock ");
        carro.MenorVehiculo();
        System.out.println(" ");

        System.out.println("Listado de Marcas con mas de 10 Vehículos en Stock ");
        carro.MayorVehiculo();
        System.out.println(" ");

    }
}
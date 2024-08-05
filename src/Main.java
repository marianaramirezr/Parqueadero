public class Main {
    public static void main(String[] args) {

        Parqueadero parqueadero = new Parqueadero(5, 10, 2.5);


        Carro carro1 = new Carro("ABC123", "Toyota", "A");
        Carro carro2 = new Carro("XYZ789", "Honda", "C");
        Carro carro3 = new Carro("LMN456", "Ford", "B");

        // Estacionar algunos carros
        System.out.println("Estacionar carro 1: " + parqueadero.parquearCarro(carro1, 2, 3)); // True
        System.out.println("Estacionar carro 2: " + parqueadero.parquearCarro(carro2, 0, 1)); // True
        System.out.println("Estacionar carro 3: " + parqueadero.parquearCarro(carro3, 2, 3)); // False (espacio ocupado)

        // calcular costo estacionamiento
        System.out.println("Costo por 5 horas para carro 1: $" + parqueadero.cobrarPorTiempo(carro1, 5)); // $12.5


        System.out.println("Estado del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();
    }
}
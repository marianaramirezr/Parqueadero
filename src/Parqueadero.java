class Parqueadero {
    private Carro[][] espacios;
    private double tarifaPorHora;

    public Parqueadero(int filas, int columnas, double tarifaPorHora) {
        this.espacios = new Carro[filas][columnas];
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= espacios.length || columna < 0 || columna >= espacios[0].length) {
            return false; // Fuera de límites
        }
        if (espacios[fila][columna] != null) {
            return false; // Espacio ocupado
        }
        espacios[fila][columna] = carro;
        return true; // Estacionamiento exitoso
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        return tarifaPorHora * horas;
    }

    public void mostrarEstadoParqueadero() {
        for (int i = 0; i < espacios.length; i++) {
            for (int j = 0; j < espacios[i].length; j++) {
                if (espacios[i][j] == null) {
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[X] ");
                }
            }
            System.out.println();
        }
    }
}
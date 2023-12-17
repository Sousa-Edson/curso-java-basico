package _07Enumeradores;

public enum Planeta {
    MERCURIO(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    TERRA(5.976e+24, 6.37814e6),
    MARTE(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURNO(5.688e+26, 6.0268e7),
    URANO(8.686e+25, 2.5559e7),
    NETUNO(1.024e+26, 2.4746e7);

    private final double massa;  // em kg
    private final double raio;   // em metros

    Planeta(double massa, double raio) {
        this.massa = massa;
        this.raio = raio;
    }

    public double getMassa() {
        return massa;
    }

    public double getRaio() {
        return raio;
    }

    // Método para calcular a aceleração gravitacional em um determinado peso na superfície do planeta
    public double calcularAceleracaoGravitacional(double peso) {
        double gravidade = 6.673e-11;  // constante gravitacional
        return (gravidade * massa) / (raio * raio) * peso;
    }
}

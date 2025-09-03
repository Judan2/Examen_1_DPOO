package logica;

public class Mujer extends Genero {
    
    public Mujer(double peso, double altura, int edad, String genero) {
        super( peso, altura, edad, genero);
    }
    
    public double calcularTMB() {
        // Fórmula mujeres: TMB = 447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad)
        return 447.593 + (9.247 * this.peso) + (3.098 * this.altura) - (4.33 * this.edad);
    }
    
    @Override
    public boolean cumpleCondiciones() {
        // Mujeres: 40 <= peso <= 80; 140 <= altura <= 180; edad > 15
        return (peso >= 40 && peso <= 80) && 
               (altura >= 140 && altura <= 180) && 
               (edad > 15);
    }
    
    @Override
    public String obtenerGenero() {
        return "Mujer";
    }
}

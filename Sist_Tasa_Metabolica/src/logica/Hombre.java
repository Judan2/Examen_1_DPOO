package logica;

public class Hombre extends Genero {
	//atributos especificos 
		//no tiene (aun) 

    public Hombre(String nombre, double peso, double altura, int edad) {
        super(nombre, peso, altura, edad);
    }
    
    
    public double calcularTMB() {
        // TMB = 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad)
        return 88.362 + (13.397 * this.peso) + (4.799 * this.altura) - (5.677 * this.edad);
    }
    public boolean cumpleCondiciones() {
        // Hombres: 60 <= peso <= 110; 160 <= altura <= 195; edad > 15
        return (peso >= 60 && peso <= 110) && 
               (altura >= 160 && altura <= 195) && 
               (edad > 15);
    }
    
    @Override
    public String obtenerGenero() {
        return "Masculino";
    }
    
    @Override
    public double calcularIMC() {
        double alturaMetros = altura / 100.0;
        return peso / (alturaMetros * alturaMetros);
    }


        

    


}

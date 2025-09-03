package presentacion;

import logica.*;

public class principal {
	

	public class Principal {
	    
	    public static void main(String[] args) {
	        System.out.println("=== CALCULADORA DE TMB ===\n");
	        
	        // Crear personas de prueba
	        Hombre hombre1 = new Hombre( 75, 175, 30,"carlo");
	        Mujer mujer1 = new Mujer( 60, 165, 25, "ana");
	        Hombre hombre2 = new Hombre( 50, 150, 40, "sofia"); // No
	        Mujer mujer2 = new Mujer( 90, 200, 35, "antonia");  
	        
	        // Array para poli
	        Genero[] personas = {hombre1, mujer1, hombre2, mujer2};
	        
	        // Mostrar resultados
	        for (int i = 0; i < personas.length; i++) {
	            Genero p = personas[i];
	            
	            System.out.println("--- Persona " + (i + 1) + " ---");
	            System.out.println("Nombre: " + p.getNombre());
	            System.out.println("Género: " + p.obtenerGenero());
	            System.out.println("Peso: " + p.getPeso() + " kg");
	            System.out.println("Altura: " + p.getAltura() + " cm");
	            System.out.println("Edad: " + p.getEdad() + " años");
	            
	            if (p.cumpleCondiciones()) {
	                System.out.println("✅ Cumple condiciones");
	                System.out.println("TMB: " + String.format("%.2f", p.calcularTMB()) + " calorías/día");
	            } else {
	                System.out.println("❌ NO cumple condiciones");
	                System.out.println("TMB no calculable (fuera de rangos válidos)");
	            }
	            System.out.println();
	        }
	        
	        // Casos adicionales
	        caso1();
	        caso2();
	    }
	    
	    private static void caso1() {
	        System.out.println("=== CASO 1: POLIMORFISMO ===");
	        
	        Gnero p;
	        
	        // Ejemplo con hombre
	        p = new Hombre("Pedro", 80, 180, 25);
	        System.out.println("Hombre: " + p.calcularTMB() + " cal/día");
	        
	        // Ejemplo con mujer  
	        p = new Mujer("Laura", 55, 160, 30);
	        System.out.println("Mujer: " + p.calcularTMB() + " cal/día");
	        
	        System.out.println();
	    }
	    
	    private static void caso2() {
	        System.out.println("=== CASO 2: ARRAY DE HOMBRES ===");
	        
	        Hombre[] hombres = new Hombre[3];
	        hombres[0] = new Hombre("Juan", 70, 175, 28);
	        hombres[1] = new Hombre("Diego", 85, 185, 32);
	        hombres[2] = new Hombre("Roberto", 65, 170, 24);
	        
	        for (int i = 0; i < hombres.length; i++) {
	            System.out.println(hombres[i].getNombre() + " - TMB: " + 
	                String.format("%.2f", hombres[i].calcularTMB()) + " cal/día");
	        }
	        
	        System.out.println("\n=== FIN DEL PROGRAMA ===");
	    }

}

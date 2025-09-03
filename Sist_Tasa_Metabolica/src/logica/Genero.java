package logica;

public abstract class Genero {
	//atributos 
	private double peso;
	private double altura;
	private int edad;
	private String genero;
	
	
	public Genero (double peso, double altura, int edad, String genero) {
		this.altura = altura ;
		this.peso = peso;
		this.edad = edad; 
		this.genero = genero;
	}
	
	//GETTTERS AND SETTERS ;
	//peso
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso ;
	}			
		
	// Altura 
	public double getAltura() {
		return this.altura;
		}
	public void setAltura(double altura) {
		this.altura = altura;		
	}
	//edad ;
	
	public double getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getGenero( ) {
		return this.genero;
	}
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	
	//los calculeeeee; 
	public abstract double calcularTMB();
	public abstract boolean cumpleCondiciones();

	
}


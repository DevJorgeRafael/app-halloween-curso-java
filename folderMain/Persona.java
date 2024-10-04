package folderMain;

public class Persona {
    String nombre;
    int edad;
    double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public Persona() {
        this.nombre = "Pepito";
        this.edad = 10;
        this.altura = 150;
    }
    
    public String ImprimirPersona (){
        return "Nombre: "+this.nombre+"\nEdad: "+this.edad+"\nAltura: "+this.altura+"\n";
    }
    
    public int calcularSustosPorNombre(){
        return this.nombre.length()/2;
    }
    
    public int calcularSustosPorEdad(){
        return (this.edad%2==0)? 2: 0;
    }
    
    public int calcularDulcesPorNombre(){
        return this.nombre.length();
    }
    
    public int calcularDulcesPorEdad(){
        if(this.edad > 10) return 0;
        int resultado = (int) this.edad/3;
        return resultado;
    }
    
    public int calcularDulcesPorAltura(){
        if(this.altura > 150) return 0;
        return ((int) this.altura / 50) * 2;
    }
}

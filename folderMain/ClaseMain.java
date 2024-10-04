package folderMain;

public class ClaseMain {
    public static void ImprimirArreglo (Persona [] persona){
        for (int i = 0; i < persona.length; i++) {
            System.out.println(persona[i].ImprimirPersona());
        }
    }
    
    public static int calcularSustosPorAltura(Persona[] personas){
        int aux = 0;
        for (int i = 0; i < personas.length; i++) {
            aux+= personas[i].altura;
        }
        return aux/100 * 3;
    }
    
    public static int sumarTodosLosSustos(Persona[] personas){
        int aux = 0;
        for (int i = 0; i < personas.length; i++) {
            aux+= personas[i].calcularSustosPorEdad();
            aux+= personas[i].calcularSustosPorNombre();
        }
        aux+= calcularSustosPorAltura(personas);
        return aux;
    }
    
    public static int sumarTodosLosDulces(Persona[] personas){
        int aux = 0;
        for (int i = 0; i < personas.length; i++) {
            aux += personas[i].calcularDulcesPorAltura();
            aux += personas[i].calcularDulcesPorEdad();
            aux += personas[i].calcularDulcesPorNombre();
        }
        return aux;
    }
    
    public static String dulceOSusto(int numDulces, String[] arregloCaras){
        String caritas = "";
        for (int i = 0; i < numDulces; i++) {
            caritas += arregloCaras[(int) (Math.random() * arregloCaras.length)];
            caritas += "\t";
        }
        
        return caritas;
    }
    
    public static String susto(int numSustos){
        String[] sustos = {":(", "XD", "xd", ":o", ":O", ":c"};
        String caritas = "";
        for (int i = 0; i < numSustos; i++) {
            caritas += sustos[(int) (Math.random() * sustos.length)];
            caritas += "\t";
        }
        
        return caritas;
    }

    public static void main(String[] args) {
        Persona[] personas = new Persona[2];
        
        String[] dulces = {":)", ":3", ":D", ":v", ":u", "c:"};
        String[] sustos = {":(", "XD", "xd", ":o", ":O", ":c"};
        
        personas[0] = new Persona("Juan", 2, 149);
        personas[1] = new Persona("Pablo", 15, 150);

        
        int numSustos = sumarTodosLosSustos(personas);
        System.out.println("Sustos: "+ numSustos);
        System.out.println(dulceOSusto(numSustos, sustos));
        
    }
    
}

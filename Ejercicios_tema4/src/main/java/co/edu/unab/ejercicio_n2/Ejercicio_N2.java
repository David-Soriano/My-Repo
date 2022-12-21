
package co.edu.unab.ejercicio_n2;
public class Ejercicio_N2 {

    public static void main(String[] args) {
        //Parte N°1
        int numeroIf = -1000;
        
        if (numeroIf == 0) {
            System.out.println(numeroIf+" es el número 0.");
        
        }else if(numeroIf > 0){
                    System.out.println(numeroIf+" es un número positivo");
                    }
        else{
            System.out.println(numeroIf+" es un número negativo");
        }
        
        //Parte N°2
        int numeroWhile = 0;
        
        while (numeroWhile < 3) {            
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        
        //Parte N°3
        int numeroDoWhile = 0;
        
        do {            
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile<1);
        
        //Parte N°4
            for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
                System.out.println(numeroFor);
        }
            
        //Parte N°5
        String Estacion = "Verano";
        
        switch(Estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}

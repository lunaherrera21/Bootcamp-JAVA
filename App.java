public class App {
    public static void main(String[] args) 
    {
        suma(1,2,1);
        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println("El número de puertas que tiene es: " + miCoche.puertas);
    }

    public static void suma(int a, int b, int c){
        int resultado = a+b+c;
        System.out.println("El resultado de la suma es: " + resultado);
       
    }
}

class Coche{
    public int puertas =0;
        public void aumentarPuertas(){
            this.puertas++;
        }
}






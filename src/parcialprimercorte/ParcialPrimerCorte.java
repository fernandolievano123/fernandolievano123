package parcialprimercorte;

public class ParcialPrimerCorte {

    public static void main(String[] args) {
        int numero = 7;
        int divisor = 2;
        int contador = 0;
        int residuo;
        
        if (divisor == 0) {
            System.out.println("No se puede dividir por cero.");
            return;
        }

        int contdivision = 0;
        for (int i = 0; contdivision + divisor <= numero; i++) {
            contdivision =contdivision + divisor;
            contador++;
        }
        
        residuo = numero - contdivision;

        
        System.out.println(numero + " / " + divisor + " = " + contador + 
                           " con residuo de: " + residuo);
    }
}

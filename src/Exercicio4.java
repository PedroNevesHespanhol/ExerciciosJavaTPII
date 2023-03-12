import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int count = 0;
        

        System.out.println("Quantos numeros deseja adicionar?");
        int [] array = new int[sc.nextInt()];

        for (i = 0; i<array.length; i++) {
            System.out.print("Qual é o "+ ( i + 1) + "º numero? ");
            array[i] = sc.nextInt();

            if(array[i] < 0){
                count ++;
            }
            
        }
        System.out.println("Neste array possui "+ count + " numeros negativos.");  
        sc.close();
    }
}

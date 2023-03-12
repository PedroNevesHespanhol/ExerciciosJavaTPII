import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite seu salario bruto: ");
        Double salBruto = leitorScanner.nextDouble();
        Double salLiquido = 0.0;
        Double aliquota = 0.0;
        Double desconto = 0.0;
        Double deducao = 0.0;

        if(salBruto >= 0.0 && salBruto <= 1212.0){
            aliquota = 7.5;
            desconto = salBruto * aliquota/100 - deducao;
            salLiquido = salBruto - desconto;
        }else if(salBruto >= 1212.01 && salBruto <= 2427.35){
            aliquota = 9.0;
            deducao = 18.18;
            desconto = salBruto * aliquota/100 - deducao;
            salLiquido = salBruto - desconto;
        }else if(salBruto >= 2427.36 && salBruto <= 3641.03){
            aliquota = 12.0;
            deducao = 91.0;
            desconto = salBruto * aliquota/100 - deducao;
            salLiquido = salBruto - desconto;
        }else if(salBruto >= 3641.04 && salBruto <= 7087.22){
            aliquota = 14.0;
            deducao = 163.82;
            desconto = salBruto * aliquota/100 - deducao;
            salLiquido = salBruto - desconto;
        }

        System.out.println("##########################" + "\nCALCULADORA DE INSS" + "\n##########################"
        + "\nSalario Bruto.....: " + salBruto + "\nAliquota INSS (%).: " + aliquota + "\nDesconto INSS ....: " + desconto 
        + "\nSalario Liquido ..: " + salLiquido + "\n##########################");

    }
}

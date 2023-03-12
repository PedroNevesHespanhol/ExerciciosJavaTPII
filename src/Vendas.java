import java.util.Scanner;

public class Vendas {

    public static void compras(int i, int[] qtde, double[] valorUnidade, int[] codigoProd, Scanner sc) {
        System.out.println("Informe o codigo do produto");
        codigoProd[i] = sc.nextInt();

        System.out.println("Informe Valor Unitario do produto");
        valorUnidade[i] = sc.nextDouble();

        System.out.println("Informe Quantidade de produtos");
        qtde[i] = sc.nextInt();
    }

    public static void calcularValorTotal(int i, int[] qtde, double[] valorUnidade, double[] total) {
        total[i] = qtde[i] * valorUnidade[i];
        System.out.println("Valor total da compra: " + total[i]);
    }

    public static void maiorMenorVenda(int vendeMais, int vendeMenos, int[] qtde, int[] codigoProd, double[] total) {
        int i;
        for (i=1; i < 10; i++) {
            if (qtde[i] > vendeMais) {
                vendeMais = qtde[i];
            }
            if (qtde[i] < vendeMenos) {
                vendeMenos = qtde[i];
            }
        }

        for (i=1; i < 10; i++) {
            if (qtde[i] == vendeMais) {
                System.out.println("Produto mais vendido: Codigo Produto " + codigoProd[i] + " , Quantidade " + qtde[i] + " , Valor Total " + total[i]);
            }
            if (qtde[i] == vendeMenos) {
                System.out.println("Produto menos vendido: Codigo Produto " + codigoProd[i] + " , Quantidade " + qtde[i] + " , Valor Total " + total[i]);
            }
        }
    }

}

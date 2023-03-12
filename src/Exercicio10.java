import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        int i;
        int vendeMais =0;
        int vendeMenos=100000;
        double totalVendido =0;
        int itensVendidos = 0;
        int[] qtde = new int[10];
        double[] valorUnidade  = new double[10];
        int[] codigoProd = new int[10];
        double[] total  = new double[10];
        double media;


        for (i=1; i < 10; i++) {
            Scanner sc = new Scanner(System.in);

            Vendas.compras(i, qtde, valorUnidade, codigoProd, sc);
            Vendas.calcularValorTotal(i, qtde, valorUnidade, total);
            System.out.println("----------------------------------");

        }

        Vendas.maiorMenorVenda(vendeMais, vendeMenos, qtde, codigoProd, total);

        for (i=1; i<10; i++) {
            totalVendido += total[i];
            itensVendidos = qtde[i];
        }

        media = totalVendido / itensVendidos;

        System.out.println("Valor Total itens vendidos: " + totalVendido);
        System.out.println("qtde Total itens vendidos: " + itensVendidos);
        System.out.println("Valor medio vendido: " + media);
    }

}
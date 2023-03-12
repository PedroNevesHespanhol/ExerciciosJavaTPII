import java.text.DecimalFormat;

public class Exercicio9 {
    public static void main(String[] args) {

        
        // Dados dos investimentos
        double taxaSelic = 0.02; // 2%
        double capital = 1000; // R$ 1000,00
        
        // Investimento A: CDB Banco Pague Mais
        double taxaRendimentoA = 0.85 * taxaSelic;
        double taxaAdministrativaA = 0.1;
        double rendimentoA = 0;
        double descontosA = 0;
        double rendimentoLiquidoA = 0;
        
        // Investimento B: CDB Fura Bolso
        double taxaRendimentoB = 0.93 * taxaSelic;
        double taxaAdministrativaB = 0.01;
        double impostoRendimentoB = 0.06;
        double rendimentoB = 0;
        double descontosB = 0;
        double rendimentoLiquidoB = 0;
        
        // Cálculo dos rendimentos mensais
        DecimalFormat df = new DecimalFormat("#.##"); // para formatar as saídas
        System.out.println("Taxa Selic: " + df.format(taxaSelic * 100) + "%");
        System.out.println("Capital investido: R$ " + df.format(capital));
        System.out.println();
        System.out.println("Investimento A: CDB Banco Pague Mais");
        System.out.println("Taxa de rendimento: " + df.format(taxaRendimentoA * 100) + "%");
        System.out.println("Taxa administrativa: " + df.format(taxaAdministrativaA * 100) + "%");
        System.out.println();
        System.out.println("Mês\tCapital\t\tRendimento\tTotal");
        for (int mes = 1; mes <= 12; mes++) {
            rendimentoA = capital * taxaRendimentoA;
            descontosA = rendimentoA * taxaAdministrativaA;
            rendimentoLiquidoA = rendimentoA - descontosA;
            capital += rendimentoLiquidoA;
            System.out.println(mes + "\tR$ " + df.format(capital) + "\tR$ " + df.format(rendimentoLiquidoA) + "\tR$ " + df.format(capital));
        }
        System.out.println("Rendimento Total: R$ " + df.format(capital - 1000));
        System.out.println("Descontos: R$ " + df.format(descontosA * 12));
        System.out.println("Rendimento Líquido: R$ " + df.format(capital - 1000 - descontosA * 12));
        System.out.println();
        capital = 1000; // reinicia o valor do capital
        
        System.out.println("Investimento B: CDB Fura Bolso");
        System.out.println("Taxa de rendimento: " + df.format(taxaRendimentoB * 100) + "%");
        System.out.println("Taxa administrativa: " + df.format(taxaAdministrativaB * 100) + "%");
        System.out.println("Imposto sobre o rendimento: " + df.format(impostoRendimentoB * 100) + "%");
        System.out.println();
        System.out.println("Mês\tCapital\t\tRendimento\tTotal");
        for (int mes = 1; mes <= 12; mes++) {
            rendimentoB = capital * taxaRendimentoB;
            descontosB = rendimentoB * taxaAdministrativaB;
            rendimentoLiquidoB = rendimentoB - descontosB;
            capital += rendimentoLiquidoB;
            System.out.println(mes + "\tR$ " + df.format(capital) + "\tR$ " + df.format(rendimentoLiquidoB) + "\tR$ " + df.format(capital));
        }
        System.out.println("Rendimento Total: R$ " + df.format(capital - 1000));
        System.out.println("Descontos: R$ " + df.format(descontosB * 12));
        System.out.println("Rendimento Líquido: R$ " + df.format(capital - 1000 - descontosB * 12));
        System.out.println();
        capital = 1000; // reinicia o valor do capital

    }
}

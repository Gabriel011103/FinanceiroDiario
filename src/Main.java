    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            double gastosFixos = 60;
            double valorFuncionarios = 265;
            boolean continuar = false;
            Scanner scanner = new Scanner(System.in);
            while (!continuar) {
                System.out.println("Digite o faturamento de hoje");
                double faturamentoDia = scanner.nextDouble();
                scanner.nextLine();
                //O calculo dos insumos é de 50%
                double insumosDia = faturamentoDia * 0.50;
                System.out.println("A saida para pagamento foi igual aos demais dias ? Digite S para sim e N para não. ");
                String pagamentoFuncionarios = scanner.nextLine();
                //Foi considerado o valor de pagamento da seguinte forma: 60 Peixoto, 60 Dessarei, 50 Eduardo, 55 Entregador
                //40 Welica
                if (pagamentoFuncionarios.equals("S")) {
                    System.out.println("FATURAMENTO: " + faturamentoDia);
                    System.out.println("VALOR PARA INSUMOS: " + insumosDia);
                    System.out.println("GASTOS FIXOS: " + gastosFixos);
                    System.out.println("FUNCIONARIOS: " + valorFuncionarios);
                    System.out.println("O VALOR DE LUCRO HOJE FOI DE: " + (faturamentoDia - insumosDia - gastosFixos - valorFuncionarios));
                } else if (pagamentoFuncionarios.equals("N")) {
                    System.out.println("Digite quanto os funcionarios receberam hoje: ");
                    double atualizaSalario = scanner.nextDouble();
                    System.out.println("FATURAMENTO: " + faturamentoDia);
                    System.out.println("VALOR PARA INSUMOS: " + insumosDia);
                    System.out.println("GASTOS FIXOS: " + gastosFixos);
                    System.out.println("FUNCIONARIOS: " + atualizaSalario);
                    System.out.println("O VALOR DE LUCRO HOJE FOI DE: " + (faturamentoDia - insumosDia - gastosFixos - atualizaSalario));
                    continuar = true;
                } else {
                    System.out.println("Opção invalida, digite S para sim ou N para não.");
                }
            }
                scanner.close();

        }
    }
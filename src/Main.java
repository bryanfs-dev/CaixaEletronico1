import javax.swing.JOptionPane;

public class Main
{
    static double saldo = 0;

    public static void depositar()
    {

        String entrada = JOptionPane.showInputDialog("Digite o valor do depósito:");

        double valor = Double.parseDouble(entrada);

        saldo += valor;

        JOptionPane.showMessageDialog(null,
                "Depósito realizado!\nSaldo atual: R$ " + saldo);
    }

    public static void sacar()
    {

        String entrada = JOptionPane.showInputDialog("Digite o valor do saque:");

        double valor = Double.parseDouble(entrada);

        saldo -= valor;

        JOptionPane.showMessageDialog(null,
                "Saque realizado!\nSaldo atual: R$ " + saldo);
    }

    public static void consultarSaldo()
    {

        JOptionPane.showMessageDialog(null,
                "Saldo atual: R$ " + saldo);
    }

    public static void main(String[] args)
    {

        String opcao = "";

        while (!opcao.equals("4"))
        {

            opcao = JOptionPane.showInputDialog(
                    "CAIXA ELETRÔNICO\n\n" +
                            "1 - Depositar\n" +
                            "2 - Sacar\n" +
                            "3 - Consultar saldo\n" +
                            "4 - Sair\n\n" +
                            "Digite uma opção:"
            );

            switch (opcao)
            {

                case "1":
                    depositar();
                    break;

                case "2":
                    sacar();
                    break;

                case "3":
                    consultarSaldo();
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null,
                            "Programa encerrado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Opção inválida.");
            }
        }
    }
}
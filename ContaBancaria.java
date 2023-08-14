import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        System.out.println("Nome do cliente: ");
        String nomeCliente = leitor.nextLine();
        System.out.println("Tipo de conta: ");
        String tipoConta = leitor.nextLine();
        System.out.println("Saldo inicial: ");
        Double saldoConta = leitor.nextDouble();

        String mensagem = ("""
            
            *****************************************************
            Dados iniciais do cliente:
            
            Nome:            %s
            Tipo de conta:   %s
            Saldo inicial:   R$ %.3f
            *****************************************************                 
            """).formatted(nomeCliente, tipoConta, saldoConta);

        System.out.println(mensagem);

        do {
            System.out.println("""   
                    Operações
                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                            
                    Digite a opção desejada:     
                    """);
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é R$ " + saldoConta);
                    break;
                case 2:
                    System.out.println("Informe o valor a ser recebido: ");
                    double valorRecebido = leitor.nextDouble();
                    saldoConta += valorRecebido;
                    System.out.println("Saldo atualizado : R$ " + saldoConta);
                    break;
                case 3:
                    System.out.println("Informe o valor a ser transferido: ");
                    double valorTransferencia = leitor.nextDouble();

                    if (valorTransferencia > saldoConta){
                        System.out.println("Saldo insuficiente! Não é possível realizar esta operação.");
                        break;
                    }
                    saldoConta -= valorTransferencia;
                    System.out.println("Saldo atualizado: R$ " + saldoConta);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}

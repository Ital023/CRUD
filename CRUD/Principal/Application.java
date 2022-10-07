package Principal;

import Entities.Funcionario;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[100];
        int n = 9,i=0;
        int cadAcum=1;
        while(n != 0){
            System.out.println("Digite 1 para cadastrar funcionario");
            System.out.println("Digite 2 para visualizar funcionario");
            System.out.println("Digite 3 para remover funcionario");
            System.out.println("Digite 4 para alterar funcionario");
            System.out.println("Digite 0 para sair");
            System.out.println("Insira a opcao: ");
            int system = sc.nextInt();

            if(system == 1){
                int cadastrar = 1;
                while(cadastrar == 1){
                    System.out.printf("Cadastro #%d: \n",cadAcum);
                    System.out.print("Insira o nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    int id = i;

                    System.out.print("Insira o salario: ");
                    double salario = sc.nextDouble();

                    System.out.print("Insira as horas trabalhadas: ");
                    int horasTrabalhadas = sc.nextInt();

                    System.out.print("Insira o cargo: ");
                    sc.nextLine();
                    String cargo = sc.nextLine();

                    System.out.print("Insira o expediente: ");
                    String expediente = sc.nextLine();

                    funcionarios[i] = new Funcionario(nome,id,salario,horasTrabalhadas,cargo,expediente);
                    i++;
                    cadAcum++;
                    System.out.println("Insira [1] para sim e [0] para nao");
                    System.out.print("Deseja cadastrar outro funcionario: ");
                    cadastrar = sc.nextInt();
                }
            }
            if(system == 2){
                System.out.print("Visualizar todos os funcionarios[1] ou individualmente[2]: ");
                int visuFunc = sc.nextInt();

               if(visuFunc == 1){
                   for(Funcionario x : funcionarios){
                       if(x != null){
                           System.out.println(x);
                       }
                   }
               }else if(visuFunc == 2){
                   System.out.print("Insira o indice para visualizar individualmente: ");
                   int indVisuFunc = sc.nextInt();

                   System.out.println(funcionarios[indVisuFunc]);
               }

            }
            if(system == 3){
                System.out.print("Insira o funcionario para deletar: ");
                int indiceFunc = sc.nextInt();
                funcionarios[indiceFunc] = null;
            }
            if(system == 4){
                System.out.print("Digite o funcionario que deseja alterar: ");
                int indAltFunc = sc.nextInt();

                System.out.println("Insira [1]Nome,[2]Salario,[3]Horas trabalhadas,[4]Cargo,[5]Expediente");
                System.out.println("Insira a informacao que deseja alterar: ");
                int altFunc = sc.nextInt();
                if(altFunc == 1){
                    System.out.println("Insira o novo nome: ");
                    sc.nextLine();
                    String novoNome = sc.nextLine();

                    funcionarios[indAltFunc].setNome(novoNome);
                }else if(altFunc == 2){
                    System.out.println("Insira o novo salario: ");
                    double novoSalario = sc.nextDouble();

                    funcionarios[indAltFunc].setSalario(novoSalario);
                }else if(altFunc == 3){
                    System.out.println("Insira a nova Hora de trabalho: ");
                    int novoHrTrabalhada = sc.nextInt();

                    funcionarios[indAltFunc].setHorasTrabalhadas(novoHrTrabalhada);
                }else if(altFunc == 4){
                    System.out.println("Insira o novo Cargo: ");
                    sc.nextLine();
                    String novoCargo = sc.nextLine();

                    funcionarios[indAltFunc].setCargo(novoCargo);
                }else if(altFunc == 5){
                    System.out.println("Insira o novo expediente: ");
                    sc.nextLine();
                    String novoExpediente = sc.nextLine();

                    funcionarios[indAltFunc].setNome(novoExpediente);
                }else{
                    System.out.println("Insira uma opcao valida!!!");
                }
            }
            if(system == 0){
                break;
            }
        }
        sc.close();
    }
}

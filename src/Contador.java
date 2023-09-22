import java.util.InputMismatchException;
import java.util.Scanner;



public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;
        // declarei os atributos acima para ele reconhecer



        boolean entradaValida = false;
        while (!entradaValida) {
            // ou seja irá realizar o que está abaixo do try, enquanto  a entrada for true
            // diferente(!) de "entradavalida".
            try {
                System.out.println("Digite o primeiro parâmetro: ");
                parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro: ");
                parametroDois = terminal.nextInt();
                entradaValida = true; // Se chegou até aqui, então a entrada é válida
            } catch (InputMismatchException e) {
                System.out.println("Presta atenção...insira um número inteiro.");
                terminal.nextLine(); // Limpa o buffer do scanner,
                // pois sempre quando alterna entre String e Int ocorre erro no Scanner
            }
        }

        System.out.println("Você inseriu os números inteiros: " + parametroUm + " e " + parametroDois);
        terminal.close();// o ideal é sempre fechar o Scanner


        try {
            // Chamando o método "contar" abaixo contendo as regras
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("Atenção: " + exception.getMessage());
            // Aqui o exception.getMessage irá pegar a mensagem e printar na tela
        }



    }



    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        // contar é um método, que possui dois atributos inteiros(parametroUm e Dois) e lança(throws) uma
        // Classe chamada ParametrosInvalidosException

        if (parametroUm >= parametroDois) {

            // aqui ele lança a exceção através do throw new

            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            // o que está entre parênteses, foi definido o tipo da entrada lá na classe ParametrosInvalidosException
        }

            int contagem = parametroDois - parametroUm;
            //contagem é uma variável, pois ela está modoficando o valor do atributo

            for (int i = contagem; i >= 1; i--) {

                // o primeiro i sempre será o valor inicial e o segundo sempre valor final, se vai diminuir ou aumentar,
                // isso é definido pelo -- / ++
                // irá começar da diferença do subtração acima(contagem) até o final que é 1,
                // para vocẽ saber qual a diferença da subtração

                System.out.println("A diferença entre eles são os números: "+i);
                // Aqui ele irá printar a interação dessa subtração e ir diminuindo até 1,
                // exe.: se você colocar 16 e 20, ele irá imprimir: 4, 3, 2 e 1


        }



        }



    }


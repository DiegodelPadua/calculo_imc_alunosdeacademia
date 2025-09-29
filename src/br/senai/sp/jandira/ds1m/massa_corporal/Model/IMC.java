package br.senai.sp.jandira.ds1m.massa_corporal.Model;

import java.util.Scanner;

public class IMC {
    String nome;
    double peso;
    double altura;
    double imc;
    int opcao;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Calculador de IMC");
        System.out.println("--------------------------");

        //Obtendo nome do aluno
        System.out.println("Digite o nome do aluno: ");
        nome = leitor.nextLine();

        //Obtendo peso do aluno
        System.out.println("Digite o peso (em kg): ");
        peso = leitor.nextDouble();

        //Obtendo a altura do aluno
        System.out.println("Digite a altura (metros): ");
        altura = leitor.nextDouble();

        calcularImc();
    }

    public void calcularImc(){
        imc = peso/(altura * altura);

        classificacaoDoStatus();

    }
    public void classificacaoDoStatus() {

        if (imc <= 18.5) {

            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + imc);
            System.out.println("Abaixo do peso");

        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + imc);
            System.out.println("Peso ideal (parabéns)");

        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + imc);
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + imc);
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + imc);
            System.out.println("Obesidade grau II (severa)");
        } else if (imc >= 40.0) {
            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + imc);
            System.out.println("Obesidade III (mórbida)");
        }
        reinicioDaOperacao();

    }
    public void reinicioDaOperacao(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("Digite 1 para calcular o IMC de outro aluno ou 0 para sair. ");
        opcao = leitor.nextInt();

        if ( opcao == 1){
            obterDados();
        }else {
            System.out.println("**FIM**");
        }


    }

}





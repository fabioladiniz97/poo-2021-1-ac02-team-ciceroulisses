/*Crie um programa e declare nele 3 variáveis numéricas int, inicializando-as com algum valor e obtenha a soma dessas variáveis e a
média delas, imprimindo esses resultados na tela.*/

public class CBBAtividadePratica2 {
  public static void main(String[] args) {

    int valorNumerico1 = 7;
    int valorNumerico2 = 8;
    int valorNumerico3 = 10;

    int soma = valorNumerico1 + valorNumerico2 + valorNumerico3;
    double media = soma / 3.0;

    System.out.println("O valor da soma é: " + soma);
    System.out.println("O valor da media é: " + media);

  }
}

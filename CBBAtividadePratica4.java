/*Crie um programa que elabore o orçamento de uma construtora
para o cálculo do valor total de construção de uma piscina. O valor
total será dado pela cubagem da piscina (metros cúbicos) multiplicada por R$100,00,
que é o preço do metro cúbico construído de piscina. Faça a simulação dos cálculos no
programa para ver se está tudo funcionando corretamente.*/

public class CBBAtividadePratica4 {
  public static void main(String[] args) {

    float comprimento = 7;
    float largura = 2.30f;
    float profundidade = 1.50f;

    float cubagem = comprimento * largura * profundidade;

    float orcamento = cubagem * 100;

    System.out.printf("Valor total é: %5.2f R$", orcamento);

  }
}

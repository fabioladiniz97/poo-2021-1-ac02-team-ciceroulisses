public class BMExercicio03 {
  public static void main(String[] args) {

    float valorItem1 = 2.95f;
    float valorItem2 = 3.50f;
    float custoTotal = valorItem1 + valorItem2;

    System.out.println("O primeiro item custa " + valorItem1 + " R$, O segundo custa " + valorItem2 + " R$");

    System.out.println("O valor total: " + custoTotal + " R$");

    final float taxa = 8.25f;
    float taxaCalculada = custoTotal + (custoTotal * (taxa / 100));

    System.out.println("O valor total com taxa: " + taxaCalculada + " R$");

    valorItem1 += taxaCalculada;
    valorItem2 += taxaCalculada;

    float novoCusto = valorItem1 + valorItem2;
    System.out.println("O novo custo: " + novoCusto + " R$");

    boolean muitoCaro = novoCusto > 10;
    System.out.println("Eh muito caro: " + muitoCaro);
  }
}

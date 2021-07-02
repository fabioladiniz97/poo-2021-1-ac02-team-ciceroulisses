public class Main {
  public static void main(String[] args) {
    
    float valor1 = 2.95f;
    float valor2 = 3.50f;
    float soma   = valor1 + valor2;

    System.out.printf("O primeiro item custa %5.2f R$, O segundo custa %5.2f R$", valor1, valor2);

    System.out.printf("\nO valor total: %5.2f R$", soma);

    final float taxa = 8.25f;
    float taxaCalculada = soma + (soma * (taxa / 100));

    System.out.printf("\nO valor total com taxa: %5.2f R$", taxaCalculada);

    float novoValor1 = valor1 + (valor1 * (taxa / 100));
    float novoValor2 = valor2 + (valor2 * (taxa / 100));

    float novoCusto = novoValor1 + novoValor2;

    System.out.printf("\nO Novo Custo: %5.2f R$", novoCusto);
  
  }
}

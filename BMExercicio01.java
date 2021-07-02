public class BMExercicio01 {
    public static void main(String[] args) {
        // 1. Analise as seguintes declarações de variáveis e assinale (V) para Verdadeiro e (F) para Falso
        byte x = 300; // F, byte vai no máximo até 127
        short $mom = 43; // V, nomes de variaveis podem começar com $, embora desaconselhado
        int num = 2.5; // F, inteiros não têm casas decimais
        double d = 20; // V, também funcionaria com 20.0 ou 20d
        char c = 25; // V, caracteres podem ser dados por sua posição numérica
        boolean epar = (4%2=0); // F, = é para atribuições, é == que faz a comparação e retorna um booleano
        char nome = “Maria”; // F, tipo char amarzena só um caractere e delimitado por aspas simples
        String b = "1"; // V, "1" é uma string válida
        float x = 2.7; // F, floats usam a marcação f no final, seria 2.7f
        int a = false; // F, diferente de C++, Java não converte boolean para inteiro
    }
}
public class BMExercicio04 {
    public static void main(String[] args) {
        // 4. Declare uma variável chamada long1 do tipo long e a inicialize com 100.
        long long1 = 100;

        // Agora declare duas variáveis do tipo int, int1 e int2, e inicialize int1 com
        // 200.
        int int1 = 200, int2;

        // Agora faça int2 receber int1 mais long1 e explique os resultados.
        // int2 = int1 + long1;

        // Arrume o código para que não ocorra o erro anterior.
        int2 = int1 + (int) long1;
    }
}

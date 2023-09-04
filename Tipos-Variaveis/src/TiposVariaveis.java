public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
    
 int numero1 = 1;
 int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if (numero1 < numero2) {
        System.out.println("Essa condição é verdadeira");
    }else
        System.out.println("Essa condição é falsa");

    
    System.out.println("A variavel numeroUm é igual a numerodois? " + simNao);

    simNao = numero1 != numero2;
        System.out.println("A variavel numeroUm é diferente da variavel numeroDois? " + simNao);

    simNao = numero1 > numero2;
        System.out.println("A variavel numeroUm é maior que a numeroDois? " +simNao);

    simNao = numero1 < numero2;
        System.out.println("A variavel numeroUm é menor que a numeroDois? " +simNao);

    }
}

package NivelIntermediario.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Stack(Pilha de Elementos)
        // O ultima a entrar sera o Primeiro a sair
        Stack<String> ninjaStack = new Stack<>();

        //Adicionando Elementos
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke");
        System.out.println("Minha Stack: "+ninjaStack);

        ninjaStack.pop(); //Removendo o ultimo add na pilha (Sasuke)
        System.out.println("Minha Stack: "+ninjaStack);

        ninjaStack.push("Sakura");
        System.out.println("Minha Stack: "+ninjaStack);

        System.out.println("Ultimo Elemento da Stack: "+ninjaStack.peek()); //Vendo o ultimo add da pilha (Sakura)
        System.out.println("Tamanho da Stack: "+ninjaStack.size()); //Vendo o tamanho da pilha (2)


    }
}

import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {

        Stack<String> pila = new Stack<>();


        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println("Pila inicial: " + pila);


        System.out.println("Elemento en la cima (peek): " + pila.peek());


        String eliminado = pila.pop();
        System.out.println("Elemento eliminado (pop): " + eliminado);


        System.out.println("Pila después de pop: " + pila);
    }
}
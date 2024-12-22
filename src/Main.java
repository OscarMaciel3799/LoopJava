import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //En Java, hay varios tipos de bucles (loops) que se pueden utilizar para repetir un bloque de código.

        //El bucle for se utiliza cuando conoces de antemano cuántas veces deseas iterar.
        // Tiene una sintaxis compacta que incluye la inicialización, la condición y la actualización en una sola línea.
        System.out.println("Bucle \"For\"");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //El bucle while se utiliza cuando no sabes cuántas veces se debe repetir el bucle,
        //y deseas que continúe mientras se cumpla una condición.
        System.out.println("Bucle \"while\"");
        int j = 5;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        //El bucle do-while es similar al bucle while, pero garantiza que el bloque de código se ejecute
        // al menos una vez, ya que la condición se evalúa después de la ejecución del bloque.
        System.out.println("Bucle \"do-while\"");
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        System.out.println("Bucle \"for-each\"");
        //El bucle for-each se utiliza para iterar sobre elementos de colecciones (como arreglos, listas, etc.)
        // de manera más sencilla y legible.
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Bucle con \"iteradores\"");
        //Cuando trabajas con colecciones de Java (como ArrayList, HashSet, etc.),
        // puedes usar un iterador para recorrer los elementos.
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Estos bucles ademas los podemos usar con las sentencias: break y continue

        //break: Termina el bucle inmediatamente.
        System.out.println("bucle for con la sentencia break");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Sale del bucle cuando i es 5
            }
            System.out.println(i);
        }
        //continue: Salta la iteración actual y pasa a la siguiente.
        System.out.println("bucle for con la sentencia continue");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Salta los números pares
            }
            System.out.println(i);
        }


    }
}
public class SafeRecursion {

    public static void main(String[] args) {
        int target = 5;
        System.out.println("Iniciando recursión hasta: " + target);
        
        countdown(target);
        
        System.out.println("¡Recursión finalizada con éxito!");
    }

    static void countdown(int n) {
        // Caso base para evitar el StackOverflowError
        if (n <= 0) {
            System.out.println("¡Llegamos al caso base! (Fin de la recursión)");
            return;
        }

        System.out.println("Entrando a countdown con n = " + n);
        
        // Llamada recursiva (crea un nuevo marco en la pila)
        countdown(n - 1);
        
        System.out.println("Saliendo de countdown con n = " + n);
    }
}

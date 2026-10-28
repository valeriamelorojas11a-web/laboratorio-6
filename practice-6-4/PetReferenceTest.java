public class PetReferenceTest {

    public static void main(String[] args) {
        // 1. Creamos la primera mascota en el Heap
        Pet first = new Pet("Luna");
        System.out.println("Nombre original de first: " + first.getName());

        // 2. Agregamos un alias: 'third' apunta al mismo objeto que 'first'
        Pet third = first;
        System.out.println("Nombre de third (alias de first): " + third.getName());

        // 3. Ejecutamos una reasignación con 'alias' (creamos una nueva variable alias)
        Pet alias = new Pet("Nova");
        System.out.println("Nombre de alias tras el new: " + alias.getName());

        // 4. Modificamos el nombre usando el objeto 'alias' nuevo
        alias.rename("Max");
        System.out.println("Nombre de alias después de rename(\"Max\"): " + alias.getName());

        // 5. Consultamos el estado de cada referencia
        System.out.println("\n--- Estado final ---");
        System.out.println("first sigue siendo: " + first.getName()); // Sigue siendo Luna
        System.out.println("third sigue siendo: " + third.getName()); // Sigue siendo Luna
        System.out.println("alias ahora es: " + alias.getName());     // Es Max

        // --- Depuración: Referencia nula (NullPointerException) ---
        System.out.println("\n--- Probando referencia nula ---");
        try {
            Pet missing = null;
            System.out.println(missing.getName()); // Esto lanzará NullPointerException
        } catch (NullPointerException e) {
            System.out.println("¡Atrapado! Ocurrió el error esperado: " + e);
        }
    }
}

class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void rename(String newName) {
        this.name = newName;
    }
}
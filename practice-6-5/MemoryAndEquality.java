public class MemoryAndEquality {

    public static void main(String[] args) {
        // Creamos dos objetos distintos en el Heap con el mismo contenido
        Item item1 = new Item("Laptop", 1200.0);
        Item item2 = new Item("Laptop", 1200.0);
        Item item3 = item1; // Alias de item1

        // 1. Comparación con '==': Compara direcciones de memoria en el Stack/Heap
        System.out.println("--- Comparación de referencias (==) ---");
        System.out.println("item1 == item2 : " + (item1 == item2)); // false (apuntan a objetos diferentes en el Heap)
        System.out.println("item1 == item3 : " + (item1 == item3)); // true (apuntan exactamente al mismo objeto)

        // 2. Comparación con '.equals()': Compara el contenido interno
        System.out.println("\n--- Comparación de contenido (.equals) ---");
        System.out.println("item1.equals(item2) : " + item1.equals(item2)); // true (tienen el mismo nombre y precio)

        // 3. Demostración de Garbage Collection (Recolección de basura)
        System.out.println("\n--- Recolector de Basura (GC) ---");
        // Desvinculamos el objeto al que apuntaba item2
        item2 = null; 
        System.out.println("item2 ahora es null. El objeto anterior en el Heap queda sin referencias.");
        System.out.println("La JVM marcará ese objeto como elegible para ser limpiado por el Garbage Collector.");
        
        // Sugerir la ejecución del recolector de basura (nota: es solo una sugerencia a la JVM)
        System.gc();
        System.out.println("¡Proceso de la Práctica 6.5 finalizado con éxito!");
    }
}

class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Sobrescribimos equals para comparar el contenido de los objetos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item other = (Item) obj;
        return Double.compare(other.price, price) == 0 && name.equals(other.name);
    }
}
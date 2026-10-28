public class ObjectReference {

    public static void main(String[] args) {
        // Creamos un objeto Student en el Heap y su referencia vive en el Stack
        Student student1 = new Student("Leidy", 20);
        
        // student2 copia la referencia y apunta exactamente al mismo objeto en el Heap
        Student student2 = student1;

        System.out.println("Nombre inicial de student2: " + student2.name);

        // Modificamos el atributo name a través de la referencia student2
        student2.name = "Valeria";

        // Al consultar student1 veremos el cambio, porque ambos apuntan al mismo objeto en el Heap
        System.out.println("Nombre en student1 después del cambio: " + student1.name);
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
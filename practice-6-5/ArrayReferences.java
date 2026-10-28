public class ArrayReferences {

    public static void main(String[] args) {
        // 1. Creamos un arreglo de referencias a objetos Student en el Stack.
        // El arreglo en sí vive en el Heap, y sus espacios apuntan inicialmente a null.
        Student[] students = new Student[3];

        System.out.println("--- Estado inicial del arreglo ---");
        System.out.println("students[0] antes de inicializar: " + students[0]);

        // 2. Instanciamos objetos individuales en el Heap y los asignamos al arreglo
        students[0] = new Student("Leidy", 20);
        students[1] = new Student("Valeria", 21);
        students[2] = new Student("Kevin", 22);

        // 3. Recorremos el arreglo para ver los datos de los objetos en el Heap
        System.out.println("\n--- Recorriendo el arreglo de estudiantes ---");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + students[i].name + ", Edad: " + students[i].age);
        }

        // 4. Modificación a través de una posición del arreglo (demostración de referencias)
        students[0].name = "Leidy Valeria";
        System.out.println("\nNombre actualizado en students[0]: " + students[0].name);
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
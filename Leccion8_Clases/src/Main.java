public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.set_edad(35);
        persona1.set_nombre("Nacho");
        persona1.set_telefono(493922334);

        int edad1 = persona1.get_edad();
        String primerNombre = persona1.get_nombre();
        long tel = persona1.get_telefono();

        System.out.println("Su nombre es: " + primerNombre + " tiene " + edad1 + " a;os de edad, y  su telefono es " + tel);
    }
}

class Persona {
   private int edad;
   private String nombre;
   private long telefono;

    public void set_edad(int edad) {
        this.edad = edad;
    }

    public int get_edad() {
        return this.edad;
    }

    public void set_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String get_nombre() {
        return this.nombre;
    }
    public void set_telefono(long telefono) {
        this.telefono = telefono;
    }

    public long get_telefono() {
        return this.telefono;
    }
}


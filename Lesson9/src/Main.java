public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(34, "Santi", 405843830L, 45);
        System.out.println(cliente1.toString());
        Trabajador trabajador1 = new Trabajador(44, "Jony", 909999099L, 670);
        System.out.println(trabajador1.toString());
    }

}

class Persona {
    public int edad;
    public String nombre;
    public long telefono;


}

class Cliente extends Persona {
    public int credito;
    Cliente(int edad, String nombre, long telefono, int credito) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.credito = credito;
    }
        @Override
        public String toString()
        {
            return "Edad: " + this.edad + "\nNombre: " + this.nombre + "\nTelefono:" + this.telefono + "\nCredito: " + this.credito;
        }
    }

    class Trabajador extends Persona {
    public int salario;
    Trabajador(int edad, String nombre, long telefono, int salario) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.salario = salario;
    }

        @Override
        public String toString()
        {
            return "Edad: " + this.edad + "\nNombre: " + this.nombre + "\nTelefono:" + this.telefono + "\nSalario: $" + this.salario;
        }
    }

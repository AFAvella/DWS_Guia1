// Ejercicio 1.
class Fraccionario {
    private int numerador;
    private int denominador;
}

//Ejercicio 2.
class Reloj {
    private int hora;
    private int minutos;
    private int segundos;
}

//Ejercicio 3.
class Fecha {
    private int año;
    private int mes;
    private int dia;
}

//Ejercicio 4.
class Proyectil {
    private int velDisparo;
    private double angulo;
}

//Ejercicio 5.
class Tienda {
    private String nombre;
    private String direccion;
    private int telefono;
    private Productos lacteo;
    private Productos carnico:
    private Productos fruta;
    private Productos enlatado;
}
class Productos {
    private int codigo;
    private String nombre;
    private String tipoProducto;
    private int cantBodega;
    private String nameFabricante;
    private double precioUnitario;
}
class Carnico extends Productos {}
class Lacteo extends Productos {}
class Fruta extends Productos {}
class Enlatado extends Productos {}

//Ejercicio 6.
class Universidad {
    private String nombre;
    private String rector;
    private String ciudad;
    private List<Facultad> facultades;
}
class Facultad {
    private String nombre;
    private String nameProfesors;
    private int cantEstudiantes;
    private String carreras;
    private String cursos;
    private List<Carreras> programas;
}
class Persona {
    private String nombre;
    private int cedula;
    private String nacimiento;
    private String departamentos;
    private String nacionalidad;
    private String ciudad;
}
class Estudiantes extends Persona {
    private int semestreActual;
    private String carrera;
    private String fechaIngreso;
    private Carrera carrera;
}
class Profesor extends Persona {
    private String profesion;
    private double sueldo;
    private Facultad facl1;
}
class Carrera {
    private String nombre;
    private int creditosTotal;
    private int semestre;
    private String nivelCarrera; //Pregrado - Posgrado
    private String facultad;
}
class Cursos {
    private String nombre;
    private int codigo;
    private int creditos;
    private String salon;
    private List<Estudiantes> inscritos;
    private Profesor profACargo;
}
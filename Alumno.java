
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // Almacena el nombre del alumno
    private String nombre;
    // Almacena la edad del alumno
    private int edad;
    // Almacena el numero de clase del alumno
    private int numeroClase;
    // Almacena las notas del alumno
    private ArrayListInt notas;
    // Almacena la nota minima para aprobar
    private static final int NOTA_APROBAR = 5;
    // Almacena la numeracion de los alumnos
    private int numeroAlumno = 1;    

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        numeroClase = numeroAlumno;
        numeroAlumno++;
        notas = new ArrayListInt();
    }

    /**
     * Introduce notas al alumno
     */
    public void asignaNotas(int nota)
    {
        notas.add(nota);
    }
}

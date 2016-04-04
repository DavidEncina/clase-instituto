import java.text.DecimalFormat;

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

    /**
     * Permite conocer la nota media (en decimal) del alumno en este momento.
     */
    public float notaMedia()
    {
        float media = 0;
        if (notas.size() == 0) {
            media = 0.0f;
        }
        else {
            int sumaNotas = 0;
            for(int i = 0; i < notas.size(); i++){
                sumaNotas += notas.get(i);
            }
            media = sumaNotas/(float) notas.size();
        }
        return media;
    }

}

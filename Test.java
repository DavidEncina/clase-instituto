import java.util.Random;

/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    private String[] nombres = {"Dani", "Alfonso", "Pedro", "Juan", "Jesus", "Felipe", "Antonio", "Maria", "Ana", "Lucia"};    
    private static final int EDAD_MINIMA = 18;
    private static final int EDAD_MAXIMA = 82;   
    
    public void test()
    {
        Random random = new Random();
        Alumno alumno1 = new Alumno(nombres[random.nextInt(5)], random.nextInt(EDAD_MAXIMA) + EDAD_MINIMA);
        Alumno alumno2 = new Alumno(nombres[random.nextInt(5)], random.nextInt(EDAD_MAXIMA) + EDAD_MINIMA);
        Alumno alumno3 = new Alumno(nombres[random.nextInt(5)], random.nextInt(EDAD_MAXIMA) + EDAD_MINIMA);
        Alumno alumno4 = new Alumno(nombres[random.nextInt(5)], random.nextInt(EDAD_MAXIMA) + EDAD_MINIMA);
        Alumno alumno5 = new Alumno(nombres[random.nextInt(5)], random.nextInt(EDAD_MAXIMA) + EDAD_MINIMA);
        alumno1.asignaNotas(random.nextInt(11));
        alumno2.asignaNotas(random.nextInt(11));
        alumno3.asignaNotas(random.nextInt(11));
        alumno4.asignaNotas(random.nextInt(11));
        alumno5.asignaNotas(random.nextInt(11));
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
        System.out.println(alumno4);
        System.out.println(alumno5);
    }
}
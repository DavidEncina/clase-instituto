import java.util.Arrays;
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int coleccion[];

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        coleccion = new int [0];
    }

    /**
     * Metodo para añadir un elemento dado al Array
     */
    public void add(int elemento)
    {
        // Creo un array para despues pasar los datos y paso todos los valores con un bucle
        int[] guardado = new int[coleccion.length + 1];

        for(int index = 0; index < coleccion.length; index++)
        {
            guardado[index] = coleccion [index];
        }
        //Asigno el parametro elemento en la posicion dada por el tamaño

        guardado[coleccion.length] = elemento;

        //asigno los valores de la coleccion guardado a la coleccion principal

        coleccion = guardado;
    }

    /**
     * Metodo que añade un elemento a la arrayList en la posicion indicada
     * @param index La posición donde colocar el numero
     * @param elemento El elemento a añadir
     */
    public void add( int index, int elemento)
    {

        if (index <= coleccion.length && index >= 0)
        {
            int[] local = coleccion;
            coleccion = new int[local.length + 1];
            for (int cont = 0; cont < local.length;cont++)
            {
                if (cont < index)
                {
                    coleccion[cont] = local[cont];
                }
                else
                {
                    coleccion[cont+1] = local[cont];
                }
            }
            coleccion[index] = elemento;
        }
    }

    /**
     * Metodo que permite vaciar la coleccion
     */
    public void clear()
    {
        coleccion = new int[0];
    }

    /**
     * Metodo que devuelve si se ha encontrado un elemento en la coleccion a traves del parametro elemento
     */
    public boolean contains(int elemento)
    {
        // Creamos el boolean que devolveremos como false y un indice
        boolean elementoEncontrado = false;
        int index = 0;
        while (index < coleccion.length && (elementoEncontrado == false))
        {
            if (coleccion[index] == elemento)
            {
                elementoEncontrado = true;
            }
            index++;
        }
        return elementoEncontrado;
    }

    /**
     * Metodo que busca si un elemento esta en la posicion eindicada por parametro
     * si no encuentra devuelve -1.
     */
    public int get(int index)
    {

        int elemento = 0;

        if (index >= 0 && index < coleccion.length)
        {
            elemento = coleccion[index];

        } else {

            elemento = -1;

        }
        return elemento;
    }

    /**
     *Metodo que añade un elemento en la posicion indicada sobreescribiendo el anterior
     */
    public void set( int index, int elemento)
    {

        if (index >= 0 && index < coleccion.length)
        {
            coleccion[index] = elemento;
        }
    }

    /**
     * Metodo que devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1 en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int elemento)
    {

        boolean elementoEncontrado = false;
        int indice = 0;
        int elementoBuscado = 0;
        while (indice < coleccion.length && (elementoEncontrado == false))
        {
            if (coleccion[indice] == elemento)
            {
                elementoEncontrado = true;
                elementoBuscado = indice;
            }
            indice++;
        }
        if (elementoEncontrado == false) {

            elementoBuscado = -1;
        }
        return elementoBuscado;
    }

    /**
     * Metodo que devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean coleccionVacia = false;

        if ((coleccion.length == 0)) {
            coleccionVacia = true;
        }

        return coleccionVacia;
    }

    /**
     * Metodo que elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento. Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index)
    {
        int eliminado = -1;
        if(index >= 0 && index < coleccion.length)
        {
            int[] nuevoArray = coleccion;
            coleccion = new int[coleccion.length -1];

            for(int i=0; i < index; i++){
                coleccion[i] = nuevoArray[i];
            }
            for (int i=index; i<coleccion.length; i++){
                coleccion[i] = nuevoArray[i +1];
            }
            eliminado = nuevoArray[index];

        }
        return eliminado;

    }

    /**
     * Metodo que devuelve el número de elementos de la colección
     */
    public int size()
    {
        return coleccion.length;
    }

}
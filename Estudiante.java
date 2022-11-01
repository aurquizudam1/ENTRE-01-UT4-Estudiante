/**
 * Describe a un estudiante
 * Todo estudiante tiene un nombre
 * y guarda las 3 notas que ha sacado en cada una de las tres unidades de
 * trabajo que hay en la evaluaci�n
 * @author (Aimar Urquizu Diego)
 */
public class Estudiante {
    private String nombre;
    private NotaEstudianteUnidad notaA;
    private NotaEstudianteUnidad notaB;
    private NotaEstudianteUnidad notaC;

    /**
     * Constructor
     * Inicializa el nombre del estudiante y el resto lo deja a null
     * Cuando se crea un estudiante inicialmente no tiene registrada ninguna
     * nota
     */
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notaA = null;
        this.notaB = null;
        this.notaC = null;
    }

    /**
     * Accesor para el nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Mutador para el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cantidad de notas registradas hasta el momento
     * (0, 1, 2 o 3)
     */
    public int totalNotas() {
        // devuelve el n� de notas registradas hasta el momento
        int totalNotas = 0;
        if (notaA == null) {
            totalNotas += 0;
        }
        else {
            totalNotas ++;
        }
        if (notaB == null) {
            totalNotas += 0;
        }
        else {
            totalNotas ++;
        }
        if (notaC == null) {
            totalNotas += 0;
        }
        else {
            totalNotas ++;
        }
        
        return totalNotas;
    }

    /**
     * registra un nuevo objeto nota, la nota asociada a una unidad
     * Los objetos se sit�an uno detr�s de otro pero siempre han de quedar
     * las notas en orden de fecha de finalizaci�n de la UT asociada (de
     * menor a mayor)
     * 
     * Pista!! En este m�todo se utilizar� el m�todo totalNotas()
     */
    public void registrarNotaUnidad(NotaEstudianteUnidad nota) {
        //TODO

    }

   
    /**
     * Calcula y devuelve la nota final obtenida por el estudiante en la
     * evaluaci�n que depender� de la ponderaci�n de cada UT
     * El m�todo devuelve -1 si al invocarlo no se han registrado los tres
     * objetos NotaEstudianteUnidad que se necesitan para calcular la nota final
     */
    public double calcularNotaFinalEstudiante() {
       double notaFinalEstudiante = 0;
       // Falta terminar, falta el peso de cada unidad
       if (notaA != null && notaB != null && notaC != null) {
            notaFinalEstudiante = notaA.calcularNotaUnidad() *  + 
                notaB.calcularNotaUnidad() + 
                notaC.calcularNotaUnidad();
       }
       else {
           notaFinalEstudiante = -1;
       }
       
       return notaFinalEstudiante;

    }

    /**
     * Representaci�n textual del estudiante (ver enunciado)
     */
    public String toString() {
        String str2 = String.format("MOLINA HUARTE, Isabel\n" + "*".repeat(80) +
                    "\nNo es posible calcular su nota final de evaluaci�n," +  
                    "faltan notas por registrar");
        
        return str2;
    }

    /**
     * Este m�todo se ha incluido solo para testear la clase m�s f�cilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

    

}

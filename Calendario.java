
/**
 * Write a description of class Calendario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calendario
{
    // instance variables - replace the example below with your own
    private int dia;

    private int mes;

    private int ano;
    
    private String fecha;
    
    private int avanzarFecha;
    
    private String obtenerFecha;

    
    /**
     * Constructor for objects of class Calendario
     */
    public Calendario()
    {
        // initialise instance variables
        dia = 01;
        mes = 01;
        ano = 01;

    }
    
    public void avanzarFecha()
    {
        if (dia >= 1 & dia <= 30){
        avanzarFecha = dia + 1;
        if(mes > 12){
            avanzarFecha = (dia = 1) & (mes = 1);
        }
    }
        else{avanzarFecha = (dia = 1) & (mes + 1);
        }
    }

    public void fijarFecha(int dia, int mes, int ano)
    {
        if (ano > 2000){ 
            if (ano < 2100){
                System.out.println( dia + "dia" + mes + "mes" + ano + "ano");
            }
        }
        else {
            System.out.println("Fechas válidas desde 2001 hasta 2099");
        }
        

    }
    
    public String obtenerFecha()
    {
        dia = dia;
        mes = mes;
        ano = ano;
        fecha = " - - ";
        return fecha;
      
    }


    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}

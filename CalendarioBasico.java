public class CalendarioBasico {
    // Crea dias
    private int dia;
    // Crea mes
    private int mes;
    // Crea año
    private int año;

    /**
     * Constructor de fecha
     */
    public CalendarioBasico() {
        dia = 1;
        mes = 1;
        año = 1;
    }
    
    /**
     * Devuelve la fecha actual
     */
    public String obtenerFecha(){
        return (dia + "-" + mes + "-" + año);
    }
    
    /**
     * Modifica la fecha a la descrita
     */
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAño){
        dia = nuevoDia;
        mes = nuevoMes;
        año = nuevoAño;
    }
    
    /**
     * Avanza un día en la fecha
     */
    public void avanzarFecha(){
        if (dia <= 30){
            dia = dia + 1;
        }
        if (dia == 31){
            dia = 1;
            mes = mes +1;
        }
        if (mes == 13){
            año = año +1;
            mes = 1;
        }
        if (año == 100){
            año = 1;
        }
    }
}
package Cuentas;

/**
 * @author Alberto Sanchez Dominguez
 * @version 12.6
 */

public class CCuenta {

  /**
   * Se declaran las variables
   * @param nombre Hacer referencia al nombre del propietario de la cuenta bancaria.
   * @param cuenta Hace referencia a la cuenta bancaria en si misma.
   * @param saldo Hace referencia al saldo de la cuenta.
   * @param tipoInteres Hacer referencia al tipo de interes generado por la cuenta.
   */ 
    
    private String nombre; 
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    // Constructuor por defecto.
    
    public CCuenta()
    {
    }
    
    // Se declara el constructor con los parametros que incorporara la cuenta.
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }
    
/**
 * A traves de este método Ingresar se podrá ingresar dinero en la cuenta exceptuando cuando la cantidad sea menor que cero. En ese caso mostrara
 * por pantalla un mensaje de error. Si la cantidad a ingresar es correcta, el metodo fijara el nuevo saldo de la cuenta.
 */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

 /**
 * A traves de este método Retirar se podrá retirar dinero en la cuenta exceptuando cuando la cantidad sea menor o igual que cero. En ese caso mostrara
 * por pantalla un mensaje de error. Si la cantidad a retirar es correcta, el metodo fijara el nuevo saldo de la cuenta.
 */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    // METODOS GET Y SET 
    
     /**
     * @return Devuelve el nombre del propietario de la cuenta.
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Fija el nuevo nombre del propeitario de la cuenta.
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Devuelve el numero/nombre de cuenta.
     */
    
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Fija un nuevo numero/nombre para la cuenta.
     */
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return Devuelve el saldo de la cuenta.
     */
    
    public double getSaldo() {
        return saldo;
    }

    /**
     * Fija un nuevo saldo para la cuenta.
     */
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return Devuelve el tipo de interes.
     */
    
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Fija un nuevo tipo de interes para la cuenta bancaria.
     */
    
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

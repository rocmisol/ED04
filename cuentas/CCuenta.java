package cuentas;
/**
 * 
 * @author Rocío Prieto
 * @version 01
 * @since 29/01/2023
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * 
     */
    public CCuenta()
    {
    }
    /**
     * 
     * Método constructor CCuenta
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Método estado
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método ingresar
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método retirar
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * @return the nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the saldo
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the tipoInterés
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInterés the tipoInterés to set
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}

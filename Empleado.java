/*

 */
package Back_end;

import java.util.Date;

/*
 */
public abstract class Empleado extends Persona {
    private double salario;
    private int idunico; // Identificador primario
    private String puesto;

    public Empleado() {
    }

    public Empleado(double salario, int idunico, String puesto, String curp, String nombre, String apellido, String ide, Date ingreso, String imagen, String estado) {
        super(curp, nombre, apellido, ide, ingreso, imagen, estado);
        this.salario = salario;
        this.idunico = idunico;
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
         if (salario < 0) {
        throw new IllegalArgumentException("El salario no puede ser negativo.");
    }
        this.salario = salario;
    }

    public int getIdunico() {
        return idunico;
    }

    public void setIdunico(int idunico) {
         if (idunico < 0) {
        throw new IllegalArgumentException("El identificador debe ser mayor a 0.");
    }
        this.idunico = idunico;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto == null || puesto.trim().isEmpty()) {
        throw new IllegalArgumentException("El puesto es obligatorio.");
        }
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "salario=" + salario + ", idunico=" + idunico + ", puesto=" + puesto + '}';
    }

    
    
    
    
    
    
    
    
}

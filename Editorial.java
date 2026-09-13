/*
 
 */
package Back_end;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Editorial {
    private String idnombre; //identificador principal
    private int numerotel;
    private String direccion;
    private String imagen;
    private String estado;

    public Editorial() {
    }

    public Editorial(String idnombre, int numerotel, String direccion, String imagen, String estado) {
        this.idnombre = idnombre;
        this.numerotel = numerotel;
        this.direccion = direccion;
        this.imagen = imagen;
        this.estado = estado;
    }

    public String getIdnombre() {
        return idnombre;
    }

    public void setIdnombre(String idnombre) {
        if (idnombre == null || idnombre.trim().isEmpty()) {
        throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        this.idnombre = idnombre;
    }

   

    public int getNumerotel() {
        return numerotel;
    }

    public void setNumerotel(int numerotel) {
        if(numerotel <= 0){
            throw new IllegalArgumentException ("Numero de telefono invalido");
        }
        this.numerotel = numerotel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
        throw new IllegalArgumentException("La direccion es obligatoria.");
        }
        this.direccion = direccion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.idnombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Editorial other = (Editorial) obj;
        return Objects.equals(this.idnombre, other.idnombre);
    }

    @Override
    public String toString() {
        return "Editorial{" + "idnombre=" + idnombre + ", numerotel=" + numerotel + ", direccion=" + direccion + ", imagen=" + imagen + ", estado=" + estado + '}';
    }

    
    
    
    
}

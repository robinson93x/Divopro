
package divopro.dto;

/**
 *
 * @author Robinson
 */
public class TipoUsuarioDTO {
    
    private int id_tipo_usuario;
    private String nombre_tipo_usuario;

    public TipoUsuarioDTO() {
    }

    public TipoUsuarioDTO(int id_tipo_usuario, String nombre_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
        this.nombre_tipo_usuario = nombre_tipo_usuario;
    }

    public int getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(int id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public String getNombre_tipo_usuario() {
        return nombre_tipo_usuario;
    }

    public void setNombre_tipo_usuario(String nombre_tipo_usuario) {
        this.nombre_tipo_usuario = nombre_tipo_usuario;
    }

    @Override
    public String toString() {
        return "TipoUsuarioDTO{" + "id_tipo_usuario=" + id_tipo_usuario + ", nombre_tipo_usuario=" + nombre_tipo_usuario + '}';
    }
    

}

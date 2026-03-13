import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;

    private String especialidad;

    private Departamento departamento;

    private List<Modulo> listaModulos = new ArrayList<Modulo> ();

    private Departamento esJefe;

    public List<Modulo> getListaModulos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulos;
    }

    public void setListaModulos(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulos = value;
    }

    public Departamento getDepartamento() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.departamento;
    }

    public void setDepartamento(final Departamento value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.departamento = value;
    }

}

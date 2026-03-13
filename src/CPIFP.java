import java.util.ArrayList;
import java.util.List;

public class CPIFP {
    private String nombre;

    private String direccion;

    private int telefono;

    private List<Departamento> listaDepartamentos = new ArrayList<Departamento> ();

    private List<Estudiante> listaEstudiante = new ArrayList<Estudiante> ();

    public void añadirEstudiante(final Estudiante estudiante) {
    }

    public void quitarEstudiante(final Estudiante estudiante) {
    }

    public void añadirDepartamento(final Departamento departamento) {
    }

    public void quitarDepartamento(final Departamento departamento) {
    }

    public Estudiante obtenerEstudiante(final String identificador) {
        // TODO Auto-generated return
        return null;
    }

    public Departamento obtenerDepartamento(final String nombre) {
        // TODO Auto-generated return
        return null;
    }

    public List<Estudiante> obtenerListadoEstudiante() {
        // TODO Auto-generated return
        return null;
    }

    public List<Departamento> obtenerListadoDepartamento() {
        // TODO Auto-generated return
        return null;
    }

    public List<Departamento> getListaDepartamentos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaDepartamentos;
    }

    public void setListaDepartamentos(final List<Departamento> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaDepartamentos = value;
    }

}

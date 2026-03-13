import java.util.ArrayList;
import java.util.List;

public class Modulo {
    private String nombre;

    private String identificador;

    private List<Profesor> listaProfesores = new ArrayList<Profesor> ();

    private Departamento departamento;

    private List<Estudiante> listaEstudiante = new ArrayList<Estudiante> ();

    public Departamento getListaDepartamento() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.departamento;
    }

    public void setListaDepartamento(final Departamento value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.departamento = value;
    }

    public List<Profesor> getListaProfesores() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaProfesores;
    }

    public void setListaProfesores(final List<Profesor> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaProfesores = value;
    }

}

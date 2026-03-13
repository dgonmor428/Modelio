import java.util.ArrayList;
import java.util.List;
public class Departamento {
    private String nombre;

    private List<Modulo> listaModulo = new ArrayList<Modulo> ();

    private List<Profesor> listaProfesores = new ArrayList<Profesor> ();

    private Profesor jefe;

    private List<CPIFP> cpifp;

    public void añadirProfesor(final Profesor profesor) {
    }

    public void quitarProfesor(final Profesor profesor) {
    }

    public Profesor obtenerListaProfesor() {
        // TODO Auto-generated return
        return null;
    }

    public Profesor obtenerProfesor(final String nombre) {
        // TODO Auto-generated return
        return null;
    }

    public List<Modulo> getListaModulo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulo;
    }

    public void setListaModulo(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulo = value;
    }

    public Profesor getJefe() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.jefe;
    }

    public void setJefe(final Profesor value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.jefe = value;
    }

    public List<CPIFP> getCpifp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.cpifp;
    }

    public void setCpifp(final List<CPIFP> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.cpifp = value;
    }

}

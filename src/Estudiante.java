import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;

    private String identificador;

    private List<Modulo> listaModulo = new ArrayList<Modulo> ();

    private CPIFP cpifp;

    public CPIFP getCpifp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.cpifp;
    }

    public void setCpifp(final CPIFP value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.cpifp = value;
    }

    public List<Modulo> getListaModulo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulo;
    }

    public void setListaModulo(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulo = value;
    }

}

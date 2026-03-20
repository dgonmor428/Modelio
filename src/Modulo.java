import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ae7ba2aa-e8bb-4aa0-ae46-48bf941e913a")
public class Modulo {
    @objid ("0358a641-2b07-47c2-a087-832b721f0489")
    private String nombre;

    @objid ("2cd89921-b0dc-49dc-9dc3-913814a970e8")
    private String identificador;

    @objid ("5c509d48-7d33-4ab1-88f7-484d182eb53f")
    private List<Profesor> listaProfesores = new ArrayList<Profesor> ();

    @objid ("0c945dec-fa61-460f-b85b-9d4e45982f2b")
    private Departamento listaDepartamento;

    @objid ("f652fe4d-30b8-424f-99b0-e6d3d0602b9b")
    private List<Estudiante> listaEstudiante = new ArrayList<Estudiante> ();

    @objid ("8332fb3d-6a50-448e-8ca7-4bf07d4c29bb")
    public Departamento getListaDepartamento() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaDepartamento;
    }

    @objid ("77012f19-25ae-4776-84ea-c3ada533dae8")
    public void setListaDepartamento(final Departamento value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaDepartamento = value;
    }

    @objid ("7bcc0989-945d-4fd6-9c56-10e5f12b2dc6")
    public List<Profesor> getListaProfesores() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaProfesores;
    }

    @objid ("8e3ca162-2201-4f2d-b11b-5356cd133799")
    public void setListaProfesores(final List<Profesor> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaProfesores = value;
    }

}

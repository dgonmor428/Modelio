import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("174791ce-5610-473c-beeb-e91d5b709f44")
public class CPIFP {
    @objid ("9ae3122a-a565-4587-865b-26293ab27219")
    private String nombre;

    @objid ("d1ef16f3-1add-43ba-92c9-4ca01191057a")
    private String direccion;

    @objid ("15106ffb-09a7-4b86-892b-02c18125816e")
    private String telefono;

    @objid ("88c0186d-70ae-42ea-aa1a-4bdbb9269b76")
    private List<Departamento> listaDepartamentos = new ArrayList<Departamento> ();

    @objid ("891aa760-6042-4ad4-bbfa-412ab37aadb1")
    private List<Estudiante> listaEstudiante = new ArrayList<Estudiante> ();

    @objid ("e55ead7c-88ea-4fb6-acba-dd68376d6ef2")
    public void añadirEstudiante(final Estudiante estudiante) {
        this.listaEstudiante.add(estudiante);
    }

    @objid ("d09a342d-2c72-46be-b684-8de71ed954cd")
    public void quitarEstudiante(final Estudiante estudiante) {
        this.listaEstudiante.remove(estudiante);
    }

    @objid ("137eec3b-47dd-422e-962b-96c74cfd7d4d")
    public void añadirDepartamento(final Departamento departamento) {
        this.listaDepartamentos.add(departamento);
    }

    @objid ("d9d48ca3-90e8-4c97-8640-e5400a68b943")
    public void quitarDepartamento(final Departamento departamento) {
        this.listaDepartamentos.remove(departamento);
    }

    @objid ("22d03fe3-9979-452b-ae87-414e6e1d7245")
    public Estudiante obtenerEstudiante(final String identificador) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("7ee55ac9-6247-4fbf-b922-7dc2d80a8ce3")
    public Departamento obtenerDepartamento(final String nombre) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("20ed8ffe-364b-4ad6-b7e2-4e0e1cb599e9")
    public List<Estudiante> obtenerListadoEstudiante() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("0922d1c3-c683-4670-82d4-f68767369a4a")
    public List<Departamento> obtenerListadoDepartamento() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("3825539d-4a91-4540-be02-04fccb6a42c7")
    public List<Departamento> getListaDepartamentos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaDepartamentos;
    }

    @objid ("813e6d08-2058-457f-a2eb-d37c1380487a")
    public void setListaDepartamentos(final List<Departamento> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaDepartamentos = value;
    }

    @objid ("0aecfc06-d182-44b3-8fd4-af3418adb16d")
    public String getTelefono() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.telefono;
    }

    @objid ("09940c0b-a1cd-4a20-bc25-2971dbbebd70")
    public void setTelefono(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.telefono = value;
    }

    @objid ("1e45322f-006d-4527-8a07-408cfdeef33d")
    public CPIFP(final String nombre, final String telefono, final String direccion) {
    }

}

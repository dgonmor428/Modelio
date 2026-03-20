import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0b0a276e-429e-48a9-89c8-5e828ec622e8")
public class Estudiante {
    @objid ("e4da36fa-255c-4d48-a983-4c434ae231cc")
    private String nombre;

    @objid ("d98f6054-81b7-45e4-a80d-75435ae05329")
    private String identificador;

    @objid ("7ca3988a-4f0f-44c8-9e81-0f5e456bc946")
    private List<Modulo> listaModulo = new ArrayList<Modulo> ();

    @objid ("5e693528-a957-446e-b553-73e0e1912260")
    private CPIFP cpifp;

    @objid ("cd534d2e-0e8f-4aa7-b006-06e14f4b5535")
    public CPIFP getCpifp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.cpifp;
    }

    @objid ("5ca5bf90-4e61-4b95-a6f7-1c7ac50dd1cd")
    public void setCpifp(final CPIFP value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.cpifp = value;
    }

    @objid ("31f32aaa-cc50-47f7-b391-e709434f1f72")
    public List<Modulo> getListaModulo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulo;
    }

    @objid ("d7feb66d-4db8-43e2-85cd-fc37bb68da31")
    public void setListaModulo(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulo = value;
    }

    @objid ("42ee1d7c-7e64-43fa-ba38-f2eab142ba6b")
    public Estudiante(final String nombre, final String identificador) {
    }

}

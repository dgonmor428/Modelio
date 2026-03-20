import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("085c54bf-2133-454b-98e6-46cc75709839")
public class Profesor {
    @objid ("cd5a0a28-7426-46fa-acac-ebe6fe400db2")
    private String nombre;

    @objid ("483997ea-83a2-4093-8357-9f1827af824e")
    private String especialidad;

    @objid ("d86fe48a-4ce7-4740-bdf7-1111f2ba8652")
    private Departamento departamento;

    @objid ("40ebd126-2b21-4a1e-b868-1ef9a3121b74")
    private List<Modulo> listaModulos = new ArrayList<Modulo> ();

    @objid ("f08c9656-2a49-49fe-8080-c08aa6654cf8")
    private Departamento esJefe;

    @objid ("22fe2317-d797-4647-a311-38411be7096a")
    public List<Modulo> getListaModulos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulos;
    }

    @objid ("fc92cd7a-4ab9-41f3-9706-3f915ffc16d5")
    public void setListaModulos(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulos = value;
    }

    @objid ("9d3e7439-116a-4bb3-86e2-c506e4964aa1")
    public Departamento getDepartamento() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.departamento;
    }

    @objid ("cb717702-0ad3-4522-9f4f-f2b3aaae947e")
    public void setDepartamento(final Departamento value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.departamento = value;
    }

}

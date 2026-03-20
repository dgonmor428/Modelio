import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("53129481-083b-4a97-9bf1-0e832b2d2558")
public class Departamento {
    @objid ("ffbe2332-3854-4b89-944c-de79e31f82e7")
    private String nombre;

    @objid ("24152eac-b489-4534-9553-833837661ff7")
    private List<Modulo> listaModulo = new ArrayList<Modulo> ();

    @objid ("e53e7b9d-ecfb-47fa-8e6d-e24fe0259b28")
    private List<Profesor> listaProfesores = new ArrayList<Profesor> ();

    @objid ("4ea43b63-2d6e-45db-963c-5bc2d8f80b80")
    private Profesor jefe;

    @objid ("aad76d4c-ebd8-478b-883d-708245099871")
    private List<CPIFP> cpifp = new ArrayList<CPIFP> ();

    @objid ("396d9155-478a-4041-ba64-a8058d5e4ed5")
    public void añadirProfesor(final Profesor profesor) {
    }

    @objid ("dfb18669-1e18-4b7b-8b9e-bcf43bfec7b1")
    public void quitarProfesor(final Profesor profesor) {
    }

    @objid ("4e144c78-03b6-45cd-93b1-b3af9a0f2117")
    public Profesor obtenerListaProfesor() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("2e1d27a9-cae8-42d6-95a5-6b8c7bbc1f71")
    public Profesor obtenerProfesor(final String nombre) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("b142c712-0391-48dc-97aa-073ec9237695")
    public List<Modulo> getListaModulo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulo;
    }

    @objid ("9cb8a464-8579-41df-a953-320df40e86c6")
    public void setListaModulo(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulo = value;
    }

    @objid ("f9eaae45-eabc-400c-a730-e3a930f91b53")
    public Profesor getJefe() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.jefe;
    }

    @objid ("13424c46-35a6-49dd-bf55-b37e0acf149c")
    public void setJefe(final Profesor value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.jefe = value;
    }

    @objid ("2e57da53-0da8-43da-aafa-23c26719a0d8")
    public List<CPIFP> getCpifp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.cpifp;
    }

    @objid ("bdd868c3-a6ca-4f0b-b8d7-06986bbcb74e")
    public void setCpifp(final List<CPIFP> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.cpifp = value;
    }

    @objid ("0c2ddfb1-f46f-4daa-a62e-c52d4bdc7780")
    public Departamento(final String nombre) {
    }

}

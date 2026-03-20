public class App {
    public static void main(String[] args) {
        CPIFP cpifp = new CPIFP("Alan Turing", "652254568", "Calle Fictica 13");

        Estudiante estudiante = new Estudiante("David", "AB24131");
        Estudiante estudiante2 = new Estudiante("Ana", "AB24132");
        Estudiante estudiante3 = new Estudiante("Aarón", "AB24133");

        cpifp.añadirEstudiante(estudiante);
        cpifp.añadirEstudiante(estudiante2);
        cpifp.añadirEstudiante(estudiante3);

        Departamento departamento = new Departamento("Departamento 1");
        Departamento departamento2 = new Departamento("Departamento 2");
        
        cpifp.añadirDepartamento(departamento);
        cpifp.añadirDepartamento(departamento2);
    }


}

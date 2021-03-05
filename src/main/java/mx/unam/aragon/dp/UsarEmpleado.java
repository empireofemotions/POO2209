
package mx.unam.aragon.dp;

public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1=new Empleado (1, "Sistemas", 45000.0f, 15);
        emp1.setNombre("Eduardo");
        emp1.setApPaterno("Pérez");
        emp1.setApMaterno("Estrada");
        emp1.setEdad(18);
        emp1.setCurp ("PEEE020715HDFRSDA0");
        
        System.out.println ( "info" + emp1 );
    }
}

package dsa;
import org.junit.Assert;
import org.junit.Before;

public class Test {
    Controlador controlador=new Controlador();
    @org.junit.Before
    public  void inicialización(){
        Assert.assertEquals(true,controlador.Registrar("masmi","masmi","mi_correo"));
        Assert.assertEquals("masmi",controlador.);
    }
    @org.junit.Test
    public void añadir(){
        Eetacemon e=new Eetacemon();
        controlador.Añadir();
    }
    @org.junit.Test
    public void borrar(){}
    @org.junit.Test
    public void buscar(){}
    @org.junit.Test
    public void listar(){}
    public static void main(String[] args) {
    }
}

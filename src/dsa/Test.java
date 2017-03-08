package dsa;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public class Test {
    Controlador controlador=new Controlador();
    Eetacemon e=new Eetacemon();
    List<Eetacemon>h=new ArrayList<Eetacemon>();
    @org.junit.Before
    /*public  void inicialización(){
        Assert.assertEquals(true,controlador.Registrar("masmi","masmi","mi_correo"));
        Assert.assertEquals("masmi",controlador.);
    }*/
    @org.junit.Test
    public void añadir(){
        e.nombre="Masmi";
        e.Lvl=1;
        e.id=0;
        Assert.assertEquals(true,controlador.Añadir(e));
    }
    @org.junit.Test
    public void buscar(){
        h.add(e);
        Assert.assertEquals(h,controlador.buscar("as"));
    }
    @org.junit.Test
    public void listar(){

        Assert.assertEquals(h,controlador.listar());
    }
    @org.junit.Test
    public void borrar(){
        Assert.assertEquals( true,controlador.Borrar(0));
    }
}

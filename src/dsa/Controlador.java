package dsa;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
public class Controlador {
    private Dictionary<Integer, Eetacemon> pokedex =new Hashtable();
    private Integer identificador=0;
    private Usuario yo;
    public  boolean Registrar(String nombre,String pass,String mail){
        try{yo=new Usuario(nombre,pass,mail);
            return true;}
        catch (Exception e){
        return false;}
    }
    public boolean Añadir (Eetacemon e)
    {
        e.id=identificador;

        if(pokedex.put(identificador,e)==null){
            identificador++;
            return true;
        }
        else
            return false;
    }
    public boolean Borrar (Integer i)
    {
        if(pokedex.remove(i)!=null){
            identificador--;
            return true;
        }
        else
            return false;
    }
    public List<Eetacemon> listar()
    {
        List<Eetacemon> e=new ArrayList<Eetacemon>();
        for (int i = 0; i< pokedex.size(); i++){
            e.add(pokedex.get(i));
        }
        return e;

    }
    public List<Eetacemon> buscar(String s)
    {
        List<Eetacemon> f=new ArrayList<>();
        Eetacemon e =new Eetacemon();
        for(int i = 0; i< pokedex.size(); i++)
        {
            e= pokedex.get(i);
            if(e.nombre.contains(s))
                f.add(e);
        }
        return f;
    }

}



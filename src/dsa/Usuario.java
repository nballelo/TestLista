package dsa;

/**
 * Created by Ignacio on 03/03/2017.
 */
public class Usuario {
    private String nombre;
    private String pass;
    private String mail;
    public Usuario (String nombre,String pass,String mail){
        this.nombre=nombre;
        this.pass=pass;
        this.mail=mail;
    }
    public void getnombre(String s)
    {
        nombre=s;
    }
    public void getpass(String s)
    {
        pass=s;
    }
    public void getmail(String s) {mail = s;}
    public String setnombre(){return nombre;}
    public String setpass(){return pass;}
    public String setmail(){return mail;}
}



public class Zombie
{
    private String nombre;
    private int salud;
    private int nacimiento;
    private String sangre;
    
    public Zombie()
    {
        
    }
    public Zombie(String nom, String san, int nac, int sal)
    {
        this.salud= sal;
        this.nacimiento= nac;
        this.sangre= san;
        this.nombre= nom;
    }
    
    public int getSalud()
    {
        return this.salud;
    }    
    public int getNacimiento()
    {
        return this.nacimiento;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getSangre()
    {
        return this.sangre;
    }

    public void setNacimiento(int nac)
    {
        this.nacimiento=nac;
    }
    public void setSalud(int sal)
    {
        this.salud=sal;
    }
    public void setNombre(String nom)
    {
        this.nombre=nom;
    }
    public void setSangre(String san)
    {
        this.sangre=san;
    }
    public void splitSalud()
    {
        this.salud=this.salud/2;
    }
}

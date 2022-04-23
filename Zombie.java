
public class Zombie
{
    private String nombreZ;
    private int salud;
    private int nacimiento;
    private String sangre;
    
    public Zombie()
    {
        
    }
    public Zombie(String nomz, String san, int nac, int sal)
    {
        this.salud= sal;
        this.nacimiento= nac;
        this.sangre= san;
        this.nombreZ= nomz;
    }
    
    public int getSalud()
    {
        return this.salud;
    }    
    public int getNacimiento()
    {
        return this.nacimiento;
    }
    public String getNombreZ()
    {
        return this.nombreZ;
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
    public void setNombre(String nomz)
    {
        this.nombreZ=nomz;
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

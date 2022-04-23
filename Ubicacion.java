public class Ubicacion
{
    private String nombreU;
    private int cantidadZ;
    private float distancia;
    
    
    public Ubicacion()
    {
        
    }
    public Ubicacion(String nom, float dist, int can)
    {
        this.cantidadZ= can;
        this.distancia=dist;
        this.nombreU= nom;
    }
    
    
    public int getCantidad()
    {
        return this.cantidadZ;
    }    
    public float getDistancia()
    {
        return this.distancia;
    }
    public String getNombre()
    {
        return this.nombreU;
    }
    public void setNombre(String nom)
    {
        this.nombreU=nom;
    }
    public void setNombre(int can)
    {
        this.cantidadZ=can;
    }    
    public void setDistancia(float dist)
    {
        this.distancia=dist;
    }    

    
}
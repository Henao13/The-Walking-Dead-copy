public class Ubicacion
{
    private String nombre;
    private int cantidadZ;
    private float distancia;
    
    
    public Ubicacion()
    {
        
    }
    public Ubicacion(String nom, float dist, int can)
    {
        this.cantidadZ= can;
        this.distancia=dist;
        this.nombre= nom;
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
        return this.nombre;
    }
    public void setNombre(String nom)
    {
        this.nombre=nom;
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
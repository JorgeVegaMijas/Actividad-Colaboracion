public abstract class Poligono {
    
    int nLados;
    
    //Constructor
    public Poligono(int nLados){
        this.nLados=nLados;
    }

    
    //get y set para la variable nLados
    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }
    
    
    //Metodos abstractos
    public abstract float getArea();
    public abstract float getPerimetro();
    
}

public class Pentagono {
    
    private double lado;
    private double radio;
    private double apotema;


    public Pentagono(double lado, double radio, double apotema) {
        this.lado = lado;
        this.radio = radio;
        this.apotema = apotema;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }  
    
    //TO-DO
    @Override
    public void area() {
        
    }
      
}


package circulito;


public class Circulito {

 
    private double centrox;
    private double centroy;
    private double radio;

    public Circulito() {
    }

    public Circulito(double centrox, double centroy, double radio) {
        this.centrox = centrox;
        this.centroy = centroy;
        this.radio = radio;
    }

    public double getCentrox() {
        return centrox;
    }

    public void setCentrox(double centrox) {
        this.centrox = centrox;
    }

    public double getCentroy() {
        return centroy;
    }

    public void setCentroy(double centroy) {
        this.centroy = centroy;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulito{" + "centrox=" + centrox + ", centroy=" + centroy + ", radio=" + radio + '}';
    }
    public double perimetroCirculo(){
        double perimetro;
        perimetro = 2*Math.PI*this.radio;
        return perimetro;
        
    }
            
     public double areCirculo(){
         double area;
         area = Math.PI*this.radio*this.radio;
         return area;
     }
     public void moverCirculo(double deltax, double deltay){
         this.centrox = deltax;
         this.centroy = deltay;
     }
     public void escalaCirculo(double s){
        this.radio = this.radio*s;
     }
    
}
    

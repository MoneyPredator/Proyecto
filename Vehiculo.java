public class Vehiculo{

//Atributos
  private int modelo;
  private String marca;
  private double valorComercial;
  private String color;
  
  public static Vehiculo[] vehiculos = new Vehiculo[10];
  public static int tamano = 10;
  public static int posAnadir = 0;
// Constructores
  public Vehiculo(){
    
  }
  public Vehiculo(int mo, String ma, double va){
    this(mo,ma,va,"verde");
  }
 public Vehiculo(int mo, String ma, double va, String co){
 this.modelo =mo;
 this.marca =ma;
 this.valorComercial =va;
 this.color =co;
 }
   
public void setModelo(int n){
  this.modelo = n;
}
public int getModelo(){
  return this.modelo;
}

  public void setMarca(String n){
    this.marca = n;
  }
  public String getMarca(){
    return this.marca;
  }
  public void setValorComercial(double n){
    this.valorComercial = n;
  }
  public double getValorComercial(){
    return this.valorComercial;
  }
  public void setColor(String n){
    this.color = n;
  }
  public String getColor(){
    return this.color;
  }

  //Convierte los atributos que se ingresen en un String.
  @Override
  public String toString(){
    return "El modelo del auto es " + modelo + ", es de marca " + marca + ", su valor comercial es de " + valorComercial + ", y es de color " + color + ".\n";
  }

  //Guarda lo que salga del metodo toString 
  public static String toStringVehiculos(){
    String base = "";
    for(int i = 0; i < vehiculos.length; i++){
      if (vehiculos[i] != null) {
          base += "#"+(i+1)+". " + vehiculos[i].toString();    
      }
    }
    return base;
  }
public static int cantidadVehiculos(){
  return posAnadir;
}
  
}
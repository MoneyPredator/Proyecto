public class Sensor {
  // Atributos
  private String tipo;
  private double valor;

  public static Sensor[] sensores = new Sensor[8];
  public static int tamano = 8;
  public static int posAnadir = 0;

  // Constructores
  public Sensor() {

  }
  
  public Sensor(String t, double v) {
    this.tipo = t;
    this.valor = v;

  }

  public void setTipo(String t) {
    this.tipo = t;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setValor(double v) {
    this.valor = v;
  }

  public double getValor(){
    return this.valor;
  }

  @Override
  public String toString() {
    return "El tipo de sensor es " + this.tipo + ", su valor es " + this.valor + ". \n";
  }

  public static String toStringSensores(){
    String base = "";
    for(int i = 0; i < sensores.length; i++){
      if (sensores[i] != null) {
          base += "# "+(i+1)+". " + sensores[i].toString();    
      }
    }
    return base;
  }
  
  public static int cantidadSensores(){
  return posAnadir;
  }

  public static String ordenarSensores () {
    Sensor[] dex = Sensor.sensores;
    String texto = "";
    
    for (int i = 0; i < Sensor.cantidadSensores(); i++) {
      for (int j = i + 1; j < Sensor.cantidadSensores(); j++) {
        Sensor aux = Sensor.sensores[i];
        if (Sensor.sensores[i].getValor() > Sensor.sensores[j].getValor()) {
          dex[i] = Sensor.sensores[j];
          dex[j] = aux;
        }
      }
    }

    int contador = 1;
    for (int i = 0; i < dex.length; i++) {
      if (dex[i] == null) {
        break;
      }
      Sensor sensorActual = dex[i];
      if (sensorActual.getTipo().equals("temperatura")) {
        texto += "#" + contador +" "+ sensorActual.toString() + "\n";
        contador++;
      }
    }
    
    return texto;
  }
  
}
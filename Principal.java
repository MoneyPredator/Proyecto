import java.util.Scanner;
class Principal{
  public static void main(String[] args) {
    Principal.mostrarMenu();
  }

    public static void mostrarMenu(){
        System.out.println("//////////Welcome to Los Carros Hermanos Family//////////"+"\n");
        System.out.println("//////////Vehiculos//////////");
        System.out.println("Ingrese el numero '0' para cerrar el programa."+"\n");
        System.out.println("Ingrese el numero '1' para crear un vehiculo"+"\n");
        System.out.println("Ingrese el numero '2' para ver toda la informacion de los vehiculos."+"\n");
        System.out.println("Ingrese el numero '3' para ver la cantidad de vehiculos creados hasta ahora."+"\n");
        System.out.println("Ingrese el numero '4' para ver la informacion de los vehiculos color verde."+"\n");
        System.out.println("Ingrese el numero '5' para ver la informacion de todos los vehiculos que se encuentran entre los modelo 2000 - 2021."+"\n");
        System.out.println("//////////Sensores//////////");
        System.out.println("Ingrese el numero '6' para crear un sensor."+"\n");
        System.out.println("Ingrese el numero '7' para ver la informacion de todos los sensores."+"\n");
        System.out.println("Ingrese el numero '8' para ver la cantidad de los sensores creados."+"\n");
        System.out.println("Ingrese el numero '9' para ver los sensores de tipo 'temperatura'."+"\n");
        System.out.println("Ingrese el numero '666' para ver los sensores de tipo 'temperatura' ordenados por valor."+"\n");
        Scanner scan = new Scanner(System.in);
        while(true){
            int scaned = scan.nextInt();
               if(scaned == 0){
               System.out.println("Good Bye.");
               break;
              }
              
              // opcion 1 -----------------------------
              else if(scaned == 1){
                
              if (Vehiculo.posAnadir >= Vehiculo.tamano) {
                  System.out.println("Error, base de datos llena.");
                  continue;
              }
                
              System.out.println("Ingrese el modelo, la marca, su valor comercial y el color. En su respectivo orden.");
              int modelo = scan.nextInt();
              String marca = scan.next();
              double valorComercial = scan.nextDouble();
              String color = scan.next();
    
              for(int i = 0; i < Vehiculo.tamano; i++){

                if(Vehiculo.vehiculos[i] == null && Vehiculo.posAnadir <= Vehiculo.tamano){
                  Vehiculo.vehiculos[i] = new Vehiculo(modelo, marca, valorComercial, color);
                  Vehiculo.posAnadir++;
                  break;
                }
                }
                System.out.println("Vehiculo creado!.");
              }
        
    
            // opcion 2 -----------------------------  
            
            else if(scaned == 2){
              if (Vehiculo.cantidadVehiculos() < 1) {
                System.out.println("No existen vehiculos a mostrar");
                continue;
              }
              System.out.println(Vehiculo.toStringVehiculos());
            }
              
            // opcion 3 -----------------------------
            else if(scaned == 3){
              System.out.println("hay " + Vehiculo.cantidadVehiculos()+ " vehiculo(s)");
            }
    
            // opcion 4 -----------------------------          
            else if(scaned == 4){
              int contador = 1;
              if(Vehiculo.cantidadVehiculos() == 0){
                System.out.println("No hay ningun vehiculo creado.");}
  
              for (int i = 0; i < Vehiculo.cantidadVehiculos(); i++) {
                  Vehiculo vehiculoActual = Vehiculo.vehiculos[i];
                  
                  if (vehiculoActual.getColor().equals("verde")) {
                      System.out.println("#" + contador +" "+ vehiculoActual.toString());
                      contador++;
                  }
              }
            }
    
            // opcion 5 -----------------------------  
            else if(scaned == 5){
              if(Vehiculo.cantidadVehiculos() == 0){
                System.out.println("No hay ningun vehiculo creado.");}
              int contador = 1;
              for (int i = 0; i < Vehiculo.cantidadVehiculos(); i++) {
                  Vehiculo vehiculoActual = Vehiculo.vehiculos[i];
                  
                  if (vehiculoActual.getModelo() >= 2000 && vehiculoActual.getModelo() <= 2021) {
                      System.out.println("#" + contador + " " + vehiculoActual.toString());
                      contador++;
                  }
              }
                
            }
            // opcion 6 -----------------------------            
            else if(scaned == 6){
              if (Sensor.cantidadSensores() >= Sensor.tamano) {
                  System.out.println("Error, base de datos llena.");
                  continue;
              }
               System.out.println("Ingrese el tipo de sensor y su valor. "); 
              String tipo = scan.next();
              double valor = scan.nextDouble();
    
              for(int i = 0; i < Sensor.tamano; i++){
                if(Sensor.sensores[i] == null){  
                  Sensor.sensores[i] = new Sensor(tipo, valor);
                  Sensor.posAnadir++;
                  break;
                }
              }
                System.out.println("Sensor creado!.");
            // opcion 7 -----------------------------            
            }else if(scaned == 7){
              System.out.println(Sensor.toStringSensores());
              
            // opcion 8 -----------------------------            
            }else if(scaned == 8){
              System.out.println("La cantidad de sensores creados son " + Sensor.cantidadSensores());
            // opcion 9 -----------------------------            
            }else if(scaned == 9){
              int contador = 1;
              for (int i = 0; i < Sensor.cantidadSensores(); i++) {
                  Sensor sensorActual = Sensor.sensores[i];
                  
                  if (sensorActual.getTipo().equals("temperatura")) {
                      System.out.println("#" + contador +" "+ sensorActual.toString());
                      contador++;
                  }
              }
            // opcion 666 -----------------------------            
            }else if(scaned == 666){
              System.out.println(Sensor.ordenarSensores());
            }
        }
   }

}

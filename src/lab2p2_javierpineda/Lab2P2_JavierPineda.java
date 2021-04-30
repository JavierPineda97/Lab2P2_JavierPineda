package lab2p2_javierpineda;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_JavierPineda {

    ArrayList Compus;
    
    private String Modelo;
    private int NumSerie;
    private int CapacidadDiscoDuro;
    private int TamPantalla;
    private String TipoProcesador;
    private String TarjetaGrafica;
    private String SistemaOperativo;
    private int TiempoDeFabricacion;
    private int CapacidadBateria;
    private int DuracionBateria;
    private boolean TipoTeclado;
    
    public Lab2P2_JavierPineda (String Modelo, int NumSerie, int CapacidadDiscoDuro, int TamPantalla, String TipoProcesador, 
                                String TarjetaGrafica, String SistemaOperativo, int TiempoDeFabricacion, int CapacidadBateria,
                                int DuracionBateria, boolean TipoTeclado){
        this.Modelo=Modelo;
        this.NumSerie=NumSerie;
        this.CapacidadDiscoDuro=CapacidadDiscoDuro;
        this.TamPantalla=TamPantalla;
        this.TipoProcesador=TipoProcesador;
        this.TarjetaGrafica=TarjetaGrafica;
        this.SistemaOperativo=SistemaOperativo;
        this.TiempoDeFabricacion=TiempoDeFabricacion;
        this.CapacidadBateria=CapacidadBateria;
        this.DuracionBateria=DuracionBateria;
        this.TipoTeclado=TipoTeclado;
    }

    public static void main(String[] args) {
    
        
       
    }
    
    //Menu de opciones
    public void menu(){
            Scanner teclado = new Scanner (System.in);
            int elija = 0;
            do {
                System.out.println("Computadoras Dell");
                System.out.println("1.Crear Computadora");
                System.out.println("2.Listar Computadora");
                System.out.println("3.Modificar Computadora");
                System.out.println("4.Eliminar Computadora");
                System.out.println("5.Salir");
                System.out.println("Elija de entrae las opciones listadas");
                elija = teclado.nextInt();
                switch (elija){
                    case 1:
                        CrearComputadora();
                        break;
                    case 2:
                        ListarComputadora();
                        break;
                    case 3:
                        ModificarComputadora();
                        break;
                    case 4:
                        EliminarComputadora();
                        break;
                    case 5:
                        Salir();
                        break;
                }
            } while (elija != 5);
        }
    
    //Crear Computadora
    public void CrearComputadora(){
        Scanner teclado = new Scanner (System.in);
        String TextoDesdeTeclado = teclado.next();
        Compus.add(TextoDesdeTeclado);
    }
    
    //Listar Computadora
    public void ListarComputadora(){
        Scanner teclado = new Scanner (System.in);
        for (int i=0; i<Compus.size(); i++){
            System.out.println(Compus.indexOf(Compus.get(i))+ " ->"+Compus.get(i));
        }
    }
    
    //Modificar Computadora
    public void ModificarComputadora(){
        Scanner teclado = new Scanner (System.in);
    }
    
    //Eliminar Computadora
    public void EliminarComputadora(){
        Scanner teclado = new Scanner (System.in);
        String TextoDesdeTeclado = teclado.next();
        Compus.remove(TextoDesdeTeclado);
    }
    
    //Salir
    public void Salir(){
        Scanner teclado = new Scanner (System.in);
        String TextoDesdeTeclado = teclado.next();
        System.out.println("Sesion Finalizada");
    }
}

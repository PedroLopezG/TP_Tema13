package Ejercicios;

public class Listener {
    public void listenV1(int ventanas){
        if (ventanas == 1){
            VentanaV1 ventana1 = new VentanaV1(1);
            ventana1.setLocation(100,100);
        } else if (ventanas == 2){
            VentanaV1 ventana1 = new VentanaV1(1);
            ventana1.setLocation(100,100);
            VentanaV1 ventana2 = new VentanaV1(2);
            ventana2.setLocation(300,100);
        } else if (ventanas == 3){
            VentanaV1 ventana1 = new VentanaV1(1);
            ventana1.setLocation(100,100);
            VentanaV1 ventana2 = new VentanaV1(2);
            ventana2.setLocation(300,100);
            VentanaV1 ventana3 = new VentanaV1(3);
            ventana3.setLocation(500,100);
        } else if (ventanas == 4){
            VentanaV1 ventana1 = new VentanaV1(1);
            ventana1.setLocation(100,100);
            VentanaV1 ventana2 = new VentanaV1(2);
            ventana2.setLocation(300,100);
            VentanaV1 ventana3 = new VentanaV1(3);
            ventana3.setLocation(500,100);
            VentanaV1 ventana4 = new VentanaV1(4);
            ventana4.setLocation(100,300);
        } else if (ventanas == 5){
            VentanaV1 ventana1 = new VentanaV1(1);
            ventana1.setLocation(100,100);
            VentanaV1 ventana2 = new VentanaV1(2);
            ventana2.setLocation(300,100);
            VentanaV1 ventana3 = new VentanaV1(3);
            ventana3.setLocation(500,100);
            VentanaV1 ventana4 = new VentanaV1(4);
            ventana4.setLocation(100,300);
            VentanaV1 ventana5 = new VentanaV1(5);
            ventana5.setLocation(300,300);
        } else if (ventanas == 6){
            VentanaV1 ventana1 = new VentanaV1(1);
            ventana1.setLocation(100,100);
            VentanaV1 ventana2 = new VentanaV1(2);
            ventana2.setLocation(300,100);
            VentanaV1 ventana3 = new VentanaV1(3);
            ventana3.setLocation(500,100);
            VentanaV1 ventana4 = new VentanaV1(4);
            ventana4.setLocation(100,300);
            VentanaV1 ventana5 = new VentanaV1(5);
            ventana5.setLocation(300,300);
            VentanaV1 ventana6 = new VentanaV1(6);
            ventana6.setLocation(500,300);
        }
        escuchando();
    }
    public void listenV2(int ventanas){
        if (ventanas == 1){
            VentanaV2 ventana1 = new VentanaV2(1);
            ventana1.setLocation(100,100);
        } else if (ventanas == 2){
            VentanaV2 ventana1 = new VentanaV2(1);
            ventana1.setLocation(100,100);
            VentanaV2 ventana2 = new VentanaV2(2);
            ventana2.setLocation(300,100);
        } else if (ventanas == 3){
            VentanaV2 ventana1 = new VentanaV2(1);
            ventana1.setLocation(100,100);
            VentanaV2 ventana2 = new VentanaV2(2);
            ventana2.setLocation(300,100);
            VentanaV2 ventana3 = new VentanaV2(3);
            ventana3.setLocation(500,100);
        } else if (ventanas == 4){
            VentanaV2 ventana1 = new VentanaV2(1);
            ventana1.setLocation(100,100);
            VentanaV2 ventana2 = new VentanaV2(2);
            ventana2.setLocation(300,100);
            VentanaV2 ventana3 = new VentanaV2(3);
            ventana3.setLocation(500,100);
            VentanaV2 ventana4 = new VentanaV2(4);
            ventana4.setLocation(100,300);
        } else if (ventanas == 5){
            VentanaV2 ventana1 = new VentanaV2(1);
            ventana1.setLocation(100,100);
            VentanaV2 ventana2 = new VentanaV2(2);
            ventana2.setLocation(300,100);
            VentanaV2 ventana3 = new VentanaV2(3);
            ventana3.setLocation(500,100);
            VentanaV2 ventana4 = new VentanaV2(4);
            ventana4.setLocation(100,300);
            VentanaV2 ventana5 = new VentanaV2(5);
            ventana5.setLocation(300,300);
        } else if (ventanas == 6){
            VentanaV2 ventana1 = new VentanaV2(1);
            ventana1.setLocation(100,100);
            VentanaV2 ventana2 = new VentanaV2(2);
            ventana2.setLocation(300,100);
            VentanaV2 ventana3 = new VentanaV2(3);
            ventana3.setLocation(500,100);
            VentanaV2 ventana4 = new VentanaV2(4);
            ventana4.setLocation(100,300);
            VentanaV2 ventana5 = new VentanaV2(5);
            ventana5.setLocation(300,300);
            VentanaV2 ventana6 = new VentanaV2(6);
            ventana6.setLocation(500,300);
        }
        escuchando();
    }
    public void escuchando(){
        System.out.println("\nCierre cualquiera de las ventanas para terminar el proceso\n");
        System.out.println("Escuchando . . .\n");
    }
}

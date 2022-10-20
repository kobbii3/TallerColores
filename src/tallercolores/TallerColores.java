package tallercolores;

public class TallerColores {

    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        reloj.setHora("12:00pm");
        reloj.setColor("Azul");
        reloj.setRingtone("Motomami");
        reloj.setAlarma("3:00pm");
        
        //metodos
        reloj.CambiarHora();
        System.out.println(reloj.getHora());
    }
    
}

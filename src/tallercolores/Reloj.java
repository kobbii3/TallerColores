package tallercolores;

public class Reloj {
    String hora;
    String color;
    String ringtone;
    String alarma;

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRingtone() {
        return ringtone;
    }

    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
    }

    public String getAlarma() {
        return alarma;
    }

    public void setAlarma(String alarma) {
        this.alarma = alarma;
    }
    
    public void CambiarHora(){
        this.hora = "2:00pm";
    }
    
    public void CambiarColor(){
        this.color = "Rojo";
    }
    
    public void DescartarAlarma(){
        this.alarma = "No hay una alarma programada.";
    }
    
}

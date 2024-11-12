package ar.edu.unlp.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
    private List<Carpeta> carpetas;
    private Carpeta inbox;
    
    public ClienteDeCorreo() {
        carpetas = new ArrayList<Carpeta>();
        inbox = new Carpeta("inbox");
        this.carpetas.add(inbox);
    }

    public int espacioOcupado()
    {
        return this.carpetas.stream().mapToInt(c -> c.tamañoMails()).sum();
    }
    
    public void recibir(Email email)
    {
        this.inbox.agregarEmail(email);
    }

    public Email buscar(String texto)
    {
        return this.carpetas.stream().map(c -> c.buscar(texto)).findFirst().orElse(null);
    }

    public int cantidadTotalMails()
    {
        return carpetas.stream().mapToInt(c-> c.cantidadMails()).sum();
    }


}

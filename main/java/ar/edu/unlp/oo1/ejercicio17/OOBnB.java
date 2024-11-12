// package ar.edu.unlp.oo1.ejercicio17;

// import java.util.ArrayList;
// import java.util.List;

// import ar.edu.unlp.oo1.ejercicio14.DateLapse;

// public class OOBnB {
//     List<Usuario> usuarios;
//     List<Propiedad> propiedades;

//     public OOBnB() {
//         usuarios = new ArrayList<Usuario>();
//         propiedades = new ArrayList<Propiedad>();
//     }

//     public boolean consultarDisponibilidad(Propiedad propiedad, DateLapse lapso){
//         return !propiedad.yaEstaReservadaParaElLapso(lapso);
//     }

//     public boolean crearReserva(Propiedad propiedad, DateLapse lapso)
//     {
//         return propiedad.crearReserva(lapso);
//     }

//     public double calcularPrecioReserva(Propiedad propiedad, DateLapse lapso){
//         return propiedad.getPrecioReserva(lapso);
//     }

//     public boolean cancelarReserva (Propiedad propiedad, DateLapse lapso)
//     {
//         if (propiedad.cancelarReserva(lapso))
//         {

//         }
//         return false;
//     }
//     public double calcularIngresos(DateLapse datelapse)
//     {
//         return 0.75 * this.propiedades.stream().mapToDouble(p -> p.calcularPrecioTotalReservasEntre(datelapse)).sum();
//     }
//     {

//     }



    
    
// }

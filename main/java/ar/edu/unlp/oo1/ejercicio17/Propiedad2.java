// package ar.edu.unlp.oo1.ejercicio17;

// import java.time.LocalDate;
// import java.util.List;

// import ar.edu.unlp.oo1.ejercicio14.DateLapse;
// import ar.edu.unlp.oo1.ejercicio14.LapseInterface;
// import ar.edu.unlp.oo1.ejercicio18.PoliticaCancelacion;

// public class Propiedad2 {
//     private String direccion;
//     private String nombreDescriptivo;
//     private double precioXNoche;
//     private PoliticaCancelacion polCancelacion;


//     private List<Reserva> reservas; 

//     public String getDireccion() {
//         return direccion;
//     }
//     public void setDireccion(String direccion) {
//         this.direccion = direccion;
//     }
//     public String getNombreDescriptivo() {
//         return nombreDescriptivo;
//     }
//     public void setNombreDescriptivo(String nombreDescriptivo) {
//         this.nombreDescriptivo = nombreDescriptivo;
//     }
//     public double getPrecioXNoche() {
//         return precioXNoche;
//     }
//     public void setPrecioXNoche(double precioXNoche) {
//         this.precioXNoche = precioXNoche;
//     }

//     public boolean crearReserva(DateLapse lapso)
//     {
//         Reserva res = new Reserva(lapso, this);
//         if (yaEstaReservadaParaElLapso(res))
//         {
//             return false;
//         }
//         reservarSinCheckear(res);
//         return true;
//     }

//     private void reservarSinCheckear(Reserva r )
//     {
//         this.reservas.add(r);
//     }

//     public boolean yaEstaReservadaParaElLapso(Reserva reserva)
//     {
//         return reservas.stream().filter(r->r.seSuperponeConReserva(reserva)).count() != 0;

//     }

//     public double getPrecioReserva(Reserva r){
//         return r.calcularCosto();
//     }

//     public boolean estaSiendoUsadaAhora()
//     {
//         return lapsosReservas.stream().filter(l -> l.includesDate(LocalDate.now())).findFirst().orElse(null) != null;
//     }

//     public double cancelarReserva(DateLapse datelapse)
//     {
//         Reserva res = new 
//         if (estaSiendoUsadaAhora())
//         {
//             return 0;
//         }
//         cancelarSinCheckear(datelapse);
//         return polCancelacion.MultiplicadorMontoAReembolsar(datelapse.getFrom()) * precioXNoche;

//     }

//     private void cancelarSinCheckear(Reserva res)
//     {
//         reservas.remove(res);
//     }

//     public double calcularPrecioTotalReservasEntre(LapseInterface lapso)
//     {
//         return this.reservas.stream().filter(r -> r.seSuperponeConLapso(lapso)).mapToDouble(r -> r.calcularCosto()).sum();
//     }


// }
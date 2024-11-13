package ar.edu.unlp.oo1.ejercicio21;

  public class Jugador {
      private String nombre;
      private String apellido;
      public Jugador(String nombre, String apellido) {
          this.nombre = nombre;
          this.apellido = apellido;
      }
      @Override
      public int hashCode() {
          final int prime = 31;
          int result = 1;
          result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
          result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
          return result;
      }
      @Override
      public boolean equals(Object obj) {
          if (this == obj)
              return true;
          if (obj == null)
              return false;
          if (getClass() != obj.getClass())
              return false;
          Jugador other = (Jugador) obj;
          if (nombre == null) {
              if (other.nombre != null)
                  return false;
          } else if (!nombre.equals(other.nombre))
              return false;
          if (apellido == null) {
              if (other.apellido != null)
                  return false;
          } else if (!apellido.equals(other.apellido))
              return false;
          return true;
      }

    
  }

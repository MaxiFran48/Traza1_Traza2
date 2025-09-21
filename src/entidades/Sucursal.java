package entidades;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Sucursal {
    private Long id;
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private boolean esCasaMatriz;

    private Domicilio domicilio;

    @Builder.Default
    private Set<SucursalArticulo> listaSucursalArticulo = new HashSet<>();

    public void agregarArticulo(Articulo articulo, String codigoInterno) {
        SucursalArticulo sucursalArticulo = SucursalArticulo.builder()
                .fechaDesdeArticulo(LocalDate.now())
                .fechaHastaArticulo(null)
                .codigoInternoSucursal(codigoInterno)
                .articulo(articulo)
                .id(SucursalArticulo.incrementarContador())
                .build();

        listaSucursalArticulo.add(sucursalArticulo);
    }

    public void eliminarArticulo(Articulo articulo) {

        for(SucursalArticulo sucursalArticulo : listaSucursalArticulo) {

            if (sucursalArticulo.getArticulo() == articulo) {
                sucursalArticulo.setFechaHastaArticulo(LocalDate.now());
                break;
            }

         }
    }


    @Override
    public String toString() {
        return "Sucursal{" +
                "esCasaMatriz=" + esCasaMatriz +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                '}';
    }
}

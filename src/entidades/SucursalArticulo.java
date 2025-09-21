package entidades;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SucursalArticulo {

    private Long id;
    private String codigoInternoSucursal;

    private LocalDate fechaDesdeArticulo;

    private LocalDate fechaHastaArticulo;

    private Articulo articulo;

    private static Long contador = 1L;

    public static Long incrementarContador() {
        return contador++;
    }

}

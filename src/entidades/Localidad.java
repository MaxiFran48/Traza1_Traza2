package entidades;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Localidad {
    private Long id;
    private String nombre;
    private Provincia provincia;

}
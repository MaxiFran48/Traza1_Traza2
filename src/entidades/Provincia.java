package entidades;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Provincia {
    private Long id;
    private String nombre;

    private Pais pais;

}

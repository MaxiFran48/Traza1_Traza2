package entidades;


import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.Entity;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class ImagenArticulo {
    private Long id;
    private String name;
    private String url;

}

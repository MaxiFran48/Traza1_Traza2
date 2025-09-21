package entidades;


import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@SuperBuilder
public abstract class Articulo  {
    protected Long id;
    protected String denominacion;
    protected Double precioVenta;

    protected UnidadMedida unidadMedida;

    private Categoria categoria;

    @Builder.Default
    protected Set<ImagenArticulo> imagenes = new HashSet<>();

}


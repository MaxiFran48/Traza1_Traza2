package entidades;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Empresa {
    private Long id;
    private String nombre;
    private String razonSocial;
    private Long cuil;

    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

    @Override
    public String toString() {
        return "Empresa{" +
                "cuil=" + cuil +
                ", razonSocial='" + razonSocial + '\'' +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }

    public void addSucursal (Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    public void removeSucursal (Sucursal sucursal){
        this.sucursales.remove(sucursal);
    }

}

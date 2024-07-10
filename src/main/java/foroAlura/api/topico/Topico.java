package foroAlura.api.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="topicos")
@Entity(name="Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String título;
    private String mensaje;
    private String fechacreacion;
    private String status;
    private String autor;
    private String curso;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.título= datosRegistroTopico.título();
        this.mensaje= datosRegistroTopico.mensaje();
        this.fechacreacion= datosRegistroTopico.fechacreacion();
        this.status= datosRegistroTopico.status();
        this.autor= datosRegistroTopico.autor();
        this.curso= datosRegistroTopico.curso();

    }
}

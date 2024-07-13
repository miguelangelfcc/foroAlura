package foroAlura.api.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
    private LocalDate fechacreacion;
    private String status;
    private String autor;
    private String curso;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.título= datosRegistroTopico.título();
        this.mensaje= datosRegistroTopico.mensaje();
        this.fechacreacion= LocalDate.now();
        this.status= datosRegistroTopico.status();
        this.autor= datosRegistroTopico.autor();
        this.curso= datosRegistroTopico.curso();

    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.título() != null) {
            this.título = datosActualizarTopico.título();
        }
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
    }
}

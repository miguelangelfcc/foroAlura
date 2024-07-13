package foroAlura.api.topico;

import java.time.LocalDate;

public record DatosListadoTopico(Long id, String autor, LocalDate fechaCreacion, String titulo, String status) {


    public DatosListadoTopico (Topico topico){
    this(topico.getId(), topico.getAutor(), topico.getFechacreacion(), topico.getTítulo(), topico.getStatus());

    }
}

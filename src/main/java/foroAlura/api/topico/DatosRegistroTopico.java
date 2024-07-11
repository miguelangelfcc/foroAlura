package foroAlura.api.topico;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.Date;

public record DatosRegistroTopico(

        @NotBlank
        String título,

        @NotBlank
        String mensaje,

        LocalDate fechacreacion,

        @NotBlank
        String status,

        @NotBlank
        String autor,

        @NotBlank
        String curso) {
}

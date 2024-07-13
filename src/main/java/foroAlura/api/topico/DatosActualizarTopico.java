package foroAlura.api.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String título, String mensaje) {
}

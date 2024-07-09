package foroAlura.api.topico;

import java.util.Date;

public record DatosRegistroTopico(Long id, String título, String mensaje, String fechacreacion, String status, String autor, String curso) {
}

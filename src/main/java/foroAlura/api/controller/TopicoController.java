package foroAlura.api.controller;

import foroAlura.api.topico.DatosListadoTopico;
import foroAlura.api.topico.DatosRegistroTopico;
import foroAlura.api.topico.Topico;
import foroAlura.api.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico)
    {
        System.out.println("El request llega correctamente");
        System.out.println(datosRegistroTopico);
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public Page<DatosListadoTopico> listadoTopicos(Pageable paginacion){
        return topicoRepository.findAll(paginacion).map(DatosListadoTopico::new);



    }

}

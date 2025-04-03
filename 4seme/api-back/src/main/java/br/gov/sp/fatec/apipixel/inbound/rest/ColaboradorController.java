package br.gov.sp.fatec.apipixel.inbound.rest;

import br.gov.sp.fatec.apipixel.core.domain.command.CarregarColaboradorCommand;
import br.gov.sp.fatec.apipixel.core.domain.projection.ColaboradorProjection;
import br.gov.sp.fatec.apipixel.core.usecase.colaborador.CarregarColaboradorUC;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/colaborador")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ColaboradorController {

    private final CarregarColaboradorUC carregarColaboradorUC;

    @GetMapping("{empresaId}")
    public ResponseEntity<List<ColaboradorProjection>> carregarColaborador(@PathVariable("empresaId") Long empresaId){
        CarregarColaboradorCommand command = new CarregarColaboradorCommand(empresaId);
        return ResponseEntity.ok(carregarColaboradorUC.executar(command));
    }
}

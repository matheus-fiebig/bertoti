package br.gov.sp.fatec.apipixel.core.domain.entity;

import br.gov.sp.fatec.apipixel.core.domain.command.CadastrarEmpresaCommand;
import br.gov.sp.fatec.apipixel.core.usecase.empresa.CarregarEmpresaUC;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empresa_sequence")
    @SequenceGenerator(name = "empresa_sequence", sequenceName = "empresa_sequence", allocationSize = 1)
    private Long id;
    private Long codigo;
    private String nome;
    private String cidade;
    private String estado;
    private String pais;
    private String adminNome;
    private String adminEmail;

    public static Empresa toEntity(CadastrarEmpresaCommand empresaDto){
        Empresa empresa = new Empresa();
        empresa.setCodigo(empresaDto.getCodigo());
        empresa.setNome(empresaDto.getNome());
        empresa.setCidade(empresaDto.getCidade());
        empresa.setPais(empresaDto.getPais());
        empresa.setAdminNome(empresaDto.getAdminNome());
        empresa.setAdminEmail(empresaDto.getAdminEmail());
        return empresa;
    }


    public static Empresa toEntity(CarregarEmpresaUC empresaDto){
        Empresa empresa = new Empresa();
        empresa.getCodigo();
        empresa.getNome();
        empresa.getCidade();
        empresa.getPais();
        empresa.getAdminNome();
        empresa.getAdminEmail();
        return empresa;
    }

}

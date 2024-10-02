**A EMPRESA** parceira escolhida foi a 2RP.
<br>
<br>
**O PROBLEMA** abordado por eles refere-se à necessidade de um sistema para gerenciar horas extras. Os usuários devem ser capazes de registrar suas horas adicionais de trabalho e acessar essas informações em tempo real. Além disso, os gestores e administradores devem ter a capacidade de controlar o acesso ao sistema, extrair relatórios detalhados das horas trabalhadas por cada usuário e personalizar diversas configurações do sistema, tais como definir as horas iniciais do período noturno e especificar o valor correspondente a essas horas extras.
<br>
<br>
**A SOLUÇÃO** entregue proporcionou ao administrador o controle completo (CRUD) de cada usuário, centro de resultado e cliente. Além disso, ele consegue parametrizar o sistema, definindo o valor de cada taxa de trabalho e estabelecendo o início/fim da hora de trabalho noturno, entre outros aspectos importantes. Por fim, o administrador é capaz de realizar a extração de relatórios das horas trabalhadas e aprovar/reprovar as horas extras lançadas. <br>
<br>
Para o gestor, foi concedida a capacidade de lançar horas extras e extrair relatórios relacionados a ele ou aos seus funcionários, além de poder acompanhar em tempo real as horas trabalhadas.
<br>
<br>
Por fim, para o usuário, foi desenvolvida a funcionalidade de lançamento de horas extras e o acompanhamento detalhado das horas extras acumuladas ao longo do mês.

[GIT](https://github.com/matheus-fiebig/portifolio-bd/tree/main/2sem)

#### Tecnologias Utilizadas
- Java: Linguagem principal utilizada no nosso projeto. A linguagem foi amplamente adotada tanto na manipulação dos dados quanto na crição de eventos atrelados a exibição de dados desses.

- CSS: Utilizado na estilização das telas. Foi escolhido pois se adequava com a ferramenta de criação de layout SceneBuilder  

- MySQL: Sua confiabilidade, desempenho e facilidade de uso garatiram sua escolha.Permite realizar a persistência e integridade dos dados do sistema.

#### Contribuições Pessoais
**<br>**
Nesse projeto atuei como desenvolvedor e scrum master.
Como desenvolvedor, minhas contribuições foram:
#### - Desenvolvimento da Tela de Lançamento de Horas:
Fui encarregado de criar a tela de lançamento de horas no SceneBuilder, utilizando para isso CSS e algumas imagens padrões da empresa parceira. Nessa mesma tela foi implementado algumas regras de controle para lançamento e reprovação de horas, de modo que, cada nível de control conseguisse visualizar suas determinadas ações.
<details>
    ```

      public void lancarHoras(ActionEvent event) {
            var rows = table_lancamento.getItems();
            for (ExtratoHoraModel extratoHoraModel : rows) {
                if (extratoHoraModel.getId() != 0) {
                    continue;
                }
                extratoHoraModel.setIdUsuario(UsuarioDAO.usuarioLogado.getId());

                if (UsuarioDAO.usuarioLogado.getIdTipoUsuario() == TipoUsuario.Administrador || UsuarioDAO.usuarioLogado.getIdTipoUsuario() == TipoUsuario.Gestor)
                    extratoHoraModel.setStatus(EtapaExtrato.APROVADA);
                else
                    extratoHoraModel.setStatus(EtapaExtrato.EM_APROVACAO);

                var rowsModified = extratoHoraDao.lancarHora(extratoHoraModel);
                if (rowsModified <= 0) {
                    MensagemRetorno.erroCadastro();
                    return;
                }
            }

            MensagemRetorno.sucessoCadastro();
        }
    ```

Como pode ser visto, aqui esta a implementação do lançamento de horas, na qual existe toda a parte de controle de lançamento com base no seu nível de acesso. Além disso é possivel analisar como é realizado o controle no nosso sistema, através de campo estático que é atribuido durante a ação de login do usuário.
</details>

#### - Desenvolvimento da Tela de Cadastro de CR e Visualização de CR:
Participei também do desenvolvimento da tela de cadastro e de visualização do CR, duas telas bem simples nas quais o usuário apenas tinha o controle de quais centro de custo estavam cadastrados, podendo fazer as operações básicas de um CRUD. A tela em si não possuia nenhuma regra de negócio e apenas servia para popular as comboboxes do sistema.

<details>
COLOCAR A IMAGEM DE GERENCIAMENTO DE CR AQUI

Como pode ser visto acima, o usuário selecionava um CR e selecionava qual integrante do sistema ia ser atribuído aquele CR. Nesta tela fui responsável, também, por toda a parte de criação do Layout e regras de cadastro / visualização
</details>

#### - Desenvolvimento da Tela de Feedback:
Por fim como desenvolvedor participei do desenvolvimento da tela de Feedback. Esta tela é um complemento da tela de Lançamento de Horas e possuía regras similares a ela. Participei principalemente do parte de aprovação/reprovação de horas na qual um modal aparecia para o usuário. Este modal permite ao usuário descrever o motivo da reprovação.

<details>
    COLOCAR FOTO DA TELA

    COLOCAR CODIGO E EXPLICAR
</details>

Como scrum master, minhas contribuições foram:
#### - Criaçao e acompanhamento do burndown:
#### - Acompanhamento diario das entregas do time:

#### Hard Skills
<details>
  <summary><b>Clique para ver a lista de hard skills</b></summary>
  <br>
  <table align="center">
    <tr>
      <th width="300px">Tecnologia/Metodologia</th>
      <th width="300px">Classificação</th>
    </tr>
    <tr>
      <td>SQL</td>
      <td>★★★★★★☆☆☆☆</td>
    </tr>
    <tr>
      <td>MYSQL</td>
      <td>★★★★☆☆☆☆☆☆</td>
    </tr>
    <tr>
      <td>HTML/CSS</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>Scrum</td>
      <td>★★★★★★☆☆☆☆</td>
    </tr>
  </table>
</details>

#### Soft Skills
<details>
  <summary><b>Clique para ver a lista de softskills</b></summary>
  <br>
  <table align="center">
    <tr>
      <th width="300px">Tecnologia/Metodologia</th>
      <th width="300px">Classificação</th>
    </tr>
    <tr>
      <td>Comunicação</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>Trabalho em Equipe</td>
      <td>★★★★★★☆☆☆☆</td>
    </tr>
    <tr>
      <td>Resolução de Problemas</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>Responsabilidade</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
  </table>
</details>
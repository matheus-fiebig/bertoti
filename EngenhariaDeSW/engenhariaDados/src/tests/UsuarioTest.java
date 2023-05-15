package src.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import src.carrinho.Usuario;

public class UsuarioTest {
    public UsuarioTest() {
        super();
    }

    @Test
    public void usuarioNaoDeveTerAcessoAoCarrinhoSeNaoEstiverLogado(){
        //Arrange
        var usuario = new Usuario("e", "s");

        //Act
        var carrinho = usuario.getCarrinhoDeCompra();

        //Assert
        assertNull(carrinho);
    }

    @Test
    public void usuarioDeveTerAcessoAoCarrinhoSeEstiverLogado(){
        //Arrange
        var usuario = new Usuario("e", "s");

        //Act
        usuario.setEstaLogado(true);
        var carrinho = usuario.getCarrinhoDeCompra();

        //Assert
        assertNotNull(carrinho);
    }
}

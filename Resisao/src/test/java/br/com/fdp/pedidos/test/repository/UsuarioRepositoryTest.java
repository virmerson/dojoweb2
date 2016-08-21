package br.com.fdp.pedidos.test.repository;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.fdp.pedidos.model.Usuario;
import br.com.fdp.pedidos.model.repository.UsuarioRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UsuarioRepositoryTest {
	@Autowired
	private UsuarioRepository usuarioRepostory;
	
	@Test
	public void salvar(){
		
		Usuario usuario = new Usuario();
		usuario.setLogin("Jao");
		usuario.setSenha("1234");
		usuario.setAtivo(true);
		
		Usuario usuarioSalvo = usuarioRepostory.save(usuario);
		
		assertThat(usuarioSalvo.getLogin()).isEqualTo(usuarioSalvo.getLogin());
		assertThat(usuarioSalvo.getSenha()).isEqualTo(usuarioSalvo.getSenha());
	}

}

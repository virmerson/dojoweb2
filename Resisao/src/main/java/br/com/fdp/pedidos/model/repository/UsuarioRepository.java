package br.com.fdp.pedidos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fdp.pedidos.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}

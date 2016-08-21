package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.Usuario;
import br.com.fdp.pedidos.model.repository.UsuarioRepository;

@Named
@ViewScoped
public class UsuarioController {
	
	private Usuario usuario = new Usuario();
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private List<Usuario> usuarios;
	@PostConstruct
	public void iniciar(){
		usuarios = usuarioRepository.findAll();
	}
	
	public void salvar(){
		
		usuarioRepository.save(getUsuario());
		usuarios.add(usuario);
		limpar();
		
	}
	public void limpar(){
		usuario = new Usuario();
	}
	
	public void listar(){
		usuarioRepository.findAll();
	}
	public void excluir(Usuario usuario){
		usuarioRepository.delete(usuario);
		usuarios.remove(usuario);
		
	
	}
	public void editar(Usuario usuario){
		setUsuario(usuario);
	}
	
	public String novoUsuario() {
		usuario = new Usuario();
		return "CadastroUsuario?faces-redirect=true";
	}
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}

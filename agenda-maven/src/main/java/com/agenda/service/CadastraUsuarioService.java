package com.agenda.service;

import java.util.List;

import com.agenda.dao.BuscaDAO;
import com.agenda.dao.ContatoDAO;
import com.agenda.dao.EnderecoDAO;
import com.agenda.dao.PessoaDAO;
import com.agenda.model.Pessoa;

public class CadastraUsuarioService {

	private PessoaDAO dao;
	private BuscaDAO dao2;
	private ContatoDAO dao3;
	private EnderecoDAO dao4;

	public CadastraUsuarioService() {
		this.dao = new PessoaDAO();
		this.dao2 = new BuscaDAO();
		this.dao3 = new ContatoDAO();
		this.dao4 = new EnderecoDAO();
	}

	public void salvarOuAtualizar(Pessoa pessoa) {

		if (pessoa.getId() == 0) {
			this.dao.cadastrar(pessoa);
		} else {
			this.dao.alterar(pessoa);
		}
	}

	public List<Pessoa> buscaPessoas() {
		return this.dao2.buscarPessoas();
	}

	public void remover(Pessoa pessoa) {
		this.dao.remover(pessoa);
	}

}

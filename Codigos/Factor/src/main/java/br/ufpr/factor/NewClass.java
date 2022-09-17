/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufpr.factor;

/**
 *
 * @author Antonio
 */
class FactoryPessoa {

	public Pessoa getPessoa(String nome, String sexo) {
		if (sexo.equals("M"))
			return new H(nome);
		if (sexo.equals("F"))
			return new Mulher(nome);
	}

}
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;


public class RestauranteService {

	public List<Gerente> consultarGerentes() {

		List<Gerente> gerentes = new ArrayList<Gerente>();

		Gerente gerenteA = new Gerente();
		Gerente gerenteB = new Gerente();
		Gerente gerenteC = new Gerente();
		Gerente gerenteD = new Gerente();
		Gerente gerenteE = new Gerente();
		
		gerenteA.setNombre("Juan");
		gerenteA.setPrimerAp("Garcia");
		gerenteA.setSegundoAp("Garcia");

		gerenteB.setNombre("Jose");
		gerenteB.setPrimerAp("Hernandez");
		gerenteB.setSegundoAp("Hernandez");
		
		gerenteC.setNombre("Enrique");
		gerenteC.setPrimerAp("Valencia");
		gerenteC.setSegundoAp("Valencia");
		
		gerenteD.setNombre("Karen");
		gerenteD.setPrimerAp("Quiroga");
		gerenteD.setSegundoAp("Quiroga");
		
		gerenteE.setNombre("Itzel");
		gerenteE.setPrimerAp("Valencia");
		gerenteE.setSegundoAp("Vargas");
		
		gerentes.add(gerenteA);
		gerentes.add(gerenteB);
		gerentes.add(gerenteC);
		gerentes.add(gerenteD);
		gerentes.add(gerenteE);
		
		return gerentes;

	}

	public List<Restaurante> consultarRestaurantes() {

		// Generar la lista de empleados a consultar
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();		
		List<Gerente> gerentes = consultarGerentes();
				
		Restaurante restHooters = new Restaurante();
		Restaurante restItallianis = new Restaurante();
		Restaurante restEntreFuegos = new Restaurante();
		Restaurante restVidArg = new Restaurante();
		Restaurante restDanesa = new Restaurante(); 
				
		restHooters.setNombre("Hooters");
		restHooters.setAddr("Galerias Atizapan");
		restHooters.setPais("Mex");
		restHooters.setGerente(gerentes.get(0));
		
		restItallianis.setNombre("Itallianis");
		restItallianis.setAddr("Mundo E");
		restItallianis.setPais("Mex");
		restItallianis.setGerente(gerentes.get(1));
		
		restEntreFuegos.setNombre("Entre Fuegos");
		restEntreFuegos.setAddr("Satelite");
		restEntreFuegos.setPais("Mex");
		restEntreFuegos.setGerente(gerentes.get(2));
		
		restVidArg.setNombre("Vid Argentina");
		restVidArg.setAddr("Polanco");
		restVidArg.setPais("Mex");
		restVidArg.setGerente(gerentes.get(3));
		
		restDanesa.setNombre("Parrilla Danesa");
		restDanesa.setAddr("Satelite");
		restDanesa.setPais("Mex");
		restDanesa.setGerente(gerentes.get(4));
		
		restaurantes.add(restEntreFuegos);
		restaurantes.add(restItallianis);	
		restaurantes.add(restVidArg);
		restaurantes.add(restHooters);
		restaurantes.add(restDanesa);

		return restaurantes;

	}

}

package com.example.demo.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.domain.Pokemon;
import com.example.demo.domain.PokemonType;
import com.example.demo.repository.PokemonRepository;

@Component
public class Query implements GraphQLQueryResolver{

	private PokemonRepository pokemonRepository;
	
	public Query(PokemonRepository pokemonRepository) {
		this.pokemonRepository = pokemonRepository;
	}
	
	public Pokemon fetchPokemonByName(String name) {
		return Pokemon.builder()
				.name("Charizard")
				.pokemonType(PokemonType.fire)
				.build();
	}
	
	public Iterable<Pokemon> fetchAllPokemon(){
		return pokemonRepository.findAll();
	}
	
}

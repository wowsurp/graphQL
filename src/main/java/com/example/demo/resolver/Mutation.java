package com.example.demo.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.domain.Pokemon;
import com.example.demo.domain.PokemonInput;

@Component
public class Mutation implements GraphQLMutationResolver{

	public Pokemon addPokemon(PokemonInput pokemonInput) {
		return pokemonInput.toPokemon();
	}
	
}

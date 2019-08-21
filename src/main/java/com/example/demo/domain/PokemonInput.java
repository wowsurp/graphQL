package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PokemonInput {

	private String name;
	
	private PokemonType pokemonType;
	
	public Pokemon toPokemon() {
		return Pokemon.builder()
				.name(this.name)
				.pokemonType(this.pokemonType)
				.build();
	}
}

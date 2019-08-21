package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Pokemon;

@Repository
public interface PokemonRepository extends PagingAndSortingRepository<Pokemon, Long>{

}

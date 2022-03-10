package com.devsuperior.dsmovie.controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.ScoreDTO;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@PutMapping
	public ScoreDTO saveScore(@RequestBody ScoreDTO scoreDTO) {
		
		return null;
	}


}

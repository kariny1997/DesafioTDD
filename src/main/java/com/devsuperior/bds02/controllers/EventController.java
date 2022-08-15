package com.devsuperior.bds02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds02.dto.EventDTO;
import com.devsuperior.bds02.services.EventService;


@RestController
public class EventController {
		
		@Autowired
		private EventService eventService;		

		@PutMapping("/events/{id}")
		public ResponseEntity<EventDTO> update(@PathVariable long id, @RequestBody EventDTO dto){
			dto = eventService.update(id, dto);
			return ResponseEntity.ok().body(dto);
		}



}

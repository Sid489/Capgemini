package com.music.streaming.platform.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.common.exception.ResourceNotFoundException;
import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.service.ArtistService;
import com.music.streaming.platform.service.impl.ArtistServiceImpl;
@RestController
public class ArtistController {
	private ArtistService asi;
	public ArtistController(ArtistService asi) {
		this.asi=asi;
	}
	@PostMapping("/music/platform/v1/artists")
	public Artist createArtist(@RequestBody ArtistRequest ar) {
		return asi.createArtist(ar);
	}
	@GetMapping("/music/platform/v1/artists")
	public List<Artist> getArtists(){
		return asi.getAllArtists();
	}
	@GetMapping("/music/platform/v1/artists/{artistId}")
	public Artist getArtistByUsingId(@PathVariable long artistId) {
		if(asi.getArtistById(artistId)!=null) {
			return asi.getArtistById(artistId);
		}
		else {
			throw new ResourceNotFoundException(HttpStatus.NOT_FOUND,"The resource cannot be found");
		}
	}
	@PutMapping("/music/platform/v1/artists/{artistId}")
	public Artist updatebyId(@PathVariable long artistId,ArtistRequest ar) {
		return asi.updateArtist(artistId, ar);
	}
	@DeleteMapping("/music/platform/v1/artists/{artistId}")
	public ResponseEntity<Void> deleteArtist(@PathVariable long artistId) {
		if(asi.getArtistById(artistId)!=null) {
			 asi.deleteArtist(artistId);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.noContent().build();
	}
	
	
}

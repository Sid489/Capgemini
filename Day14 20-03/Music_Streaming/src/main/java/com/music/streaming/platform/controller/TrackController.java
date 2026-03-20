package com.music.streaming.platform.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.dto.TrackRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.model.Track;
import com.music.streaming.platform.service.TrackService;

@RestController
public class TrackController {
	private TrackService tsi;
	public TrackController(TrackService tsi) {
		this.tsi=tsi;
	}
	@PostMapping("/music/platform/v1/tracks")
	public ResponseEntity<Track> createNewTrack(TrackRequest tri){
		return new ResponseEntity<Track>(tsi.createTrack(tri),HttpStatus.OK);
	}
	@GetMapping("/music/platform/v1/tracks")
	public List<Track> getAllTracks(){
		return tsi.getAllTracks();
	}
	@GetMapping("/music/platform/v1/tracks/{trackId}")
	public ResponseEntity<Track> getTrackById(@PathVariable long trackId){
		if(tsi.getTrackById(trackId)!=null) {
			return new ResponseEntity<Track>(tsi.getTrackById(trackId),HttpStatus.OK);
		}
		return ResponseEntity.notFound().build();
	}
	@PutMapping("/music/platform/v1/tracks/{trackId}")
	public ResponseEntity<Track> updatebyId(@PathVariable long trackId,TrackRequest tr) {
//		if(tsi.getTrackById(trackId)!=null) 
			return new ResponseEntity<Track>(tsi.updateTrack(trackId, tr),HttpStatus.OK);
		
//		return ResponseEntity.notFound().build();
	}
	@DeleteMapping("/music/platform/v1/tracks/{trackId}")
	public ResponseEntity<Void> deletebyId(@PathVariable long trackId){
		if(tsi.getTrackById(trackId)!=null) {
			tsi.deleteTrack(trackId);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.noContent().build();
	}
}

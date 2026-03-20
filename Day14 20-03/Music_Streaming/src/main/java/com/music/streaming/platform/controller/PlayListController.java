package com.music.streaming.platform.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.dto.PlayListRequest;
import com.music.streaming.platform.model.PlayList;
import com.music.streaming.platform.service.PlayListService;

@RestController
public class PlayListController {
	private PlayListService psi;
	public PlayListController(PlayListService psi) {
		this.psi=psi;
	}
	@PostMapping("/music/platform/v1/playlists")
	public ResponseEntity<PlayList> createPlaylist(PlayListRequest pq){
		return new ResponseEntity<PlayList>(psi.createPlayList(pq),HttpStatus.OK);
		
	}
	@GetMapping("/music/platform/v1/playlists/{playlistId}")
	public ResponseEntity<PlayList> getPlaylistById(@PathVariable long playlistId){
		if(psi.getPlayListById(playlistId)!=null) {
			return new ResponseEntity<PlayList>(psi.getPlayListById(playlistId),HttpStatus.OK);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	@DeleteMapping("/music/platform/v1/playlists/{playlistId}")
	public ResponseEntity<Void> deletePlayList(@PathVariable long playlistId){
		if(psi.getPlayListById(playlistId)!=null) {
			 psi.deletePlayList(playlistId);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.noContent().build();
		
	}
	
}

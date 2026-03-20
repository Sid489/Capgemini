package com.music.streaming.platform.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "track")
@Getter
@Setter
public class Track extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "album_name")
    private String albumName;
    @Column(name = "release_date")
    private LocalDate releaseDate;
    @Column(name = "duration")
    private String duration;
    @Column(name = "genre")
    private String genre;
    @Column(name = "description")
    private String description;
    @Column(name = "playCount")
    private Integer playCount;
    @Column(name = "file_url")
    private String fileUrl;
    @Column(name = "cover_image")
    private String coverImage;
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPlayCount() {
		return playCount;
	}
	public void setPlayCount(Integer playCount) {
		this.playCount = playCount;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getCoverImage() {
		return coverImage;
	}
	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
    
}

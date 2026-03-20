package com.music.streaming.platform.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "artist")
@Getter
@Setter
public class Artist extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private Long id;
    @Column(name = "artist_name")
    private String artistName;
    @Column(name = "bio")
    private String bio;
    @Column(name = "genre")
    private String genre;
    @Column(name = "origin")
    private String origin;
    @Column(name = "formed_year")
    private String formedYear;
    @Column(name = "social_link")
    private String socialLink;
    @Column(name = "image")
    private String image;

    @OneToMany(mappedBy = "artist")
    private List<Track> tracksProduced;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getFormedYear() {
		return formedYear;
	}

	public void setFormedYear(String formedYear) {
		this.formedYear = formedYear;
	}

	public String getSocialLink() {
		return socialLink;
	}

	public void setSocialLink(String socialLink) {
		this.socialLink = socialLink;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Track> getTracksProduced() {
		return tracksProduced;
	}

	public void setTracksProduced(List<Track> tracksProduced) {
		this.tracksProduced = tracksProduced;
	}
    
}


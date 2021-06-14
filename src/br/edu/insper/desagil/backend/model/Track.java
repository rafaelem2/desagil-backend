package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	
	
	public Track(Artist artist, String name, int duration) {
		super();
		this.artist = artist;
		this.name = name;
		this.duration = duration;
		
	}
	
	
	public Artist getArtist() {
		return artist;
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		String s;
		int minute = this.duration/60;
		int seconds = this.duration%60;
		if (seconds < 10) {
			s = "0" + seconds;
		}else {
			s = " " + seconds;
			
		}
		String tempo = " " + minute + ":" + s;
	
		return (tempo);
		
	}
	
	public String getFullArtistName() {
		return this.artist.getName();
		
	}
	
	
	

}

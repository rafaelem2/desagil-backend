package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	
	
	public Track(Artist artist, String name, int duration) {
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
		int minutes = this.duration/60;
		String duracaoTotal = Integer.toString(minutes) + ":";
		int seconds = this.duration%60;
		if (seconds >= 10) {
			duracaoTotal += Integer.toString(seconds);
		}else {
			duracaoTotal += "0" + Integer.toString(seconds);
			
		}
	
		return (duracaoTotal);
		
	}
	
	public String getFullArtistName() {
		return this.artist.getName();
		
	}
	
	
	

}

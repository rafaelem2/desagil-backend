package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	
	public Playlist(int id) {
		super();
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}
	
	public int getId() {
		return id;
	}
	
	public List<Track> getTracks(){
		return tracks;
	}
	
	public Map<String,Integer> getRatings(){
		return ratings;
	}
	
	public void putRating(String usuario, int avaliacao) {
		this.ratings.put(usuario, avaliacao);
		
	}
	
	public void addTrack(Track track) {
			this.tracks.add(track);
		
	}
	
	public double averageRatings() {
		int soma = 0;
		for (String usuario : this.ratings.keySet()) {
			soma += this.ratings.get(usuario);
		}
		double mediaSemArredondamento = (double) soma/this.ratings.size();		
		double Fracionaria = mediaSemArredondamento - Math.floor(mediaSemArredondamento);
		if (Fracionaria < 0.26) {
			return Math.floor(mediaSemArredondamento);
		}
		else if (Fracionaria >= 0.74) {
			return Math.ceil(mediaSemArredondamento);
		}
		return Math.floor(mediaSemArredondamento) + 0.5;
	}
}   

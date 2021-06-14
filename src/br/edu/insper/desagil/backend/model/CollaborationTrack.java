package br.edu.insper.desagil.backend.model;


import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track {
	private List<Artist> collaborators;
	
	public CollaborationTrack(Artist artist, List<Artist> collaborator, String name, int duration) {
		super(artist, name, duration);
		this.collaborators = collaborator;
	}
	
	@Override
	public String getFullArtistName() {
		List<String> collaboratorName = new ArrayList<>();
		for (Artist artist : collaborators) {
			collaboratorName.add(artist.getName());
		}
		return super.getFullArtistName() + " (feat. " + String.join(",", collaboratorName) + ")";
	}

}

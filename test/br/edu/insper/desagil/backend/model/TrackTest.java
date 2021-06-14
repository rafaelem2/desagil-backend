package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Artist artist;
	private Track track;
	private CollaborationTrack collab;
	
	@BeforeEach
	void setUp() {
		artist = new Artist ("Anitta");
	}

	@Test
	void testZeroSeconds() {
		track = new Track (artist,"Rafael",0);
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		track = new Track (artist, "Rafael", 5);
		assertEquals("0:05",track.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		track = new Track (artist, "Rafael", 25);
		assertEquals("0:25",track.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		track = new Track (artist,"Rafael", 60);
		assertEquals("1:00",track.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		track = new Track (artist,"Rafael", 65);
		assertEquals("1:05",track.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		track = new Track (artist,"Rafael", 85);
		assertEquals("1:25",track.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		track = new Track (artist, "Rafael", 120);
		assertEquals("2:00",track.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		track = new Track (artist, "Rafael", 125);
		assertEquals("2:05",track.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		track = new Track (artist, "Rafael", 145);
		assertEquals("2:25",track.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		collab = new CollaborationTrack (artist,Arrays.asList(new Artist ("Becky G")),"Rafael",60);
		assertEquals("Anitta (feat. Becky G)", collab.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		collab = new CollaborationTrack (artist,Arrays.asList(new Artist ("Ludmilla"), new Artist ("Snoop Dog")),"Rafael",60);
		assertEquals("Anitta (feat. Ludmilla, Snoop Dog)", collab.getFullArtistName());;
	}
}

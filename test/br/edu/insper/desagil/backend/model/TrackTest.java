package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	
	@BeforeEach
	void setUp() {
	}

	@Test
	void testZeroSeconds() {
		Track track = new Track (new Artist("Anitta"),"Rafael",0);
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		Track track = new Track (new Artist("Anitta"), "Rafael", 5);
		assertEquals("0:05",track.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		Track track = new Track (new Artist("Anitta"), "Rafael", 25);
		assertEquals("0:25",track.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		Track track = new Track (new Artist("Anitta"),"Rafael", 60);
		assertEquals("1:00",track.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		Track track = new Track (new Artist("Anitta"),"Rafael", 65);
		assertEquals("1:05",track.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		Track track = new Track (new Artist("Anitta"),"Rafael", 85);
		assertEquals("1:25",track.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		Track track = new Track (new Artist("Anitta"), "Rafael", 120);
		assertEquals("2:00",track.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		Track track = new Track (new Artist("Anitta"), "Rafael", 125);
		assertEquals("2:05",track.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		Track track = new Track (new Artist("Anitta"), "Rafael", 145);
		assertEquals("2:25",track.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		CollaborationTrack collaborationTrack = new CollaborationTrack (new Artist("Anitta"),Arrays.asList(new Artist ("Becky G")),"Rafael",60);
		assertEquals("Anitta (feat. Becky G)", collaborationTrack.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		CollaborationTrack collaborationTrack = new CollaborationTrack (new Artist("Anitta"),Arrays.asList(new Artist ("Ludmilla"), new Artist ("Snoop Dog")),"Rafael",60);
		assertEquals("Anitta (feat. Ludmilla,Snoop Dog)", collaborationTrack.getFullArtistName());;
	}
}

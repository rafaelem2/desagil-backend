package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist playlist;
	@BeforeEach
	void setUp() {
		this.playlist = new Playlist(0);
	}

	@Test
	void testRoundDownToZero() {
		playlist.putRating("Rafael", 1);
		playlist.putRating("Evangelista", 2);
		playlist.putRating("Monteiro", 3);
		playlist.putRating("Hashimoto", 3);
		assertEquals(2.0, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		playlist.putRating("Rafael", 1);
		playlist.putRating("Evangelista", 2);
		playlist.putRating("Monteiro", 1);
		
		assertEquals(1.5, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundDownToHalf() {
		playlist.putRating("Rafael", 1);
		playlist.putRating("Evangelista", 2);
		playlist.putRating("Monteiro", 2);
		assertEquals(1.5, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToOne() {
		playlist.putRating("Rafael", 1);
		playlist.putRating("Evangelista", 1);
		playlist.putRating("Monteiro", 2);
		playlist.putRating("Hashimoto", 3);
		assertEquals(2.0, playlist.averageRatings(), DELTA);	
	}
}

package com.techchefs.app.sortsong;


public class Song {
	
	String songName;
	String songDate;
	
	public Song(String songName, String songDate) {
		super();
		this.songName = songName;
		this.songDate = songDate;
	}
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSongDate() {
		return songDate;
	}
	public void setSongDate(String songDate) {
		this.songDate = songDate;
	}
	
}

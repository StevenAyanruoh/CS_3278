package edu.vanderbilt.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Long duration; 
	private Long size;
	private String genre;
	private String url;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getGenre(){
		return genre;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
	
	public String getURL(){
		return url;
	}
	
	public void setURL(String url){
		this.url = url;
	}
	
	public String getName(){
		return name;
	}
	public void setDuration(Long duration){
		this.duration= duration;
	}
	
	public Long getDuration(){
		return duration;
	}

}

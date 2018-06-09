package com.activity.demo.beer;

import javax.persistence.Entity;
import javax.persistence.generatedValue;
import javax.persistence.value;

@Entity
class Beer{
	@Id
	@GeneratedValue
	private Long Id;
	private String Name;
	
	
	public Beer(){
		
	}
	
	public Beer(String Name){
		this.Name = Name;	
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
}

package com.roona;
// Generated Jan 25, 2016 11:19:41 PM by Hibernate Tools 4.3.1.Final

/**
 * Complexity generated by hbm2java
 */
public class Complexity implements java.io.Serializable {

	private int id;
	private String complexity;

	public Complexity() {
	}

	public Complexity(int id) {
		this.id = id;
	}

	public Complexity(int id, String complexity) {
		this.id = id;
		this.complexity = complexity;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComplexity() {
		return this.complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

}

package com.roona.bo;
// Generated Feb 27, 2016 12:23:07 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Team generated by hbm2java
 */
@Entity
@Table(name = "team", catalog = "mywebapp", uniqueConstraints = @UniqueConstraint(columnNames = "team_name") )
public class Team implements java.io.Serializable {

	private Integer id;
	private String teamName;
	private Set<ApplicationRequestDetails> applicationRequestDetailses = new HashSet<ApplicationRequestDetails>(0);

	public Team() {
	}

	public Team(String teamName) {
		this.teamName = teamName;
	}

	public Team(String teamName, Set<ApplicationRequestDetails> applicationRequestDetailses) {
		this.teamName = teamName;
		this.applicationRequestDetailses = applicationRequestDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "team_name", unique = true, nullable = false, length = 45)
	public String getTeamName() {
		return this.teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
	public Set<ApplicationRequestDetails> getApplicationRequestDetailses() {
		return this.applicationRequestDetailses;
	}

	public void setApplicationRequestDetailses(Set<ApplicationRequestDetails> applicationRequestDetailses) {
		this.applicationRequestDetailses = applicationRequestDetailses;
	}

}
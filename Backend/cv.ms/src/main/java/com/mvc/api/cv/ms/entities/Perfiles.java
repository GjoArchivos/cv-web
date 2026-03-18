package com.mvc.api.cv.ms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "profiles")
public class Perfiles {
	@Id
	@Column(name="profiles_id")
	private Long perfilId;
	@Column(name="linkedin_url")
	private String linkedinUrl;
	@Column(name="github_url")
    private String githubUrl;
	@Column(name="portfolio_url")
    private String portfolioUrl;
}

package com.mvc.api.cv.ms.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="certifications")
public class Certificaciones {

	@Id
	@Column(name="certification_id")
	private Long certificationId;
	private String issuer;
    private String title;
    @Column(name="end_date")
    private LocalDate endDate;
    @Column(name="expiration_date")
    private LocalDate expirationDate;
}

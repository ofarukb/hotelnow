package com.tobeto.java4a.hotelnow.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "staffs")
public class Staff extends User {

	@Id
	@Column(name = "id")
	private int id;

	@OneToOne
	@MapsId
	@JoinColumn(name = "id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "hotel_id")
	private Hotel hotel;

	public int getId() {
		return this.id;
	}
}

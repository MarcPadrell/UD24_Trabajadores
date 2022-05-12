package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trabajador")
public class Trabajador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "trabajo") // no hace falta si se llama igual
	private String trabajo;
	@Column(name = "salario") // no hace falta si se llama igual
	private double salario;

	public Trabajador() {
		super();
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 */
	public Trabajador(Long id, String nombre, Trabajos trabajo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo.toString();
		this.salario = salarioTrabajo(trabajo.toString());
	}

	public double salarioTrabajo(String trabajo) {

		double salario = 0.0;

		switch (trabajo) {
		case "IT":
			salario = 1850.56;
			break;
		case "RRHH":
			salario = 1300.30;
			break;
		case "Marketing":
			salario = 1400.80;
			break;
		case "FullStack":
			salario = 2500.95;
			break;
		case "Consultor":
			salario = 3000.40;
			break;

		}

		return salario;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
		setSalario(this.salarioTrabajo(trabajo));
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}
	

}

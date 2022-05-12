package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Trabajador;

public interface ITrabajadorService {

	List<Trabajador> listarTrabajador();

	Trabajador guardarTrabajador(Trabajador trabajador);

	Trabajador trabajadorXID(Long id);

	Trabajador actualizarTrabajador(Trabajador trabajador);

	void eliminarTrabajador(Long id);

	List<Trabajador> listarTrabajadorNombre(String nombre);

}

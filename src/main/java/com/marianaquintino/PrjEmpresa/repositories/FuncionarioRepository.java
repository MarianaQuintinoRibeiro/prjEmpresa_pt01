package com.marianaquintino.PrjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marianaquintino.PrjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}

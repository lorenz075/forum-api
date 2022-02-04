package br.com.cod3r.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cod3r.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}

package br.com.cod3r.forum.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import br.com.cod3r.forum.modelo.Curso;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class CursoRepositoryTest {

	@Autowired
	CursoRepository cursoRepository;
	
	@Autowired
	private TestEntityManager em;
	
	@Test
	void precisaRetornarUmCursoPeloNome() {
		String nomeCurso = "HTML";
		
		Curso html = new Curso();
		html.setNome(nomeCurso);
		html.setCategoria("Programacao");
		em.persist(html);
		
		Curso curso = cursoRepository.findByNome(nomeCurso);
		assertThat(curso).isNotNull();
		assertThat(curso.getNome()).isEqualTo(nomeCurso);
	}
	
	@Test
	void precisaRetornarFalse() {
		String nomeCurso = "FALSE";
		Curso curso = cursoRepository.findByNome(nomeCurso);
		assertThat(curso).isNull();;
	}

	
}

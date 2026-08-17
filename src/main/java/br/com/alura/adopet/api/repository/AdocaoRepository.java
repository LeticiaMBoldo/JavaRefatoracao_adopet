package br.com.alura.adopet.api.repository;

import br.com.alura.adopet.api.model.Adocao;
import br.com.alura.adopet.api.model.StatusAdocao;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.StyledEditorKit;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {

    Boolean existsByPetIdAndStatus(Long idPet, StatusAdocao status);
}

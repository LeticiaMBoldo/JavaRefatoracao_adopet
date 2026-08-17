package br.com.alura.adopet.api.repository;

import br.com.alura.adopet.api.model.Abrigo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AbrigoRepository extends JpaRepository<Abrigo, Long> {

    boolean existsByNomeOrTelefoneOrEmail(@NotBlank String nome, @NotBlank @Pattern(regexp = "\\(?\\d{2}\\)?\\d?\\d{4}-?\\d{4}") String telefone, @NotBlank @Email String email);

    Optional<Abrigo> findByNome(String idOuNome);
}

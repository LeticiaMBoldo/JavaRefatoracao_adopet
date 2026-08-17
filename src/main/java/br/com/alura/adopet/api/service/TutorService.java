package br.com.alura.adopet.api.service;

import br.com.alura.adopet.api.dto.AtualizaTutorDto;
import br.com.alura.adopet.api.dto.TutorDto;
import br.com.alura.adopet.api.model.Tutor;
import br.com.alura.adopet.api.repository.TutorRepository;
import br.com.alura.adopet.api.validacoes.ValidacaoTutorCadastro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {

    @Autowired
    private TutorRepository repository;

    @Autowired
    private List<ValidacaoTutorCadastro> validacoesTutor;

    public void cadastrar(TutorDto cadTutor) {
        //validação sobre existe tutor
        validacoesTutor.forEach(v -> v.validarTutor(cadTutor));

        Tutor tutor = new Tutor(cadTutor.nome(), cadTutor.telefone(), cadTutor.email());
        repository.save(tutor);
    }

    public void atualizar(AtualizaTutorDto dto) {
        Tutor tutor = repository.getReferenceById(dto.idTutor());
        tutor.atualizarTutor(tutor.getNome(), tutor.getTelefone(), tutor.getEmail());
    }
}

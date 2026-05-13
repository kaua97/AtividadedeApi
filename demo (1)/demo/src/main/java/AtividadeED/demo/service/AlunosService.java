package AtividadeED.demo.service;


import AtividadeED.demo.Model.AlunosModel;
import AtividadeED.demo.dto.AlunoRequest;
import AtividadeED.demo.dto.AlunoResponse;
import AtividadeED.demo.repository.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunosService {

    @Autowired
    private AlunosRepository repository;

    public AlunoResponse  salvarAlunos(AlunoResponse dto){
        AlunosModel model= new AlunosModel();
        model.setSemestre(dto.getsemestre()));
    }
}

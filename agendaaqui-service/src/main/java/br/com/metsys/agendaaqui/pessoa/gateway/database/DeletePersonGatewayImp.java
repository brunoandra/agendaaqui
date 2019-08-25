package br.com.metsys.agendaaqui.pessoa.gateway.database;

import br.com.metsys.agendaaqui.pessoa.gateway.DeletePersonGateway;
import br.com.metsys.agendaaqui.pessoa.gateway.database.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletePersonGatewayImp implements DeletePersonGateway {
    private PersonRepository personRepository;

    @Autowired
    public DeletePersonGatewayImp(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void execute(long id) {

    }
}

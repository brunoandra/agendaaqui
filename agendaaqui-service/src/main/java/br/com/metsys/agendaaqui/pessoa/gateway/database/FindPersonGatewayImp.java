package br.com.metsys.agendaaqui.pessoa.gateway.database;

import br.com.metsys.agendaaqui.pessoa.gateway.FindPersonGateway;
import br.com.metsys.agendaaqui.pessoa.gateway.database.repository.PersonRepository;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class FindPersonGatewayImp implements FindPersonGateway {
    private PersonRepository personRepository;

    @Autowired
    public FindPersonGatewayImp(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Optional<PersonDomain> execute(long id) {
        return Optional.empty();
    }
}

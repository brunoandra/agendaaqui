package br.com.metsys.agendaaqui.pessoa.gateway.database;

import br.com.metsys.agendaaqui.pessoa.gateway.DeletePersonGateway;
import br.com.metsys.agendaaqui.pessoa.gateway.database.exception.DeleteGatewayException;
import br.com.metsys.agendaaqui.pessoa.gateway.database.exception.GatewayException;
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
    public void execute(long id) throws GatewayException {
        try {
            personRepository.deleteById(id);
        }catch (Exception ex)
        {
            throw new DeleteGatewayException("Problema ao deletar a pessoa", ex);
        }

    }
}

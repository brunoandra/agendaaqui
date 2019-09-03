package br.com.metsys.agendaaqui.pessoa.usecase;

import br.com.metsys.agendaaqui.pessoa.PersonMessage;
import br.com.metsys.agendaaqui.pessoa.exception.CreatePersonUseCaseException;
import br.com.metsys.agendaaqui.pessoa.exception.UseCaseException;
import br.com.metsys.agendaaqui.pessoa.gateway.SavePersonGateway;
import br.com.metsys.agendaaqui.pessoa.gateway.database.exception.GatewayException;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreatePersonUseCase {
    private SavePersonGateway savePersonGateway;

    @Autowired
    public CreatePersonUseCase(SavePersonGateway savePersonGateway) {
        this.savePersonGateway = savePersonGateway;
    }

    public PersonDomain execute(PersonDomain personDomain) throws UseCaseException {
        PersonDomain personDomainReturn;
        try {
            System.out.print(personDomain);
            PersonMessage.personMessage personMessage =
                    PersonMessage.personMessage.newBuilder()
                    .setNome(personDomain.getNome())
                    .setEmail(personDomain.getEmail()).build();
            System.out.print(personMessage.toByteString());
            personDomainReturn = savePersonGateway.execute(personDomain);
            return personDomainReturn;
        } catch (GatewayException ex) {
            throw new CreatePersonUseCaseException("Problema na criação da pessoa", ex);
        }

    }
}


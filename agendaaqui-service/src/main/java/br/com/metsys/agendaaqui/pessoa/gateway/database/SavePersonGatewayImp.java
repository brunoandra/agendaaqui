package br.com.metsys.agendaaqui.pessoa.gateway.database;

import br.com.metsys.agendaaqui.pessoa.gateway.SavePersonGateway;
import br.com.metsys.agendaaqui.pessoa.gateway.database.repository.PersonRepository;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import org.bouncycastle.asn1.x509.sigi.PersonalData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SavePersonGatewayImp implements SavePersonGateway {
    private PersonRepository personRepository;

    @Autowired
    public SavePersonGatewayImp(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Optional<PersonDomain> execute(PersonalData personalData) {
        return Optional.empty();
    }
}

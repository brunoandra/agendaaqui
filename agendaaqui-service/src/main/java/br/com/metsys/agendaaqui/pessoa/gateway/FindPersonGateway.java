package br.com.metsys.agendaaqui.pessoa.gateway;

import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;

import java.util.Optional;

public interface FindPersonGateway {
    public Optional<PersonDomain> execute(long id);
}

package br.com.metsys.agendaaqui.pessoa.gateway;

import br.com.metsys.agendaaqui.pessoa.gateway.database.exception.GatewayException;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;

public interface SavePersonGateway {
    public PersonDomain execute (PersonDomain personDomain) throws GatewayException;
}

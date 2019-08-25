package br.com.metsys.agendaaqui.pessoa.gateway;

import br.com.metsys.agendaaqui.pessoa.gateway.database.exception.GatewayException;

public interface DeletePersonGateway {
    public void execute(long id) throws GatewayException;
}

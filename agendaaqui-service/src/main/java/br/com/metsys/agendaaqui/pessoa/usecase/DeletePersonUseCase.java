package br.com.metsys.agendaaqui.pessoa.usecase;

import br.com.metsys.agendaaqui.pessoa.exception.DeletePersonUseCaseException;
import br.com.metsys.agendaaqui.pessoa.exception.UseCaseException;
import br.com.metsys.agendaaqui.pessoa.gateway.DeletePersonGateway;
import br.com.metsys.agendaaqui.pessoa.gateway.database.exception.GatewayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletePersonUseCase {
    private DeletePersonGateway deletePersonGateway;

    @Autowired
    public DeletePersonUseCase(DeletePersonGateway deletePersonGateway) {
        this.deletePersonGateway = deletePersonGateway;
    }
    public void execute(Long id) throws UseCaseException{
        try{
            deletePersonGateway.execute(id);
        }catch (GatewayException ex)
        {
            throw new DeletePersonUseCaseException("Problema ao deletar a pessoa",ex);
        }
    }
}

package br.com.metsys.agendaaqui.pessoa.gateway.feign;

import br.com.metsys.agendaaqui.pessoa.gateway.FindPersonGateway;
import br.com.metsys.agendaaqui.pessoa.gateway.database.exception.GatewayException;
import br.com.metsys.agendaaqui.pessoa.model.FindPersonResponse;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("findPersonGatewayFeignImp")
public class FindPersonGatewayFeignImp implements FindPersonGateway {
    private FindPersonFeignApi findPersonFeignApi;

    @Autowired
    public FindPersonGatewayFeignImp(FindPersonFeignApi findPersonFeignApi) {
        this.findPersonFeignApi = findPersonFeignApi;
    }

    @Override
    public Optional<PersonDomain> execute(long id) throws GatewayException {
        try{
            FindPersonResponse findPersonResponse = this.findPersonFeignApi.findPerson(id);

            return Optional.of(PersonDomain.builder()
                    .nome(findPersonResponse.getNome())
                    .email(findPersonResponse.getEmail())
                    .build());
        }catch (Exception e){
            throw new  GatewayException("Erro");
        }

    }
}

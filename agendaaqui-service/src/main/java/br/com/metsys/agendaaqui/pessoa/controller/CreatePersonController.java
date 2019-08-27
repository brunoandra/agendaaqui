package br.com.metsys.agendaaqui.pessoa.controller;

import br.com.metsys.agendaaqui.pessoa.CreatePersonApi;
import br.com.metsys.agendaaqui.pessoa.controller.translate.CreatePersonRequestToPersonDomainTranslate;
import br.com.metsys.agendaaqui.pessoa.exception.UseCaseException;
import br.com.metsys.agendaaqui.pessoa.model.CreatePersonRequest;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import br.com.metsys.agendaaqui.pessoa.usecase.CreatePersonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatePersonController implements CreatePersonApi {
    private CreatePersonUseCase createPersonUseCase;

    @Autowired
    public CreatePersonController(CreatePersonUseCase createPersonUseCase) {
        this.createPersonUseCase = createPersonUseCase;
    }

    @Override
    public ResponseEntity<Long> execute(@RequestBody CreatePersonRequest createPersonRequest) throws UseCaseException {
        PersonDomain personDomain = CreatePersonRequestToPersonDomainTranslate.translator(createPersonRequest);
        PersonDomain personDomainReturn = createPersonUseCase.execute(personDomain);
        ResponseEntity<Long> response = new ResponseEntity<>(personDomainReturn.getId(), HttpStatus.OK);
        return response;
    }
}

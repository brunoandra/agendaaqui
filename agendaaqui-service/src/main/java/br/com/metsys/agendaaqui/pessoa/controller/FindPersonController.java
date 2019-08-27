package br.com.metsys.agendaaqui.pessoa.controller;

import br.com.metsys.agendaaqui.pessoa.FindPersonApi;
import br.com.metsys.agendaaqui.pessoa.controller.translate.PersonDomainToFindPersonResponseTranslate;
import br.com.metsys.agendaaqui.pessoa.exception.UseCaseException;
import br.com.metsys.agendaaqui.pessoa.model.FindPersonResponse;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import br.com.metsys.agendaaqui.pessoa.usecase.FindPersonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindPersonController implements FindPersonApi {
    private FindPersonUseCase findPersonUseCase;

    @Autowired
    public FindPersonController(FindPersonUseCase findPersonUseCase) {
        this.findPersonUseCase = findPersonUseCase;
    }

    @Override
    public ResponseEntity<FindPersonResponse> execute(@RequestParam final Long id) throws UseCaseException {
        PersonDomain personDomainReturn = findPersonUseCase.execute(id);
        ResponseEntity<FindPersonResponse> response = new ResponseEntity<>(PersonDomainToFindPersonResponseTranslate.translator(personDomainReturn), HttpStatus.OK);
        return response;
    }
}

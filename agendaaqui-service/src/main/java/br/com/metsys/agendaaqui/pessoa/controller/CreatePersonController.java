package br.com.metsys.agendaaqui.pessoa.controller;

import br.com.metsys.agendaaqui.pessoa.CreatePersonApi;
import br.com.metsys.agendaaqui.pessoa.controller.translate.CreatePersonRequestToPersonDomainTranslate;
import br.com.metsys.agendaaqui.pessoa.exception.UseCaseException;
import br.com.metsys.agendaaqui.pessoa.model.CreatePersonRequest;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import br.com.metsys.agendaaqui.pessoa.usecase.CreatePersonUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CreatePersonController implements CreatePersonApi {
    private CreatePersonUseCase createPersonUseCase;
    private Logger logger = LoggerFactory.getLogger(FindPersonController.class);

    @Autowired
    public CreatePersonController(CreatePersonUseCase createPersonUseCase) {
        this.createPersonUseCase = createPersonUseCase;
    }

    @Override
    public ResponseEntity<Long> execute(@RequestBody final CreatePersonRequest createPersonRequest, @RequestHeader Map<String, String> headers) throws UseCaseException {
        headers.forEach((key, value) -> {
            logger.info(String.format("Header '%s' = %s", key, value));
        });
        PersonDomain personDomain = CreatePersonRequestToPersonDomainTranslate.translator(createPersonRequest);
        PersonDomain personDomainReturn = createPersonUseCase.execute(personDomain);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("X-B3-TraceIdMethod",
                MDC.get("X-B3-TraceId"));

        ResponseEntity<Long> response = new ResponseEntity<>(personDomainReturn.getId(),responseHeaders, HttpStatus.OK);

        return response;
    }
}

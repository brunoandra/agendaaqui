package br.com.metsys.agendaaqui.pessoa.gateway;

import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import org.bouncycastle.asn1.x509.sigi.PersonalData;

import java.util.Optional;

public interface SavePersonGateway {
    public Optional<PersonDomain> execute (PersonalData personalData);
}

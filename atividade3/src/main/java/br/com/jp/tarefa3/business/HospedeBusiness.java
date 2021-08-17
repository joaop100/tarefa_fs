package br.com.jp.tarefa3.business;

import java.util.List;

import br.com.jp.tarefa3.config.DaoFactory;
import br.com.jp.tarefa3.dao.HospedeDao;
import br.com.jp.tarefa3.entities.Hospede;
import br.com.jp.tarefa3.exceptions.HospedeException;

public class HospedeBusiness {
    HospedeDao dao = new HospedeDao(DaoFactory.getEm());

    public List<Hospede> findAll() throws HospedeException {
        return dao.findAll();
    }

    public Hospede findById(Integer id) throws HospedeException {
        return dao.findById(id);
    }

    public Hospede insert(Hospede hospede) throws HospedeException {
        return dao.insert(hospede);
    }

    public Hospede update(Hospede hospede) throws HospedeException {
        return dao.update(hospede);
    }

    public void delete(Integer id) throws HospedeException {
        dao.delete(id);
    }
}

package br.com.jp.tarefa3.business;

import java.util.List;

import br.com.jp.tarefa3.config.DaoFactory;
import br.com.jp.tarefa3.dao.QuartoDao;
import br.com.jp.tarefa3.entities.Quarto;
import br.com.jp.tarefa3.exceptions.QuartoException;

public class QuartoBusiness {
    
    QuartoDao dao = new QuartoDao(DaoFactory.getEm());

    public List<Quarto> findAll() throws QuartoException {
        return dao.findAll();
    }

    public Quarto findById(Integer id) throws QuartoException {
        return dao.findById(id);
    }

    public Quarto insert(Quarto quarto) throws QuartoException {
        return dao.insert(quarto);
    }

    public Quarto update(Quarto quarto) throws QuartoException {
        return dao.update(quarto);
    }

    public void delete(Integer id) throws QuartoException {
        dao.delete(id);
    }
}

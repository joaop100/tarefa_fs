package br.com.jp.tarefa3.business;

import java.util.List;

import br.com.jp.tarefa3.config.DaoFactory;
import br.com.jp.tarefa3.dao.HotelDao;
import br.com.jp.tarefa3.entities.Hotel;
import br.com.jp.tarefa3.exceptions.HotelException;

public class HotelBusiness {

    HotelDao dao = new HotelDao(DaoFactory.getEm());

    public List<Hotel> findAll() throws HotelException {
        return dao.findAll();
    }

    public Hotel findById(Integer id) throws HotelException {
        return dao.findById(id);
    }

    public Hotel insert(Hotel hotel) throws HotelException {
        return dao.insert(hotel);
    }

    public Hotel update(Hotel hotel) throws HotelException {
        return dao.update(hotel);
    }

    public void delete(Integer id) throws HotelException {
        dao.delete(id);
    }
}

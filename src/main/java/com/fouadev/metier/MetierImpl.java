package com.fouadev.metier;

import com.fouadev.dao.DaoImpl;
import com.fouadev.dao.IDao;
import com.fouadev.ext.DaoImplV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    @Autowired
    private IDao dao;

    public MetierImpl(@Qualifier("dao") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res=tmp*23;
        return res;
    }

    /*
    Injecter dans la variable dao un objet
    d'une classe qui implemete l'interface IDao
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

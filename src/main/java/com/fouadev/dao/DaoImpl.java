package com.fouadev.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Version de la base donnees");
        double temp = 25;
        return temp;
    }
}

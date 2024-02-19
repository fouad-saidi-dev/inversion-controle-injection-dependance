package com.fouadev.ext;

import com.fouadev.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double t = 35;
        return t;
    }
}

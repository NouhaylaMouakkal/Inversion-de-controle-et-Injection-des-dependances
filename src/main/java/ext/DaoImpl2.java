package ext;

import ma.enset.dao.IDao;

import java.util.Date;

public class DaoImpl2 implements IDao {

    @Override
    public Date getDate() {
        System.out.println("Version Capteurs");
        return new Date();
    }
}

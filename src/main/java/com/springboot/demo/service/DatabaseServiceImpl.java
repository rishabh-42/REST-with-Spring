package service;

import com.springboot.demo.entity.DataBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseServiceImpl implements DatabaseService {
    @Autowired
    private DataBase database;
    Logger logger= LoggerFactory.getLogger(DatabaseService.class);
    public String getDataBaseConfig()
    {
        //Question6
        logger.info(".......In studentService.getDataBaseConfig method.........");
        return database.getName()+" "+database.getPort();
    }
}

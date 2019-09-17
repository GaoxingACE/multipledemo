package cn.edu.usst.gaoxing.config;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.io.*;


/*
 *@ClassName DataConfig
 *@Author GaoXilong
 *@Date 2019/8/30 16:36
 */
public class DataConfig {

    public  void getDataSource() throws IOException {
        String dir="F:\\own-example\\multipledemo\\.\\web\\target\\classes\\application.properties";
        Reader reader=new FileReader(dir);
        BufferedReader bf=new BufferedReader(reader);
        String con;
        while((con=bf.readLine())!=null){
            System.out.println(con);
        }
        reader.close();
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder =new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(reader);
        Configuration configuration=sqlSessionFactory.getConfiguration();
        System.out.println(configuration.getDatabaseId());
    }

    public static void main(String[] args) throws IOException {

    }
}

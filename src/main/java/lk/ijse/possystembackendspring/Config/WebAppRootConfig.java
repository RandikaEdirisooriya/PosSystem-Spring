package lk.ijse.possystembackendspring.Config;

import jakarta.persistence.EntityManagerFactory;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration

/*@EnableJpaRepositories(basePackages = "lk.ijse.springday3.dao")*/
@EnableTransactionManagement
@ComponentScan(basePackages = "lk.ijse")
public class WebAppRootConfig {
/*
*//*oni database ek set karaganne meken*//*
        @Bean
        public DataSource dataSource() {


           var dbms= new DriverManagerDataSource();
           dbms.setDriverClassName("com.mysql.cj.jdbc.Driver");
           dbms.setUrl("jdbc:mysql://localhost:3306/notecollection?createDatabaseIfNotExist=true");
           dbms.setUsername("root");
           dbms.setPassword("1234");
           return dbms;
        }
*//*
ORM sambanda configuration thamai methana thiyennee
*//*
        @Bean
        public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

            HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
            vendorAdapter.setGenerateDdl(true);

            LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
            factory.setJpaVendorAdapter(vendorAdapter);
            factory.setPackagesToScan("lk.ijse.springday3.Entity");
            factory.setDataSource(dataSource());
            return factory;
        }
*//**//*
        @Bean
        public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {

            JpaTransactionManager txManager = new JpaTransactionManager();
            txManager.setEntityManagerFactory(entityManagerFactory);
            return txManager;
        }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }*/
    }


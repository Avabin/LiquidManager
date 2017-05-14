package tk.totalapoc.config

import javax.sql.DataSource

import org.hibernate.SessionFactory
import org.hibernate.cfg.AvailableSettings
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.jdbc.datasource.DriverManagerDataSource
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder

/**
  * Created by Avabin on 13.05.2017.
  */
@Configuration
class HibernateConfig {
  @Autowired
  @Bean def getSessionFactory(dataSource: DataSource): SessionFactory = {
    val sessionBuilder: LocalSessionFactoryBuilder = new LocalSessionFactoryBuilder(dataSource)
    sessionBuilder scanPackages "tk.totalapoc.beans.entities"
    sessionBuilder setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect")
    sessionBuilder setProperty(AvailableSettings.USE_NEW_ID_GENERATOR_MAPPINGS, "false")
    sessionBuilder setProperty(AvailableSettings.HBM2DDL_AUTO, "update")
    sessionBuilder buildSessionFactory()
  }

  @Bean def getDataSource: DataSource = {
    var dataSource: DriverManagerDataSource = new DriverManagerDataSource()
    dataSource setDriverClassName "org.postgresql.Driver"
    dataSource setUrl sys.env("DATABASE_URL_T")
    dataSource setUsername sys.env("DATABASE_USERNAME")
    dataSource setPassword sys.env("DATABASE_PASSWORD")
    dataSource
  }

}

package tk.totalapoc.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.{ViewControllerRegistry, WebMvcConfigurerAdapter}

/**
  * Created by Avabin on 14.05.2017.
  */
@Configuration
class MvcConfig extends WebMvcConfigurerAdapter{

  override def addViewControllers(registry: ViewControllerRegistry): Unit = {
    registry addViewController "/home" setViewName "home"
    registry addViewController "/" setViewName "home"
    registry addViewController "/login" setViewName "login"
    registry addViewController "/ping" setViewName "ping"
  }

}

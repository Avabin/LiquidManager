package tk.totalapoc

import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import tk.totalapoc.config.LiquidManagerConfig

object LiquidManagerApplication extends App{
  SpringApplication run classOf[LiquidManagerConfig]
  var ctx = new AnnotationConfigApplicationContext(classOf[LiquidManagerConfig])
}

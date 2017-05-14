package tk.totalapoc

import lombok.extern.java.Log
import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import tk.totalapoc.beans.TestClass
import tk.totalapoc.config.LiquidManagerConfig

@Log
object LiquidManagerApplication extends App{
  SpringApplication run classOf[LiquidManagerConfig]
  var ctx = new AnnotationConfigApplicationContext(classOf[LiquidManagerConfig])
  var test = ctx getBean classOf[TestClass]
  println(test.msg())
  test.fooClass testThat()
}

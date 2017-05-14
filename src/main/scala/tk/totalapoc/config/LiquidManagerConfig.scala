package tk.totalapoc.config

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{Bean, ComponentScan, Configuration}
import tk.totalapoc.beans.{Foo, RestAuthenticationEntryPoint, TestClass}

/**
  * Created by Avabin on 13.05.2017.
  */
@Configuration
@EnableAutoConfiguration
@ComponentScan
class LiquidManagerConfig {
  @Bean def getTest: TestClass = { new TestClass }
  @Bean def getFoo: Foo = { new Foo }
  @Bean def getRestAuthenticationEntryPoint: RestAuthenticationEntryPoint = {new RestAuthenticationEntryPoint}
}
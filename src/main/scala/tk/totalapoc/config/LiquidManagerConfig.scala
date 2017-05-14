package tk.totalapoc.config

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import tk.totalapoc.beans.RestAuthenticationEntryPoint

/**
  * Created by Avabin on 13.05.2017.
  */
@Configuration
@EnableAutoConfiguration
@ComponentScan
class LiquidManagerConfig {
  @Bean def getRestAuthenticationEntryPoint: RestAuthenticationEntryPoint = {new RestAuthenticationEntryPoint}
}
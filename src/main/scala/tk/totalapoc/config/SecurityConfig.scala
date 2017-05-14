package tk.totalapoc.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.{EnableWebSecurity, WebSecurityConfigurerAdapter}
import tk.totalapoc.beans.RestAuthenticationEntryPoint

/**
  * Created by Avabin on 14.05.2017.
  */
@Configuration
@EnableWebSecurity
class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  var restAuthenticationEntryPoint: RestAuthenticationEntryPoint = _

  override def configure(http: HttpSecurity): Unit = {
    http
      .authorizeRequests()
      .antMatchers("/", "/home", "/ping").permitAll()
      .anyRequest().authenticated()
      .and()
      .formLogin()
      .loginPage("/login")
      .permitAll()
      .and()
      .logout()
      .permitAll();
  }
  def configureGlobal(auth: AuthenticationManagerBuilder): Unit = {
    auth inMemoryAuthentication() withUser "Avabin" password "Pass123" roles "ADMIN"
  }

}

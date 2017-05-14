package tk.totalapoc.beans

import javax.servlet.http.{HttpServletRequest, HttpServletResponse}

import org.springframework.security.core.AuthenticationException
import org.springframework.security.web.AuthenticationEntryPoint
import org.springframework.stereotype.Component

/**
  * Created by Avabin on 14.05.2017.
  */
@Component
class RestAuthenticationEntryPoint extends AuthenticationEntryPoint{
  override def commence(request: HttpServletRequest,
                        response: HttpServletResponse,
                        authException: AuthenticationException):
  Unit = {response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "User Unauthorized")}

}

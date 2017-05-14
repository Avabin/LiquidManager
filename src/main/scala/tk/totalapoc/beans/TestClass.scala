package tk.totalapoc.beans

import org.springframework.beans.factory.annotation.Autowired

/**
  * Created by Avabin on 13.05.2017.
  */
class TestClass(){
  @Autowired
  var fooClass: Foo = _
  val test: String = "Test"
  def msg(): String = {
    "hello"
  }
}

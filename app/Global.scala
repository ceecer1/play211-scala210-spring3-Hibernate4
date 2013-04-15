import play._;

import org.springframework.context._;
import org.springframework.context.support._;

class Global extends GlobalSettings {
  
  private var ctx: ApplicationContext = _

  override def onStart(app: Application) {
    ctx = new ClassPathXmlApplicationContext("spring-context-data.xml")
  }  
  
  override def getControllerInstance[A](clazz: Class[A]) : A = {
    ctx.getBean(clazz).asInstanceOf[A]
  }
  
}
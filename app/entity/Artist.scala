package entity
import reflect.BeanProperty
import javax.persistence._
import scala.annotation.target.field
@Entity
class Artist {
  @(Id @field) @(GeneratedValue @field) @BeanProperty
  var id: Long = 0
  @BeanProperty
  var name: String = ""
  @BeanProperty
  var rollno: Long = 0
  @BeanProperty
  var songNumber: Long = 0
}

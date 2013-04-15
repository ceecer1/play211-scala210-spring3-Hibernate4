package daoImpl

import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.hibernate.{Session, SessionFactory}
import java.util.{List => JList }
import entity.Artist
import dao.ArtistDao

@Repository
class ArtistDaoImpl extends ArtistDao {
  
  @Autowired
  private var sessionFactory: SessionFactory = _
    
  @Transactional
  def save(artist: Artist): Long = currentSession.save(artist).asInstanceOf[Long]
        
  @Transactional(readOnly = true)
  def findAll: JList[Artist] = currentSession.createCriteria(classOf[Artist]).
    list().asInstanceOf[JList[Artist]]
  
  private def currentSession = sessionFactory.getCurrentSession
}
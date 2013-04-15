package serviceImpl

import org.springframework.beans.factory.annotation.Autowired
import java.util.{List => JList }
import entity.Artist
import dao.ArtistDao
import service.ArtistService

@org.springframework.stereotype.Service
class ArtistServiceImpl extends ArtistService{
  
  @Autowired
  private var artistDAO: ArtistDao = _
  
  def findAll: JList[Artist] = artistDAO.findAll
  
  def save(artist: Artist): Long = artistDAO.save(artist)

}
package controllers

import play.api._
import play.api.mvc._
import entity.Artist
import play.api.libs.json.JsObject
import play.api.libs.json.JsNumber
import play.api.libs.json.JsString
import org.springframework.beans.factory.annotation.Autowired
import play.api.libs.json.Json.toJson
import service.ArtistService

@org.springframework.stereotype.Controller
class Application extends Controller {
  
  @Autowired
  private var artistService: ArtistService = _
  
  def index = Action {
    val mylist = artistService.findAll
    import collection.JavaConversions._
    val typList = mylist.toList.asInstanceOf[List[Artist]]
    Ok(toJson(renderArticleJson(typList)))
//    Ok(views.html.index("Your new application is ready."))
  }
  
//  def getAllArtists = Action {
    	
//    Ok(toJson(renderArticleJson(mylist)))
//  }
  private def renderArticleJson(artists: Iterable[Artist]): Iterable[JsObject] = {
	  val listToConvert = for (artist <- artists) yield {
	    JsObject(Seq(
	    "id" -> JsNumber(artist.id),
	    "firstName" -> JsString(artist.name),
	    "lastName" -> JsNumber(artist.playCount),
	    "email" -> JsNumber(artist.listeners)
		))
	  }
//	 logger.info("The converted *********** " + listToConvert)
	 listToConvert
  }
  
}
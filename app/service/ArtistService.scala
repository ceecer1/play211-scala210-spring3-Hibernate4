package service

import java.util.{List => JList }
import entity.Artist

trait ArtistService {
  def findAll: JList[Artist]
  def save(artist: Artist): Long
}
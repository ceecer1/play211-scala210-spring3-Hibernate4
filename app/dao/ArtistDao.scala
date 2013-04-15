package dao

import java.util.{List => JList }
import entity.Artist

trait ArtistDao {
  def findAll: JList[Artist]
  def save(artist: Artist): Long
}
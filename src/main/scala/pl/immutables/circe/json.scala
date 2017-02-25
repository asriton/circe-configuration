package pl.immutables.circe

import pl.immutables.circe._
import pl.immutables.circe.json.codecs._
import java.time._
import io.circe.syntax._
import io.circe.parser._

object CirceConfiguration extends App {
  val movie = Movie("Coherence", Drama, List(
    RemoteReview(Some("http://www.imdb.com/title/tt2866360/reviews?ref_=tt_ov_rt"), 9),
    UserReview(UserId("ab38d19dj"), "Absolutely brilliant", 10)
  ), LocalDate.of(2014, 8, 6))

  val encoded = movie.asJson.spaces2
  val decoded = decode[Movie](encoded)

  println(s"Encoded: $encoded")
  println(s"Decoded: $decoded")
  assert(movie == decoded.right.get)
}

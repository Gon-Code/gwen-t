package cl.uchile.dcc
package gwent

import gwent.cards.WeatherCard
import munit.FunSuite

/** A testing class for the Weather Cards 
 * 
 */

class WeatherCardTest extends FunSuite {
  val weather : WeatherCard = new WeatherCard("Storm","Reduce the attack of all the troops by 2")

  test("We can create Weather Cards"){
    assertEquals(weather.name,"Storm")
    assertEquals(weather.description,"Reduce the attack of all the troops by 2")
  }

}

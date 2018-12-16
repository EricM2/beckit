package app.beckit.util

import scala.util.Random

object Generateur {

  def genererChaine(longueur : Int): String ={
    var init = 0
    val sb = new StringBuilder()
    while(init < longueur){
      sb.append(Lettre.lettres((new Random()).nextInt(26)).toString)
      init+=1
    }
    sb.toString()
  }

}

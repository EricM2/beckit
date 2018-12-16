package beckit.algorithme.csv

import java.util.Random

import app.beckit.framework.Cathegorie
import app.beckit.framework.Cathegorie.Cathegorie
import app.beckit.util.Lettre
import beckit.framework.Condition

class ConditionType(cathegorie : Cathegorie) extends Condition {
  override def appliquer(indice: Int, valeur: String): String = {
    val rnd = new Random
    cathegorie match{
      case  Cathegorie.lettre => valeur.replace(valeur.charAt(indice), Lettre.lettres(rnd.nextInt(26)).toString.charAt(0))
      case Cathegorie.nombre => valeur.replace(valeur.charAt(indice),rnd.nextInt(9).toString.charAt(0))
      case _=> throw new Exception("Specifier la Cathegorie lettre ou nombre ")
    }

  }
}

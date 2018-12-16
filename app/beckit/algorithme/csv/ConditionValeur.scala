package beckit.algorithme.csv

import beckit.framework.Condition

class ConditionValeur(newVal: Char) extends Condition {
  override def appliquer(indice: Int, valeur: String): String = {
    valeur.replace(valeur.charAt(indice),newVal)
  }
}

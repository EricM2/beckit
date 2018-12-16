package beckit.framework

import app.beckit.model.Colonne

abstract class Validateur {

  def valider(col : Colonne, valeur : String):String ={
    val conditions = col.conditions.getOrElse(List(new Condition {
      override def appliquer(indice: Int, valeur: String): String = ???
    }))


    conditions.foreach(_.appliquer())
  }


}

package app.beckit.algorithme.csv

import app.beckit.model.Colonne
import app.beckit.util.Generateur

object GenerateurCSV {

  def generer(colonnes: List[Colonne]): Unit ={
    val validateur = new CsvValidator()

    colonnes.map(colonne =>{
      val len = if(colonne.longueur.getOrElse(0)>0) colonne.longueur.get else 10
      val v = Generateur.genererChaine(len)
      val res = validateur.valider(colonne,v)
      println(res)
    })
  }

}

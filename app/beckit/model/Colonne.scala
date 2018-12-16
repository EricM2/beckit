package app.beckit.model

import beckit.framework.Condition
import org.apache.spark.rdd.RDD

case class Colonne (
                     nom : String,
                     description: Option[String]=None,
                     valeurs : Option[RDD[Map[String,List[String]]]]= None,
                     longueur : Option[Int] = None,
                     conditions : Option[List[Condition]] = None
                   )



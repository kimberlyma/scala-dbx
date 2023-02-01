package com.databricks.example

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession

object Test {
    val spark = SparkSession.builder.getOrCreate()
    def func(x: Int, y: Int) : Unit = {
        println(s"The answer is ${x * y}")
    }

    def main(args: Array[String]) = {
    println("Hello, World!")
  }
}

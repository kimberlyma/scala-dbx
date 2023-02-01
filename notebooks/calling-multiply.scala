// Databricks notebook source
// MAGIC %md
// MAGIC
// MAGIC # Sample notebook

// COMMAND ----------

// MAGIC %sql
// MAGIC CREATE TABLE uc_demos_kimberly_mahoney.default.parq2 (key STRING, group STRING, value INT)
// MAGIC USING PARQUET
// MAGIC LOCATION 's3://databricks-kmahoney-uc/parq2/';


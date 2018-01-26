// Databricks notebook source
spark.conf.set("dfs.adls.oauth2.access.token.provider.type", "ClientCredential")
spark.conf.set("dfs.adls.oauth2.client.id", "47939dd7-a374-45f9-aa5d-bd6f71b6fbfa")
spark.conf.set("dfs.adls.oauth2.credential", "")
spark.conf.set("dfs.adls.oauth2.refresh.url", "https://login.microsoftonline.com/microsoft.onmicrosoft.com/oauth2/token")


// COMMAND ----------

val df = spark.read.csv("adl://dlstoreergullbr.azuredatalakestore.net/test/Imed2011.csv")
dbutils.fs.ls("adl://dlstoreergullbr.azuredatalakestore.net/test/Imed2011.csv")
//val df = spark.read.parquet("adl://dlstoreergullbr.azuredatalakestore.net/output/hiveergullbr/example/data/people.seq")
//dbutils.fs.ls("adl://dlstoreergullbr.azuredatalakestore.net/output/hiveergullbr/example/data/people.seq")
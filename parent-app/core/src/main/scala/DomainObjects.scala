package com.myapp.core.model

/**
  * Created by afssh on 06-03-2016.
  */


  case class Customber(custId:Int,custNum:String,custName:String,custEmail:String,custPhone:String)
  case class Address(addrId:String,addrLine1:String,addrLine2:String,addrZip:Int,addrCountry:String);

/*
database = {
  url = "jdbc:mysql://localhost/test"
  user = "user"
  password = "pwd"
  driver = com.mysql.jdbc.Driver
  connectionPool = disabled
  keepAliveConnection = true
}
*/


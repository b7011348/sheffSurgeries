package com.GNocivelli

class Receptionist {
  //initialize varibles
  String recepName
  String recepEmail
  String recepUsername
  String recepPassword
  int recepPhone
    static constraints = {
      //initialize constraints
      recepName nullable:false, blank:false
      recepEmail nullable:false, blank:false, email: true
      recepUsername nullable:false, blank:false
      recepPassword nullable:false, blank:false
      recepPhone nullable:false, blank:false
    }
}

package com.GNocivelli

class Prescription {
  //initialize varibles
  String pharamacyName
  int prescripNumber
  String medicine
  double totalCost
  Date dateIssued
  Boolean patientPaying
    static constraints = {
      pharamacyName nullable:false, blank:false
      prescripNumber nullable:false, blank:false
      medicine nullable:false, blank:false
      totalCost nullable:false, blank:false
      dateIssued nullable:false, blank:false
      patientPaying nullable:false, blank:false     
    }
}

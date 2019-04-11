package com.GNocivelli

class Prescription {
  //initialize varibles
  String pharamacyName
  int prescripNumber
  String medicine
  String totalCost
  Date dateIssued
  int daysSupply
  Boolean patientPaying

  //links to other domains
  Doctor theDoctor
  Patient thePatient
  
    static constraints = {
      //initialize constraints
      pharamacyName nullable:false, blank:false
      prescripNumber nullable:false, blank:false
      medicine nullable:false, blank:false
      totalCost nullable:false, blank:false
      dateIssued nullable:false, blank:false
      patientPaying nullable:false, blank:false
      daysSupply nullable:false, blank:false
    }
}

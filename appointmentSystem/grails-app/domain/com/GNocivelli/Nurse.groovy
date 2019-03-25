package com.GNocivelli

class Nurse {
  //initialize varibles
  String nurseName
  String qualifications
  String nurseEmail
  String nurseOffice
  int nursePhone

    static constraints = {
      //initialize constraints
      nurseName nullable:false, blank:false
      qualifications nullable:false, blank:false
      nurseEmail nullable:false, blank:false, email: true
      nurseOffice nullable:false, blank:false, size: 5..5
      nursePhone nullable:false, blank:false
    }
}

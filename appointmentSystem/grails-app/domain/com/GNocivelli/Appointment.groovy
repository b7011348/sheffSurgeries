package com.GNocivelli

class Appointment {
  //initialize varibles
  Date appDate
  String appTime
  int appDuration
  String roomNumber

  //links to other domains
  Patient thePatient
  Doctor theDoctor
  Surgery theSurgery

    static constraints = {
      //initialize constraints
      appDate nullable:false, blank:false
      appTime nullable:false, blank:false
      appDuration nullable:false, blank:false
      roomNumber nullable:false, blank:false, size: 6..6

    }
}

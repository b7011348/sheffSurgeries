package com.GNocivelli

class Surgery {
  //initialize varibles
  String name
  String address
  String postcode
  String telephone
  int numberOfPatients
  String description
  String openingTime
  Boolean registeringNewPatient

  //links to other domains
  static belongsTo=Appointment
  static hasMany=[nurses: Nurse, doctors: Doctor, receptionists: Receptionist, patients: Patient]

    static constraints = {
      //initialize constraints
      name nullable:false, blank:false
      address nullable:false, blank:false
      postcode nullable:false, blank:false
      telephone nullable:false, blank:false, size: 9..11
      numberOfPatients nullable:false, blank:false , max: 50
      description nullable:false, blank:false, maxSize:5000, widget: 'textarea'
      openingTime nullable:false, blank:false
      registeringNewPatient nullable:false, blank:false
    }
}

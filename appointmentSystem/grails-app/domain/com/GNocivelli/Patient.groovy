package com.GNocivelli

class Patient {
  //initialize varibles
  String patientName
  String patientAdress
  String patientResidence
  Date patientDob
  String patientID
  Date dateRegistered
  String patientPhone

  //links to other domains
  Appointment appointment
  static hasMany=[surgeries: Surgery, prescriptions: Prescription, doctors: Doctor]

    static constraints = {
      //initialize constraints
      patientName nullable:false, blank:false
      patientAdress nullable:false, blank:false
      patientResidence nullable:false, blank:false
      patientDob nullable:false, blank:false
      patientID nullable:false, blank:false, unique: true
      dateRegistered nullable:false, blank:false
      patientPhone nullable:false, blank:false, size: 9..11
    }
}

package com.GNocivelli

class BootStrap {

    def init = { servletContext ->
      def TomsSurgery = new Surgery(
        name: 'City Health Centre',
        address: '21 Marble Street, Sheffield',
        postcode: 'S11 5TY',
        telephone: '0114555555',
        numberOfPatients: 50,
        description: 'This surgery is known as Tonderai visits frequently for vodka bottles, Ruski',
        openingTime: '09:00-17:00hrs'
        ).save()

      def RKing = new Receptionist (
        recepName: 'Rob Kingston',
        recepEmail: 'r.kingston@email.com',
        recepUsername: 'rking',
        recepPassword: 'secret2019',
        recepPhone: '01142224445'
        ).save()

      def SarahMac = new Doctor (
        fullName: 'Dr Sarah Macdonald',
        qualification: 'MBChB(Sheffield)',
        position: 'Gp,Surgeon',
        doctorEmail: 's.macdonald@myemail.com',
        password: 'secret222',
        doctorOffice: 'D-9888',
        doctorPhone: '01111777',
        bio: 'Sarah is second top heart surgeon in the country, second to Tonderai'
        ).save()

        def TomRivers = new Patient (
          patientName: 'Tom Rivers',
          patientAdress: '2 One Way Street, Eckington',
          patientResidence: 'Barnsley',
          patientDob: new Date ('20/09/1988'),
          patientID: 'E25555',
          dateRegistered: new Date ('26/02/2018'),
          patientPhone: '01142224444'
          ).save()

        def Speter = new Nurse (
          nurseName: 'Suasan Peters',
          qualification: 'Registered Genral Nurse',
          nurseEmail: 's.peters@myemail.com',
          nurseOffice: 'B-455',
          nursePhone: '01142224433'
          ).save()

        def  ParacetomolTom = new Prescription (
          pharamacyName: 'City Centre Pharamacy',
          prescripNumber: 56788,
          medicine: 'Paracetomol',
          totalCost: '£5.90',
          dateIssued: new Date ('25/05/2019')
          ).save()

          def AppointmentTom = new Appointment(
            appDate: new Date ('11/04/2019'),
            appTime: '3:00pm',
            appDuration: '45',
            roomNumber: 'A-1111'
            ).save()
      }
    def destroy = {
    }
}

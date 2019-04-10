package com.GNocivelli

class BootStrap {

    def init = { servletContext ->
      def RKing = new Receptionist (
        recepName: 'Rob Kingston',
        recepEmail: 'r.kingston@email.com',
        recepUsername: 'rking',
        recepPassword: 'secret2019',
        recepPhone: '01142224445'
        ).save()

        def TOlatungi = new Receptionist (
          recepName: 'Tyrone Olatungi',
          recepEmail: 'T.Olatungi@email.com',
          recepUsername: 'TOlatungi',
          recepPassword: 'Password123',
          recepPhone: '01145726832'
          ).save()

      def  ParacetomolTom = new Prescription (
        pharamacyName: 'City Centre Pharamacy',
        prescripNumber: 56788,
        medicine: 'Paracetomol',
        totalCost: '£5.90',
        dateIssued: new Date ('25/03/2019'),
        daysSupply: 5,
        patientPaying: true
        ).save()

        def  PenacillinTyrese = new Prescription (
          pharamacyName : 'City Centre Pharamacy',
          prescripNumber: 56789,
          medicine: 'Penacillin',
          totalCost: '£5.90',
          dateIssued: new Date ('26/03/2019'),
          daysSupply: 5,
          patientPaying: true
          ).save()

      def CitySurgery = new Surgery(
        name: 'City Health Centre',
        address: '21 Marble Street, Sheffield',
        postcode: 'S11 5TY',
        telephone: '0114555555',
        numberOfPatients: 50,
        description: 'This surgery is known as Tonderai visits frequently for vodka bottles, Ruski',
        openingTime: '09:00-17:00hrs',
        registeringNewPatient: true
        )
        .save()

        def DroneSurgery = new Surgery(
          name: 'Dronefield Health Centre',
          address: '21 croock Street, Sheffield',
          postcode: 'S31 7TY',
          telephone: '01146777777',
          numberOfPatients: 180,
          description: 'This surgery is the main place Tonderai goes for his stomach pumped after a night out with the russian mob',
          openingTime: '08:30-19:00hrs',
          registeringNewPatient: true
          )
          .save()

      def SkengDo = new Doctor (
        fullName: 'Dr Skeng donatchy',
        qualification: 'MBChB(London)',
        position: 'Gp,Surgeon',
        doctorEmail: 's.macdonald@myemail.com',
        password: 'secret222',
        doctorOffice: 'D-9888',
        doctorPhone: '01111777',
        bio: 'Sarah is second top heart surgeon in the country, second to Tonderai',
        theSurgery: CitySurgery
        ).save()

        def SarahMac = new Doctor (
          fullName: 'Dr Sarah Macdonald',
          qualification: 'MBChB(Sheffield)',
          position: 'Gp,Surgeon',
          doctorEmail: 's.macdonald@myemail.com',
          password: 'secret222',
          doctorOffice: 'D-9888',
          doctorPhone: '01111777',
          bio: 'Sarah is second top heart surgeon in the country, second to Tonderai',
          theSurgery: DroneSurgery
          )
          .save()


          def Speter = new Nurse (
            nurseName: 'Suasan Peters',
            qualification: 'Registered Genral Nurse',
            nurseEmail: 's.peters@myemail.com',
            nurseOffice: 'B-455',
            nursePhone: '01142224433',
            theNurse: CitySurgery
            ).save()

        def Umaswera = new Nurse (
          nurseName: 'Uzi Maswera',
          qualification: 'Registered Genral Nurse',
          nurseEmail: 'U.Maswera@myemail.com',
          nurseOffice: 'B-456',
          nursePhone: '01142341372',
          theNurse: DroneSurgery
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

      def TyreseTonderai = new Patient (
        patientName: 'Tyrese Tonderai',
        patientAdress: '78 putin Road, Dronefield',
        patientResidence: 'Sheffield',
        patientDob: new Date ('22/11/1966'),
        patientID: 'E25556',
        dateRegistered: new Date ('16/03/2018'),
        patientPhone: '02084467621'
        ).save()

        def AppointmentTom = new Appointment(
          appDate: new Date ('11/04/2019'),
          appTime: '3:00pm',
          appDuration: '45',
          roomNumber: 'A-1111',
          thePatient: TomRivers,
          theDoctor: SarahMac
          ).save()

        def AppointmentTyreese = new Appointment(
          appDate: new Date ('12/04/2019'),
          appTime: '6:00pm',
          appDuration: '45',
          roomNumber: 'A-1111',
          thePatient: TyreseTonderai,
          theDoctor: SarahMac
          ).save()







        /*
        SarahMac.addToPrescriptions(PenacillinTyrese)
        CitySurgery.addToReceptionists(TOlatungi).save()
        CitySurgery.addToPatients(TyreseTonderai).save()
        CitySurgery.addToNurses(Speter).save()
        CitySurgery.addToReceptionists(RKing).save()
        CitySurgery.addToPatients(TomRivers).save()
        CitySurgery.addToDoctors(SkengDo).save()
        SarahMac.addToPrescriptions(PenacillinTyrese).save()
        SarahMac.addToPrescriptions(ParacetomolTom).save()
        .save()*/
      }
    def destroy = {
    }
}

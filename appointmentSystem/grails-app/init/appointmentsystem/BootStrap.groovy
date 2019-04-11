package com.GNocivelli

class BootStrap {

    def init = { servletContext ->


        def TomRivers=new Patient (
          patientName: 'Tom Rivers',
          patientAdress: '2 One Way Street, Eckington',
          patientResidence: 'Barnsley',
          patientDob: new Date ('20/09/1988'),
          patientID: 'E25555',
          dateRegistered: new Date ('26/02/2018'),
          patientPhone: '01142224444'
          ).save()

        def TyreseTonderai=new Patient (
          patientName: 'Tyrese Tonderai',
          patientAdress: '78 putin Road, Dronefield',
          patientResidence: 'Sheffield',
          patientDob: new Date ('22/11/1966'),
          patientID: 'E25556',
          dateRegistered: new Date ('16/03/2018'),
          patientPhone: '02084467621'
          ).save()

        def CitySurgery=new Surgery(
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

          def DronefieldSurgery=new Surgery(
            name: 'Drone Health Centre',
            address: '31 Harold Street, Sheffield',
            postcode: 'S11 DTY',
            telephone: '0114777777',
            numberOfPatients: 50,
            description: 'This is the place Tonderai gets his russian mob money.',
            openingTime: '09:00-19:00hrs',
            registeringNewPatient: true
            )
            .save()

            def SkengDo=new Doctor(
              fullName: 'Dr Skeng donatchy',
              qualification: 'MBChB(London)',
              position: 'Gp,Surgeon',
              doctorEmail: 's.macdonald@myemail.com',
              password: 'secret222',
              doctorOffice: 'D-9888',
              doctorPhone: '01111777',
              bio: 'Sarah is second top heart surgeon in the country, second to Tonderai',
              theSurgery: CitySurgery
              )
              .save()

            def SarahMac=new Doctor(
              fullName: 'Dr Sarah Macdonald',
              qualification: 'MBChB(Sheffield)',
              position: 'Gp,Surgeon',
              doctorEmail: 's.macdonald@myemail.com',
              password: 'secret222',
              doctorOffice: 'D-9888',
              doctorPhone: '01111777',
              bio: 'Sarah is second top heart surgeon in the country, second to Tonderai',
              theSurgery: DronefieldSurgery
              )
              .save()

              def AppointmentTom=new Appointment(
                appDate: new Date ('11/04/2019'),
                appTime: '3:00pm',
                appDuration: '45',
                roomNumber: 'A-1111',
                thePatient: TomRivers,
                theDoctor: SkengDo,
                theSurgery: CitySurgery
                ).save()

              def AppointmentTyreese=new Appointment(
                appDate: new Date ('12/04/2019'),
                appTime: '6:00pm',
                appDuration: '45',
                roomNumber: 'A-1111',
                thePatient: TyreseTonderai,
                theDoctor: SarahMac,
                theSurgery: DronefieldSurgery
                ).save()

            def SPeter=new Nurse (
              nurseName: 'Suasan Peters',
              qualifications: 'Registered Genral Nurse',
              nurseEmail: 's.peters@myemail.com',
              nurseOffice: 'B-455',
              nursePhone: '01142224433',
              theSurgery: CitySurgery
              ).save()

            def Umaswera=new Nurse (
              nurseName: 'Uzi Maswera',
              qualifications: 'Registered Genral Nurse',
              nurseEmail: 'U.Maswera@myemail.com',
              nurseOffice: 'B-456',
              nursePhone: '01142341372',
              theSurgery: DronefieldSurgery
              ).save()

            def  ParacetomolTom=new Prescription(
              pharamacyName: 'City Centre Pharamacy',
              prescripNumber: 56788,
              medicine: 'Paracetomol',
              totalCost: '5.90',
              dateIssued: new Date ('25/03/2019'),
              daysSupply: 5,
              patientPaying: true,
              theDoctor: SkengDo,
              thePatient: TomRivers
              ).save()

            def  PenacillinTyrese=new Prescription (
              pharamacyName : 'City Centre Pharamacy',
              prescripNumber: 56789,
              medicine: 'Penacillin',
              totalCost: '£5.90',
              dateIssued: new Date ('26/03/2019'),
              daysSupply: 5,
              patientPaying: true,
              theDoctor: SarahMac,
              thePatient: TyreseTonderai
              ).save()

            def RKing=new Receptionist(
              recepName: 'Rob Kingston',
              recepEmail: 'r.kingston@email.com',
              recepUsername: 'rking',
              recepPassword: 'secret2019',
              recepPhone: '01142224445',
              theSurgery: DronefieldSurgery
              ).save()

            def TOlatungi=new Receptionist(
              recepName: 'Tyrone Olatungi',
              recepEmail: 'T.Olatungi@email.com',
              recepUsername: 'TOlatungi',
              recepPassword: 'Password123',
              recepPhone: '01145726832',
              theSurgery: CitySurgery
              ).save()

          CitySurgery.addToReceptionists(TOlatungi)
          CitySurgery.addToDoctors(SkengDo)
          CitySurgery.addToNurses(SPeter)
          CitySurgery.addToPatients(TomRivers)
          DronefieldSurgery.addToDoctors(SarahMac)
          DronefieldSurgery.addToNurses(Umaswera)
          DronefieldSurgery.addToReceptionists(RKing)
          DronefieldSurgery.addToPatients(TyreseTonderai)
          SarahMac.addToNurses(SPeter)
          SarahMac.addToPrescriptions(PenacillinTyrese)
          SarahMac.addToAppointments(AppointmentTyreese)
          SarahMac.addToPatients(TyreseTonderai)
          SkengDo.addToNurses(Umaswera)
          SkengDo.addToPrescriptions(ParacetomolTom)
          SkengDo.addToAppointments(AppointmentTom)
          SkengDo.addToPatients(TomRivers)
          CitySurgery.addToAppointments(AppointmentTom)
          DronefieldSurgery.addToAppointments(AppointmentTyreese)
          TomRivers.addToPrescriptions(ParacetomolTom)
          TyreseTonderai.addToPrescriptions(PenacillinTyrese)

          .save()
      }
    def destroy = {
    }
}

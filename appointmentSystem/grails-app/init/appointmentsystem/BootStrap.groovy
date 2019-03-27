package com.GNocivelli

class BootStrap {

    def init = { servletContext ->

    def RKing = new Receptionist (
    recepName: 'Rob Kingston',
    recepEmail: 'r.kingston@email.com',
    recepUsername: 'rking',
    recepPassword: 'secret2019',
    recepPhone: 01142224445
    ).save()
    }
    def destroy = {
    }
}

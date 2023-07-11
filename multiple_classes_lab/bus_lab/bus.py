class Bus:

    def __init__(self, route_number, destination):
        self.route_number = route_number
        self.destination = destination
        self.passengers = []

    
    def drive():
        return "Brum brum"
    
    def count_passengers_on_board(self):
        return '{} passenger(s) on this bus'.format(len(self.passengers))
    
    def board_passenger(self, passenger):
        self.passengers.append(passenger)
        return f"{passenger.name} boards the bus"

    def remove_passenger(self, passenger):
        self.passengers.remove(passenger)
        return 'We just dropped {} passenger(s)'.format(passenger.name)

    def empty(self):
        self.passengers.clear()

    def pick_up_from_stop(self, bus_stop):
        for person in bus_stop.que:
            if person not in self.passengers:
                self.passengers.append(person)
        bus_stop.remove_passengers()
    

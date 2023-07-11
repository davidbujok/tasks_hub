class BusStop:

    def __init__(self, name):
        self.name = name
        self.que = []

    def add_passenger(self, *passengers):
        for passenger in passengers:
            self.que.append(passenger)  

    def remove_passengers(self):
        self.que.clear()
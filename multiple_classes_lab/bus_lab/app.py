from person import Person
from bus import Bus
from bus_stop import BusStop
import time
import datetime
#new passenger
passenger_1 = Person('Batman', 4)
passenger_2 = Person('Robin', 3)
passenger_3 = Person('Superman', 5)
passenger_4 = Person('Hulk', 7)
passenger_5 = Person('Thor', 6)

#new bus
bus_1 = Bus(22, 'Ocean Terminal')
print(Bus.drive())

#board a passenger
print(bus_1.board_passenger(passenger_1))


# remove a passenger
print(bus_1.remove_passenger(passenger_1))


# create two bus stop
bus_stop_1 = BusStop('Some place')
bus_stop_2 = BusStop('A better place')

# add person to que on the bus stop
bus_stop_1.add_passenger(passenger_1, passenger_2, passenger_3)
bus_stop_2.add_passenger(passenger_4, passenger_5)
bus_1.pick_up_from_stop(bus_stop_1)
print(bus_1.passengers)
print(f"There is currently {len(bus_stop_1.que)} waiting on the bus stop")

# remove all passengers from the que
# bus_stop_1.remove_passengers()
# print(bus_stop_1.que)

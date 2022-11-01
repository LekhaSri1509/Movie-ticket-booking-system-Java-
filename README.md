# Movie-ticket-booking-system-Java-

The main objective of the online movie ticket booking system is to manage the booking and cancelling tickets, displaying a particular ticket detail,
exchanging seats in theatre, add a movie and displaying all movies. The purpose of the project is to build an application program to reduce the manual work.
This application is developed in Java using OOPS and inheritance concept.

FUNCTIONAL REQUIREMENTS:
1)	Book a ticket
2)	Cancel a ticket 
3)	Display particular ticket details
4)	Entering into the movie
5)	Exchange seats
6)	Add a movie
7)	Displaying all movies
8)	Exit


CLASSES IDENTIFIED:
1)	Movie 
2)	Customer
3)	Booking
4)	Payment
5)	Seats
6)	Shows


CLASS DIAGRAM:

![image](https://user-images.githubusercontent.com/117105114/199250768-1a21f09e-5f79-469e-9ec8-1398775d8382.png)

CLASS ATTRIBUTES:
1)	Movie Attributes: movie_id, movie_name, movie_language, movie_type, movie_hour, movie_description 

2)	Customer Attributes: customer_id, customer_name, customer_mobile, customer_email, customer_username, customer_password, customer_address

3)	Booking Attributes: booking_id, booking_title, booking_type, booking_ticket, booking_date, booking_description 

4)	Payment Attributes: payment_id, payment_customer_id, payment_date, payment_amount, payment_description 

5)	Seats Attributes: seat_id, seat_movie_id, seat_customer_id, seat_number, seat_type, seat_description 

6)	Shows Attributes: show_id, show_name, show_type, show_time, show_date, show_description 

CLASSES AND THEIR METHODS:

1)	Movie Methods: addMovie(), editMovie()delete Movie(), update Movie(), saveMovie(), search Movie()

2)	 Customer Methods: addCustomer(), editCustomer(), delete Customer(), updateCustomer(), saveCustomer(), searchCustomer() 

3)	Booking Methods: addBooking(), editBooking(), deleteBooking(), updateBooking()saveBooking(), searchBooking() 

4)	Payment Methods: addPayment(), editPayment()deletePayment(), updatePayment(), savePayment(), searchPayment() 

5)	Seats Methods: addSeats()editSeats()delete Seats(), updateSeats(), save Seats(), search Seats() 

6)	Shows Methods: addShows(), editShows(), delete Shows(), updateShows(), saveShows(), searchShows() .

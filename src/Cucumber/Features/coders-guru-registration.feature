Feature: New Coders Guru user
  Scenario Outline: User registration in Coders Guru
  Given The user is on the main page https://tester.codersguru.pl
  When Go to user registration
  And Enter <E-mail> in the form field <Firstname> <Surname> <Password> <Password> <City> <Postcode> <Street> <House/apartment number>
  And sending him
  Then private user has been successfully registered


  Examples:

  | E-mail		   | Firstname | Surname    | Password | City    | Postcode	 | Street	    | House/apartment number
  | test1@gmail.com| Ania 	   | Kowalska   | test123  | Wroclaw | 50-457 	 | Raclawicka	|10/7
  | test2@gmail.com| Kasia     | Marciniak  | test     | Krakow  | 20-114    | Kwiatowa	    |24a/4
  | test3@gmail.com| Marcin    | Tomaszewski| Ghjy3    | Warszawa| 47-587    | Spizowa	    |8

Feature: New Coders Guru user
  Scenario Outline: User registration in Coders Guru
  Given The user is on the main page https://tester.codersguru.pl
  When Go to user registration
  And Enter in the form field  <E-mail> <Firstname> <Surname> <Password> <SecondPassword> <City> <Postcode> <Street> <Number>
  And sending him
  Then private user has been successfully registered


  Examples:

  | E-mail		    | Firstname | Surname    | Password | SecondPassword|City    | Postcode   | Street	        | Number|
  | test7@gmail.com | Ania 	| Kowalska   | test123  | test123       |Wroclaw | 50-457 	  | Raclawicka	    |10/7   |
  | test8@gmail.com | Kasia    | Marciniak  | test75   | test75        |Krakow  | 20-114     | Kwiatowa	    |24a/4  |
  | test9@gmail.com | Marcin   | Tomaszewski| Ghjy3    | Ghjy3         |Warszawa| 47-587     | Spizowa	        |8      |

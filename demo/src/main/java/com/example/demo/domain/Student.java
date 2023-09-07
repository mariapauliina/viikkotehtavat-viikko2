package com.example.demo.domain;

public class Student {
//muuttujat
public String firstName, lastName;

	

public Student(String firstName, String lastName) { // konstruktiori joka vastaan ottaa parametrit
	
	this.firstName = firstName; //'this.' erottelee jäsenmuuttujat
	this.lastName = lastName;
}



public void setFirstName(String firstName) { //mahdollistetaan etunimen muuttaminen
	this.firstName = firstName;
}



public void setLastName(String lastName) {//mahdollistetaan etunimen muuttaminen
	this.lastName = lastName;
}



public String getFirstName() {
	return firstName;
}



public String getLastName() {
	return lastName;
}



@Override
public String toString() {
	return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";//Tämä metodi palauttaa merkkijonon, joka kuvaa olion tilaa.
}//Tämä antaa mahdollisuuden tulostaa opiskelija-olion tiedot helposti ymmärrettävässä muodossa ilman tarvetta käsikirjoittaa merkkijonoa joka kerta, kun tarvitaan opiskelija-olion esitys.
}

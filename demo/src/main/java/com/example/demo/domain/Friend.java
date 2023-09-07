package com.example.demo.domain;

public class Friend {

public String name;

//public Friend(String name) {
	//super();
	//this.name = name;
//}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Friend [name=" + name + "]";
}


	

}

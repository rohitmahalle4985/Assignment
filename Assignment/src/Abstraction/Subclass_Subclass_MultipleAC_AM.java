package Abstraction;

  class Subclass_Subclass_MultipleAC_AM extends Subclass_MultipleAC_AM  {
	
	  String name,gender,city,country;
	  void getName(String name)
	  {
		  this.name=name;
	  }
	  void getGender(String gender)
	  {
		  this.gender=gender;
		  
	  }
	  void getCity(String city)
	  {
		  this.city=city;
	  }
	  void getCountry(String country)
	  {
		  this.country=country;
	  }
	  void display()
	  {
		  System.out.println("Name:--"+name);
		  System.out.println("Gender:--"+gender);
		  System.out.println("City:--"+city);
		  System.out.println("Country:--"+country);
		  
	  }

}

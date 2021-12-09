package Day6;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Event {
  String name;
  String details;
  String Type;
  String ownername;
  double costPerDay;
  
  Event()
  {
      
  }
  Event(String name, String details,String Type,String ownername,double costPerDay)
  {
      this.name = name;
      this.details = details;
      this.Type = Type;
      this.ownername = ownername;
      this.costPerDay = costPerDay;
      
  }
  
  
  public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getDetails() {
    return details;
}
public void setDetails(String details) {
    this.details = details;
}
public String getType() {
    return Type;
}
public void setType(String type) {
    Type = type;
}
public String getOwnername() {
    return ownername;
}
public void setOwnername(String ownername) {
    this.ownername = ownername;
}
public double getCostPerDay() {
    return costPerDay;
}
public void setCostPerDay(double costPerDay) {
    this.costPerDay = costPerDay;
}
}

 

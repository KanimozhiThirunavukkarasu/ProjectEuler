package Day8;

public abstract class Event {
  protected String name;
  protected String details;
  protected String ownerName;
  
  Event(){
      
  }
  Event(String name, String detail, String ownerName){
      this.name=name;
      this.details=detail;
      this.ownerName=ownerName;
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
public String getOwnerName() {
    return ownerName;
}
public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
}
  
public abstract Double projectedRevenue();
}

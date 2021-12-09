package Day6;

public class SilverStall {
  protected String name;
  protected String detail;
  protected String owner;
  protected Integer cost;
  
  SilverStall(){
      
  }
  SilverStall(String name, String detail, String owner, Integer cost){
      this.name=name;
      this.detail=detail;
      this.owner=owner;
      this.cost=cost;
  }
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getDetail() {
    return detail;
}
public void setDetail(String detail) {
    this.detail = detail;
}
public String getOwner() {
    return owner;
}
public void setOwner(String owner) {
    this.owner = owner;
}
public Integer getCost() {
    return cost;
}
public void setCost(Integer cost) {
    this.cost = cost;
}
 @Override
 public String toString(){
     return "Stall Name :"+name+"\n Details : "+detail+"\n Owner Name : "+owner+"\n Total Cost : "+cost;
             
 }
  
}

 


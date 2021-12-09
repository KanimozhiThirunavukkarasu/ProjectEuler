package Day6;

class Exhibition extends Event{
      Integer noOfStall;

  Exhibition(){
      super();
}
Exhibition(String name,String details,String Type,String ownername,double costPerDay,Integer noOfStall){
      this.noOfStall=noOfStall;
}
public Integer getNoOfStall() {
    return noOfStall;
}
public void setNoOfStall(Integer noOfStall) {
    this.noOfStall = noOfStall;
}


}

 

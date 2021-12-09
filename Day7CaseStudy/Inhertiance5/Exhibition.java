package Day8;

public class Exhibition extends Event{
    Integer noOfStalls;
    Exhibition(){
        
    }
     Exhibition(String name, String detail, String ownerName, Integer noOfStalls){
         this.noOfStalls=noOfStalls;
     }
    public Integer getNoOfStalls() {
        return noOfStalls;
    }
    public void setNoOfStalls(Integer noOfStalls) {
        this.noOfStalls = noOfStalls;
    }
    public Double projectedRevenue(){
          return (double) (noOfStalls*1000);
          
         }

}

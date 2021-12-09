package Day6;

public class PlatinumStall {
  private Integer projector;
  
  PlatinumStall(){
      
  }
  PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector){
      this .projector=projector;
  }
public Integer getProjector() {
    return projector;
}
public void setProjector(Integer projector) {
    this.projector = projector;
}
  
@Override
public String toString()
{
    return "Projector : "+projector;
}
  
}

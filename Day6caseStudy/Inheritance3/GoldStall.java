package Day6;

public class GoldStall extends SilverStall{
    private Integer tvSet;
    
GoldStall(){
    
}
GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet){
    this.tvSet=tvSet;
}
public Integer getTvSet() {
    return tvSet;
}
public void setTvSet(Integer tvSet) {
    this.tvSet = tvSet;
}

@Override
public String toString()
{
    return "Number of Tv set : "+tvSet;
}
}

 

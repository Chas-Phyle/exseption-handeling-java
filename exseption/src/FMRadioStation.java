//Author: Charles E. Phyle III
//Date: 2/17/2022
//Class: COP-3330C

public class FMRadioStation{

    String radioCallSign;
    float staionFrequency;
    boolean problem = false;

    public FMRadioStation(String radioCallSign, float staionFrequency) {
        try {
            if (FMRadioStationException.stationFrequencyCondition(staionFrequency)) {
                throw new FMRadioStationException(radioCallSign, staionFrequency);
            }else{
                this.staionFrequency= staionFrequency;
            }
        } catch (FMRadioStationException fmrse) {
            if(!problem){
            System.out.println("The station Frequency "+ staionFrequency + " is not valid! "+ fmrse.getMessage());
            problem = true;
        }
        }
        try{
            if(FMRadioStationException.radioCallSignCondition(radioCallSign)){
                throw new FMRadioStationException(radioCallSign, staionFrequency);
            }
            else{
                this.radioCallSign = radioCallSign;
            }
        } catch (FMRadioStationException fmrse){
            if(!problem){
            System.out.println("The radio call sign "+radioCallSign+" is not valid! "+ fmrse.getMessage());
            problem = true;
            }
        }
    }
    
    public String getRadioCallSign() {
        return radioCallSign;
    }
    public void setRadioCallSign(String radioCallSign) {
        this.radioCallSign = radioCallSign;   
    }
    public float getSationFrequency() {
        return staionFrequency;
    }
    public void setSationFrequency(float sationFrequency) {
        this.staionFrequency = sationFrequency;
    }
    public String toString() {
        String result;
        if(problem){
            result = "Please enter correct information";
        }else{
            result = "The radio station you are listen to is: "+getRadioCallSign()+" on frequency: "+getSationFrequency();
        }
        
        return result; 
        
    }
    
}
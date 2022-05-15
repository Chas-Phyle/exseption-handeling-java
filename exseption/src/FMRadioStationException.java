//Author: Charles E. Phyle III
//Date: 2/17/2022
//Class: COP-3330C

public class FMRadioStationException extends Exception{
      String radioCallSigns;
      float stationFrequencys;
    public  FMRadioStationException(String radioCallSign, float stationFrequency){
        super(problem(radioCallSignCondition(radioCallSign), stationFrequencyCondition(stationFrequency)));
        radioCallSignCondition(radioCallSign);
        stationFrequencyCondition(stationFrequency);
        
        this.radioCallSigns = radioCallSign;
        this.stationFrequencys = stationFrequency;
    }
  

    static public String problem(boolean radio, boolean frequency){
        String result;
        String radioResult;
        String frequencyResult;
        if(radio == true){
            radioResult = "The raio call sign must contain four capital letters and it must begin with A,K,N, or W! ";
        }else{
            radioResult ="";
        }
        if(frequency == true){
            frequencyResult = "The frequency must be between 88.0 and 108.0";
        }else{
            frequencyResult = "";
        }
        
        result = radioResult  + frequencyResult ;
        return result;
    }
    private static boolean isTheStringUpperCase(String str){
        
        char[] charArray = str.toCharArray();
        
        for(int i=0; i < charArray.length; i++){
            
            if( !Character.isUpperCase( charArray[i] ))
                return false;
        }
        
        return true;
    }
 


    static public boolean radioCallSignCondition(String radioCallSign){
        boolean result =false;
        char firstLetter = radioCallSign.charAt(0);
        if(!(isTheStringUpperCase(radioCallSign))){
            result = true;
        }else if(4!=radioCallSign.length()){
            result = true;
        }else if(!((firstLetter=='A') || (firstLetter=='K') || (firstLetter=='N')  || (firstLetter == 'W'))){
                result = true;
                }
                
            
        
        return result;
    }
    static public boolean stationFrequencyCondition(float stationFrequency){
        boolean result  = false;
        if(!((88.0 <= stationFrequency && stationFrequency<= 108.8)  )){
            result = true;
        }
        return result;
    }

}

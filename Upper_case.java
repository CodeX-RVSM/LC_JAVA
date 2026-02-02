public class Upper_case{
    public static void main(String[] args) {
        String str="hEllo";
        String upper="";
        // System.out.println(str.toUpperCase());
        // System.out.println(str);
      
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                upper+=(char)(ch-32);
                // ch =(char)(ch - 32);
            }else{
                upper+=ch;
            }     
            
          
        }
        System.out.println("UpperCase Word : "+upper);
        
    }
}
//hello-chaAt(0)-'h' array
// a-97 A-65

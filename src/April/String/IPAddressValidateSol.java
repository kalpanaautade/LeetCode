package April.String;

public class IPAddressValidateSol {

        static boolean IsNumeric(String s){

            boolean flag=true;
            for (int i = 0; i < s.length(); i++){
                if(!(s.charAt(i)>=48 && s.charAt(i)<=57))
                    flag=false;
            }

            return flag;

        }

        static boolean validateIP(String ip) {

            boolean flag=true;
            String[] nums = ip.split("\\.", 0);
            System.out.println("hello" + nums.length);
            if(nums.length==4){

                for(int i = 0; i < nums.length; i++){
                    if (IsNumeric(nums[i])){
                        int val= Integer.valueOf(nums[i]);
                        if (!(val>=0 && val<=255))
                            flag=false;
                    }
                    else
                        flag=false;
                }

            }
            else
                flag=false;
            System.out.println("Flag"+ flag  );
            return flag;
        }

    public static void main(String[] args) {
      boolean str=  validateIP("192.168.177.0");
      System.out.println(" Result:"+ str);

    }
}

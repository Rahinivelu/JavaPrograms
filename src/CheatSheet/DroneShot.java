package CheatSheet;

public class DroneShot {
    static int countDeliveryFleet(int target, int[] position, int [] speed){

        int n=position.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(position[j]<position[j+1]){
                    int temp=position[j];
                    position[j]=position[j+1];
                    position[j+1]=temp;


                     temp=speed[j];
                    speed[j]=speed[j+1];
                    speed[j+1]=temp;
                }
            }
        }


        for(int i=0;i<n;i++){
            System.out.println(position[i]+" - "+speed[i]);
        }


        Double [] time=new Double[n];

        for(int i=0;i<n;i++){
            time[i]=(double)(target-position[i])/speed[i];
        }

        double lastfleet=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(time[i]>lastfleet){
             count++;
             lastfleet=time[i];
            }
        }
        return count;

    }
    public static void main(String[] args){
         int target=12;
         int [] position={10,8,0,5,3};
         int [] speed={2,4,1,1,3};

         int result=countDeliveryFleet(target,position,speed);
         System.out.println("Output :"+result);
    }
}

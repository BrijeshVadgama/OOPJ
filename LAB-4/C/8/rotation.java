import java.util.Scanner;
class rotation{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int size,rotation,pointer=0,value,index=0;
        boolean flag = false;

        System.out.print("Enter Size of Array : ");
        size = s.nextInt();

        int[] a = new int[size];
        int[] temp = new int[size];

        for(int i = 0;i < size;i++){
            System.out.print("a["+i+"] : ");
            a[i] = s.nextInt();
        }

        System.out.print("\nEnter rotation : ");
        rotation = s.nextInt();

        for(int i = rotation;i < size;i++){
            temp[pointer] = a[i];
            pointer++;
        }

        for(int i = 0;i < rotation;i++){
            temp[pointer] = a[i];
            pointer++;
        }

        System.out.println("\nSimple Array : ");
        for(int i = 0;i < size;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("\nRotate Array : ");
        for(int i = 0;i < size;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println("\n");

        System.out.print("Enter value to find : ");
        value = s.nextInt();

        for(int i = 0;i < temp.length;i++){
            if(temp[i] == value){
                index = i;
                flag = true;
                break;
            } 
        }
        if(flag==true) {
            System.out.println("Value at index = "+index);
        } else {
            System.out.println("-1");
        }
    }
}
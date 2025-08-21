import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistinsert {

    static Scanner sc = new Scanner(System.in);
    static int choice;


    public static void printarray(ArrayList <Integer> list){

        System.out.println("updated array list :");
        for(int i = 0 ; i<list.size() ; i++){

           System.out.println(" index " + i + " Value: " + list.get(i));

        }
        System.out.println("The updated array size is : " + list.size());

    }

    public static void insertatany(ArrayList <Integer> list){

      
        System.out.println("Enter the value to insert in the array : ");
        int value = sc.nextInt();

        System.out.println("Enter the position : ");
        int position = sc.nextInt();

        if(position >= 0 && position <= list.size()){
            
            list.add(position, value);
            System.out.println("Sucessfully inserted " + value + "  at  "  + position + " th index");
        }
        else if (position < 0 || position > list.size()){
            System.out.println("you choose invalid index ");
        }
        
        printarray(list);

    }  

    public static void deletatany(ArrayList <Integer> list){


        System.out.println("Enter the position to delete the value  : ");
        int position = sc.nextInt();


        if(position >= 0 && position < list.size()){

            System.out.println("confirm to delete the element :  "  + list.get((position)));
            System.out.println("1 for yes ");
            System.out.println("0 for no ");
            choice = sc.nextInt();

            if(choice == 1){


                list.remove(position);
                System.out.println("Sucessfully deleted......");

                printarray(list);
            }

            else if ( choice == 0) {
                System.out.println(" Delete process canceled ");
            }

        }

        else{
            System.out.println("you choose invalid index ");
        }

    }

    public static void updatedata(ArrayList <Integer> list){
        System.out.println("Enter the value that will be updated : ");
        int val = sc.nextInt();
        System.out.println("Enter the position to update the data  : ");
        int position = sc.nextInt();


        if(position >= 0 && position < list.size()){

            System.out.println("confirm to update the element :  "  + list.get((position)) + " with " + val);
            System.out.println("1 for yes ");
            System.out.println("0 for no ");
            choice = sc.nextInt();

            if(choice == 1){

                list.set(position, val);
            
                System.out.println("Sucessfully updated......");

                printarray(list);
            }

            else if ( choice == 0) {
                System.out.println(" update process canceled ");
            }

        }
        else{
            System.out.println("you choose invalid index ");
        }



    }

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
                list.add(10);
                list.add(20);
                list.add(30);
                list.add(40);
                list.add(50);

        while(true){

         
            System.out.println("1 for insert ");
            System.out.println("2 for delete ");
            System.out.println("3 for update ");
            System.out.println("0 for exit ");
            choice = sc.nextInt();

            switch(choice){

                case 1 :
                insertatany(list);
                break;

                case 2 :
                deletatany(list);
                break;

                case 3:
                updatedata(list);
                break;

                case 0 :
                System.exit(0);
                
                default:
                System.out.println("Invalid choice");

            }
        }

  



    }
    
}

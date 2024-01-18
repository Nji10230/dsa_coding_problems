import java.util.ArrayList;

public class recursion4 {
    public static void main(String[] args) {
        int []arr={1,2,3,3,4,5,6};
        int target =3;
        ArrayList<Integer>list=new ArrayList<>();
        ls(arr,0,target,list);
      // System.out.println( ls(arr,0,target,list)) ;
        System.out.println(list);
        System.out.println(list.size());
    }
   // =new ArrayList<>();
    static ArrayList<Integer> ls(int []arr,int index,int target,ArrayList<Integer>list){
        if(index== arr.length){
            return list ;
        }
        if (arr[index]==target) {
            list.add(index);
        }

       return ls(arr,index+1,target,list);

    }
}

//
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = 0;
        while(sc.hasNext()){
            arr[k] = sc.nextInt();
            k++;
        }
        Arrays.sort(arr);
        int res = 0;
        boolean add = true;
        if(n % 2 == 0)
            add = false;
        
        for(int i = 0; i < n ; i++){
            if(add){
                res += arr[i];
                add = false;
            }else{
                res -= arr[i];
                add = true;
            }
            
        }
        System.out.print(res);
    }
}

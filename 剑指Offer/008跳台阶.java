import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] in = new int[2];
        int t = 0;
        while(sc.hasNext()){
            in[t] = sc.nextInt();
            t++;
        }
        long add = 0;
        int groupNum = in[0] / (2 * in[1]);
        
        for(int i = 0; i < groupNum; i++){
            for(int j = 0; j < 2 * in[1]; j++){
                int num = i * 2 * in[1] + j + 1;
                if(j < in[1]){
                    add -= num;
                }else{
                    add += num;
                }
                
            }
        }
        System.out.print(add);
    }
}

//输入有些复杂

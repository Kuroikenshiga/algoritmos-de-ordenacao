package javaapplication7;
import java.util.*;
public class JavaApplication7 {
public static void main(String[] args) {

    int[]v = {5,2,3,4,1,0};
    
    for(int i = 1;i < v.length;i++){
        for(int c = 0;c < i;c++){
            if(v[c] > v[i]){
                int aux = v[i];
                for(int k = i;k > c;k--){
                    v[k] = v[k-1];   
                }
                v[c] = aux;
                break;
            }
        }
    }
    System.out.println(Arrays.toString(v));
}
    
}

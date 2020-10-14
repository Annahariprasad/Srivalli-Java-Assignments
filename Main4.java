//Day 4 - Assignment_2
public class Main4 {
    public static void main(String[] args){
    int arr[] = new int[5];
    arr[0] = 22; 
    arr[1] = 34; 
    arr[2] = 57; 
    arr[3] = 61; 
    arr[4] = 45;
    System.out.print("Odd Values : ");
    for(int i=0; i<5; i++){
        if(arr[i]%2!=0){
            System.out.print(arr[i]+" ");
        }
    }
}
}
class Largestarr{
int nums[]={3,5,6,7};
    public int largestElement() {
    int largest=nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i]>largest){
            largest=nums[i];
        }
    }
    return largest;
 }
 public static void main(String[]args){
    Largestarr s=new Largestarr();
    
System.out.println(s.largestElement());
 }
}
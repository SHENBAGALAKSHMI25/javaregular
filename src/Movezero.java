import java.util.ArrayList;
class Movezero {
public void moveZeroes() {
int []nums={1,7,9,0,8,0,6};
ArrayList<Integer> temp = new ArrayList<>();
for( int i=0;i<nums.length;i++){
if(nums[i]!=0){
temp.add(nums[i]);
}
}
while (temp.size() < nums.length) {
temp.add(0);
}
for(int i=0;i<nums.length;i++){
nums[i]=temp.get(i);
}

for(int num:nums){
System.out.print(num+" ");
}
}
public static void main(String[] args) {
Movezero m=new Movezero();
m.moveZeroes();
}
}
package assignment_no_4;

public class RemoveCharacterfromArray {
public static void main(String[] args) {
	String s="rohit ravindra mahalle";
	String  r[]=s.split("s|h");
	String res="";
	for(String m:r){
		res=res+m;
		}
	System.out.println(res);
}
}

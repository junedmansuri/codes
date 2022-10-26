import java.util.*;
class node
{
	int val;
	node left;
	node rigth;
	node(int val){
	 this.val=val;
	}
}
class tree1 {
	 static Scanner sc = new Scanner(System.in);
       static node build(){
		  int n = sc.nextInt();
	      if(n==-1)
			  return null;
		  node root = new node(n);
		  root.left = build();
		  root.rigth=build();
		  return root;
	   
	  static  void preorder(node root){
	        if(root==null)
				return;
			System.out.print(root.val+" ");
			preorder(root.left);
			preorder(root.rigth);
	   }
	   static int hight(node root){
	       if(root==null)
			   return 0;
		   int left = hight(root.left);
		   int rigth= hight(root.rigth);
		   int h  =  Math.max(left,rigth)+1;
		   return h;
	   }
	   static int diameter(node root){
	     if(root==null)
			 return 0;
		 int l= diameter(root.left);
		 int r= diameter(root.rigth);
		 int full= hight(root.left)+hight(root.rigth);
		 return Math.max(Math.max(l,r),full);
	   }
	   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
              node root = null;
			 root= build();
			  preorder(root); 
			  System.out.println();
			  System.out.println(hight(root));
			System.out.println(diameter(root));
     }
}

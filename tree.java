import java.util.*;
class node
{
	int data;
	static node left;
	static node rigth;
	node(int data){
	 this.data= data;
	 left=null;
	 rigth=null;
	}
}
class tree {
	 public static node buildtree(){
       Scanner sc1 = new Scanner(System.in);
	 int n=sc1.nextInt();
	 if(n == -1){
		 return null;
	}
	else{
	       node root = new node(n);
		   System.out.println(root.data);
		   node.left= buildtree();
		   node.rigth=buildtree();
		   return root;
	}
	}
	public static void preorder(node h1){
	  if(h1==null)
		  return;
	    System.out.println(h1.data);
	  preorder(h1.left);
	  preorder(h1.rigth);
	}
   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          node root= buildtree();
          // preorder(root);          
     }
}



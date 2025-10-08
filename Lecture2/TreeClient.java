package Lecture2;

public class TreeClient {
	public static void main(String[] args) {
		Tree tt = new Tree();
		tt.createTree();
		tt.preorder();
		System.out.println(tt.max());
	}

}

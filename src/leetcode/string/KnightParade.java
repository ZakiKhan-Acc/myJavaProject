package leetcode.string;

import java.util.Scanner;

public class KnightParade {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc= new Scanner(System.in);
      System.out.println("Enter n");
      int n =sc.nextInt();
      System.out.println("Enter starting position:");
      int x =sc.nextInt();
      int y=sc.hashCode();
      boolean p = knightParade(7,0,0,new boolean[n][n],new int[n*n],0); 
      
      
	}
	
	public static boolean knightParade(int n,int x ,int y , boolean[][] visited,int[] path,int i){
		if(x >= n || y >= n || x<0 ||y<0) {
			return false;
		}
		if(visited[x][y]) {
			return false;
		}
		visited[x][y]=true;
		path[i]=(x*n)+(y+1);
		if(i+1==n*n) {
			for(int j=0;j<n*n;j++) {
				System.out.println(path[j]);
			}
			return true;
		}
		boolean a1=knightParade(n, x+1, y+2, visited, path, i+1);
		boolean a2=knightParade(n, x+1, y-2, visited, path, i+1);
		boolean a3=knightParade(n, x-1, y+2, visited, path, i+1);
		boolean a4=knightParade(n, x-1, y-2, visited, path, i+1);
		boolean a5=knightParade(n, x+2, y+1, visited, path, i+1);
		boolean a6=knightParade(n, x-2, y+1, visited, path, i+1);
		boolean a7=knightParade(n, x+2, y-1, visited, path, i+1);
		boolean a8=knightParade(n, x-2, y-1, visited, path, i+1);
		visited[x][y]=false;
		return a1||a2||a3||a4||a5||a6||a7||a8;
		
		
	}

}

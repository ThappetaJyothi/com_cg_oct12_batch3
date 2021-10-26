package com.cg.oct12.batch3.day3;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a=new int[3][3][3];
		int num=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					a[i][j][k]=num;
					num++;
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}

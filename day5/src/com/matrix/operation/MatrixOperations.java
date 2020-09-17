package com.matrix.operation;


import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.matrix.operation.exception.InvalidInputMatrixException;



public class MatrixOperations {
	static Logger logger =Logger.getLogger(MatrixOperations.class.getName());
	static {
		try {
			logger.addHandler(new FileHandler("myLog"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	
	static void add(int matrix1[][],int matrix2[][]) throws InvalidInputMatrixException
	{
		
		int rows = matrix1.length;
		int cols = matrix1[0].length;
		int rows2 = matrix2.length;
		int cols2 = matrix2[0].length;
		int sum[][]=new int[rows][cols];
		try {
			if(rows!=rows2 && cols != cols2)
			{
				throw new Exception("The dimensions of Matrix 1 Matrix 2 must be equal ");
			}
			
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) 
			{
				sum[i][j]=matrix1[i][j]+matrix2[i][j];	
			}	
		}
		print(sum);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//logger.info("The specified index doesnt exist  "+e.getMessage());  
			
			InvalidInputMatrixException nex= new InvalidInputMatrixException();		
			nex.initCause(e.getCause()); 
			throw nex;
			
		}
		catch (Exception e) {
			//logger.info("There is an Invalid input  "+e.getMessage()); 			
			
			InvalidInputMatrixException nex= new InvalidInputMatrixException();		
			nex.initCause(e.getCause()); 
			throw nex;
		}
		finally {
			
			System.out.println("Done!");
		}
		
		

	}
	static void subtract(int matrix1[][],int matrix2[][]) throws InvalidInputMatrixException {
		int rows = matrix1.length;
		int cols = matrix1[0].length;
		int sub[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) 
			{
				sub[i][j]=matrix1[i][j]-matrix2[i][j];	
			}	
		}
		print(sub);
	
	}
	
	static void transpose(int matrix[][])  throws InvalidInputMatrixException{
		int rows = matrix.length;
		int cols = matrix[0].length;
		int transpose[][]=new int[cols][rows];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) 
			{
				transpose[j][i]=matrix[i][j];	
			}	
		}
		print(transpose);
	}	
	static void multiply(int matrix1[][],int matrix2[][]) throws InvalidInputMatrixException {
		/* for multiplication  the number of columns in matrix1 should be 
		 * equal to the number of rows in matrix2
		 */
		int row1=matrix1.length;
		int col1=2;//matrix1[0].length;
		int row2 = 	matrix2.length;
		int col1_row2=matrix1[0].length;
		int col2=matrix2[0].length;
		int multiplicationResult[][]=new int[row1][col2];
		

		try {
			if(col1!=row2)
				{
				throw new Exception("The No. of column in Matrix 1 and No. of Row in Matrix 2 must be equal ");
				}
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					for(int k=0;k<col1_row2;k++) {
						multiplicationResult[i][j] += matrix1[i][k]*matrix2[k][j];
					}
				}
			}
			print(multiplicationResult);
		}
		catch (Exception e) {
			//logger.info("There is an Invalid input  "+e.getMessage());  
			InvalidInputMatrixException nex= new InvalidInputMatrixException();		
			nex.initCause(e.getCause()); 
			throw nex;
		}
		finally {
			
			System.out.println("Done!");
		}
		
	}
  static public void print(int matrix[][]) throws InvalidInputMatrixException{
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		
			for(int i=0;i<rows;i++) 
			{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+ "\t");	
			}
			System.out.println();
			}
		
		
	}
	public static void main(String[] args) throws InvalidInputMatrixException {
		// TODO Auto-generated method stub
		int rows1=2,cols1=3, rows3=3, cols3=4;
		int matrix1[][]=  { {10,2,7}, {5,6,9} }; //rows=2, columns=3
		int matrix2[][]= { {1,2,3}, {4,5,7}};	//rows=2, columns=3
		int matrix3[][]={ {1,2,3,4},{5,6,7,8}, {9,10,11,12} }; ////rows=3, columns=4
		try {
		//Print all matrices
		System.out.println("Matrix1:  ");
		print(matrix1);
		System.out.println("-------------------");
		
		System.out.println("Matrix2:  ");
		print(matrix2);
		System.out.println("-------------------");
		
		System.out.println("Matrix3:  ");
		print(matrix3);
		System.out.println("-------------------");
		
		System.out.println("Addition of Matrix1 and Matrix2 :");
		add(matrix1,matrix2);
		System.out.println("-------------------");
		
		System.out.println("Subtracting of Matrix2 from Matrix1 :");
		subtract( matrix1,matrix2);
		System.out.println("-------------------");
		
		System.out.println("Multiplication of Matrix1 and Matrix3 :");
		multiply(matrix1,matrix3);
		System.out.println("-------------------");
		
		System.out.println("Transpose of Matrix3 :");
		transpose(matrix2);
		
	}catch(Exception e) {
		 e.printStackTrace();
		 System.out.println("Exception  "+e.getMessage());
	 }
		finally {
			System.out.println("Operations Done.");
			System.out.println("Thank you!");
		}

}
	}

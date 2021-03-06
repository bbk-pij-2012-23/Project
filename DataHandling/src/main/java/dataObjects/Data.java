package dataObjects;
import java.util.HashMap;

import no.uib.cipr.matrix.io.MatrixInfo;

/* There are some data structure decisions to be made:
 * How to represent information about the matrix - need to retrieve:
 * * which column is skin conductance level? MovingWindowData:createSegments
 * * how many rows in the matrix? MovingWindowData:createSegments
 * 
 * 
 */

/**
 * dimensions[0] = number of rows 
 * dimensions[1] = number of columns 
 * @author emann06
 *
 */

public class Data {
	double [][] data;
	int[] dimensions;
	String labels;
	
	public Data(double[][] data){
		this.data = data;
	}
	
	public Data(double[][] data, int[] dimensions){
		this.data = data;
		this.dimensions = dimensions;
	}

	public double[][] getData() {
		return data;
	}

	public void setData(double[][] data) {
		this.data = data;
	}

	public int[] getDimensions() {
		return dimensions;
	}

	public void setDimensions(int[] dimensions) {
		this.dimensions = dimensions;
	}

	public String getVariableLabels() {
		return labels;
	}

	public void setVariableLabels(String labels) {
		this.labels = labels;
	}
	
	public String toString(){
		String matrix = "";
		for (int i = 0; i < dimensions[0]; i++){
			
			for(int j = 0; j < dimensions[1]; j++){
				matrix = matrix +  data[i][j] + " "; 
			}
			matrix = matrix + "\n";
		}
		return matrix;
	}
	
	
	
	
}

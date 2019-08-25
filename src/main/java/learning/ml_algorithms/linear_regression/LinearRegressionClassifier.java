package learning.ml_algorithms.linear_regression;

import java.util.ArrayList;
import java.util.List;

public class LinearRegressionClassifier {
	
	private ArrayList<Float> listXData;
	private ArrayList<Float> listYData;

	
	public LinearRegressionClassifier(ArrayList<Float> xList, ArrayList<Float> yList) {
		this.listXData = xList;
		this.listYData = yList;
	}
	
	/**
	 * Calculate the mean of the x Data
	 * @param listXData
	 * @return Float mean
	 */
	public Float getMean(ArrayList<Float> listData) {
		Float sum = 0.0f;
		for (Float data : listData) {
			sum =+ data;
		}
		return sum / listData.size();
	}
	
	public Float getLineSlope(Float xMean, Float yMean, Float xData, Float yData) {
		Float diffX = xData - xMean;
		Float diffY = yData - yMean;
		Float denom = (diffX * diffX);
		return (diffX * diffY) / denom;
	}
	
	public Float getYIntercept(Float xMean, Float yMean, Float lineSlope) {
		return yMean - (lineSlope * xMean);
	}
	
	public Float predictValue(Float inputValue) {
		Float x = this.listXData.get(0);
		Float y = this.listYData.get(0);
		Float xMean = this.getMean(this.listXData);
		Float yMean = this.getMean(this.listYData);
		Float lineSlope = this.getLineSlope(xMean, yMean, x, y);
		Float yIntercept = this.getYIntercept(xMean, yMean, lineSlope);
		Float prediction = (lineSlope * inputValue) + yIntercept;
		return prediction;
	}
	
}

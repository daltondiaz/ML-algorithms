package learning.ml_algorithms;


import java.util.ArrayList;

import learning.ml_algorithms.linear_regression.LinearRegressionClassifier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
        System.out.println( "Linear Regression" );
        
        ArrayList<Float> XData = new ArrayList<Float>() ;
        ArrayList<Float> YData = new ArrayList<Float>() ;

        XData.add( 1.5f ) ;
        XData.add( 1.4f ) ;
        XData.add( 1.3f ) ;
        XData.add( 1.25f ) ;
        XData.add( 1.19f ) ;

        YData.add( 7.61f ) ;
        YData.add( 7.10f ) ;
        YData.add( 6.59f ) ;
        YData.add( 6.34f ) ;
        YData.add( 6.03f ) ;
        LinearRegressionClassifier linearRegression = new LinearRegressionClassifier(XData , YData);
        
        Float prediction = linearRegression.predictValue(1.6f);
        
        System.out.println(" Result : "+ prediction);

    }
}

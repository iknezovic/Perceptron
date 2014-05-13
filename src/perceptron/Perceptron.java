/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perceptron;


public class Perceptron {
    

    
    public static void main(String[] args) {
        double treshold = 0.5;
        double learningRate = 0.1;
        double [] weights = new double []{0.1,0.1,0.1};
        int [][] traing_set = new int[][]{
        {1,0,0,1},
        {1,0,1,1},
        {1,1,0,1},
        {1,1,1,0}};
        
        double [] weightPlusTrain = new double[4];
        
        while (true) {
            
            for(int i = 0;i<4;i++)
            {
                for (int j = 0; j < 3; j++) {
                    weightPlusTrain[i] += traing_set[i][j+1] * weights[j];
                    
                    weights[j] = weights [j]+learningRate*(traing_set[i][3] - weightPlusTrain[][])
                    
                }
            }
        }
               
                                           
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perceptron;


public class Perceptron {
    static boolean error (int [][]traing_set,double [] weightPlusTrain ){
        double treshold = 0.5;
        double error = 0;
        for (int i = 0; i < 4; i++) {
            error += Math.abs(traing_set[i][3] - weightPlusTrain[i]);
        }
        error = error * 0.25;
        
        return error > treshold;
    }
    

    
    public static void main(String[] args) {
        double treshold = 0.5;
        int error = 0;
        double learningRate = 0.1;
        double [] weights = new double []{0.1,0.1,0.1};
        int [][] traing_set = new int[][]{
        {1,0,0,1},
        {1,0,1,1},
        {1,1,0,1},
        {1,1,1,0}};
        
        double [] weightPlusTrain = new double[4];
        
        while (true) {
            
            for(int i = 0;i < 3;i++)
            {
                
                for (int j = 0; j < 3; j++) {
                    weightPlusTrain[i] += traing_set[i][j] * weights[j];
                            
                    if(error(traing_set,weightPlusTrain)){
                        
                        weights[j] = weights [j]+ learningRate * (traing_set[i][3] - weightPlusTrain[j])*traing_set[i][j];
                        error += 1;
                    }else{
                        error -= 1;
                    }
                    
                    System.out.print(weights[j]);
                    System.out.println(" ");
                              
                }
                System.out.println("---------------------------------");
                
            }
            if(error == 0)
                break;
        }
        
        NANDTest.testNand(weights, traing_set);
               
                                           
    }
    
}

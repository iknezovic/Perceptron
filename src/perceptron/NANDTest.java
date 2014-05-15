/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perceptron;


public class NANDTest {
    
    public static void testNand(double [] testWeights,int [][] testSample){
        double [] deltaField = new double[4];
        double [] resultField = new double[4];
        
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 3; j++) {
                resultField[i] += testWeights[j] * testSample[i][j];
            }
            deltaField[i] = resultField[i] - testSample[i][3]; 
            System.out.println(deltaField[i] + " ");
        }
        
    }
    
}

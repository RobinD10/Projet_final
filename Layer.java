/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

public class Layer { //Tableau 1

    private char[][] layer;

    public Layer(char[][]layer){
        this.layer = layer;
    }

    public char[][] getLayer() {
        return layer;
    }
    
    public void setLayer(char[][] layer) {
        this.layer = layer;
    }
    
    public char getCase(int x, int y){
        return layer[x][y];
    }
    
    public int getSizeX(){
        return layer[0].length;
    }
    
    public int getSizeY(){
        return layer.length;
    }
    
    public void setCase(int x, int y, char carCase){
        layer[x][y] = carCase;
    }

    //Set Layer case
}

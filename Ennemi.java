/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

public class Ennemi {

    private int xEnemy;
    private int yEnemy;
    private char currentEnemyCase = 'o';


    public Ennemi(int x, int y){
        xEnemy = x;
        yEnemy = y;
    }

    public int getxEnemy() {
        return xEnemy;
    }
    public void setxEnemy(int xEnemy) {
        this.xEnemy = xEnemy;
    }

    public int getyEnemy() {
        return yEnemy;
    }
    public void setyEnemy(int yEnemy) {
        this.yEnemy = yEnemy;
    }

    public int []GetCoords(){
        return new int[]{xEnemy, yEnemy};
    }
    public void setEnemyCoords(int x,int y){
        xEnemy = x;
        yEnemy = y;
    }

    public char getEnemyCurrentCase() {
        return currentEnemyCase;
    }
    public void setEnemyCurrentCase(char currentEnemyCase) {
        this.currentEnemyCase = currentEnemyCase;
    }

}

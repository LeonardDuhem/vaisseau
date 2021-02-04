/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.codingdojo.students;


import fr.rphstudio.codingdojo.game.Pod;
import fr.rphstudio.codingdojo.game.PodPlugIn;

/**
 *
 * @author Romuald GRIGNON
 */
public class Student77 extends PodPlugIn {
    public Student77(Pod p){
        super(p);
    }
    
    //-------------------------------------------------------
    // DECLARE YOUR OWN VARIABLES AND FUNCTIONS HERE

    float batMin = 25f;
    float batMax = 80f;
    boolean Charge = false;
    int checkpointCharge = getNbRaceCheckPoints();
    int nextCharge;
    
    // END OF VARIABLES/FUNCTIONS AREA
    //-------------------------------------------------------
    
    @Override
    public void process(int delta)
    {   
        //-------------------------------------------------------
        // WRITE YOUR OWN CODE HERE
        
        setPlayerName("Master pizza");
        selectShip(33);

        // Niveau 1
        // moveAndRecharge(0.70f, 10, 100);

        // Niveau 2
//        if(updateChargingMode(10,100)){
//            moveToFirstChargingCheckPoint(0.20f);
//        }
//        else{
//            moveToNextCheckPoint(0.80f);
//        }

        // Niveau 3

//        if(updateChargingMode(10f,80f)){
//            turnTowardFirstChargingCheckPoint();
//            accelerateOrBrake(0.18f);
//         }
//        else{
//            turnTowardNextCheckPoint();
//            accelerateOrBrake(0.80f);
//        }

        // Niveau 4

//        if(updateChargingMode(10f,80f)){
//            turnTowardPosition(getFirstChargingCheckPointX(),getFirstChargingCheckPointY());
//            accelerateOrBrake(0.18f);
//        }
//        else{
//            turnTowardPosition(getNextCheckPointX(),getNextCheckPointY());
//            accelerateOrBrake(0.80f);
//        }

        // Niveau 5
//
//        if(updateChargingMode(10f, 80f)){
//            turnTowardPosition(getCheckPointX(getFirstChargingCheckPointIndex()), getCheckPointY(getFirstChargingCheckPointIndex()));
//            accelerateOrBrake(0.165f);
//         }
//        else{
//            turnTowardPosition(getCheckPointX(getNextCheckPointIndex()), getCheckPointY(getNextCheckPointIndex()));
//            accelerateOrBrake(0.80f);
//        }

        // Niveau 6
//        float Recharge = getShipBatteryLevel();
//
//        if (Recharge < 15f) {
//            Charge = true;
//        }else if(Recharge > 90f) {
//            Charge = false;
//        }
//        if (Charge == true) {
//            turnTowardPosition(getCheckPointX(getFirstChargingCheckPointIndex()), getCheckPointY(getFirstChargingCheckPointIndex()));
//            accelerateOrBrake(0.30f);
//        } else {
//            turnTowardPosition(getCheckPointX(getNextCheckPointIndex()), getCheckPointY(getNextCheckPointIndex()));
//            accelerateOrBrake(0.65f);
//        }

        // Niveau 7

//        for(int i = 0; i<= checkpointCharge;i++){
//            if(isCheckPointCharging(i)){
//                nextCheck = i;
//            }
//        }
//
//        float Recharge = getShipBatteryLevel();
//
//        if (Recharge < 12.5f) {
//            Charge = true;
//        }else if(Recharge > 90f) {
//            Charge = false;
//        }
//        if (Charge == true) {
//            turnTowardPosition(getCheckPointX(nextCheck),getCheckPointY(nextCheck));
//            accelerateOrBrake(0.30f);
//        } else {
//            turnTowardPosition(getCheckPointX(getNextCheckPointIndex()),getCheckPointY(getNextCheckPointIndex()));
//            accelerateOrBrake(0.665f);
//        }

        // Niveau 8


//        for(int i = 0; i<= checkpointCharge;i++){
//            if(isCheckPointCharging(i)){
//                nextCheck = i;
//            }
//        }
//
//        float Recharge = getShipBatteryLevel();
//
//        if (Recharge < 10f) {
//            Charge = true;
//        }else if(Recharge > 90f) {
//            Charge = false;
//        }
//        if (Charge == true) {
//            turnToAngle(angleHeal);
//            accelerateOrBrake(0.30f);
//        } else {
//            turnToAngle(angle);
//            accelerateOrBrake(0.62f);
//        }


        //niveau 9
//        float shipX = getShipPositionX();
//        float shipY = getShipPositionY();
//        float checkX = getCheckPointX(getNextCheckPointIndex());
//        float checkY = getCheckPointY(getNextCheckPointIndex());
//        float distance = getDistanceBetweenPositions(shipX, shipY ,checkX, checkY) ;
//        //float distcharge = getDistanceBetweenPositions(shipX, shipY, nextCheck,)
//        float nivboost = getShipBoostLevel() ;
//        float speed = getShipSpeed();
//        float secondcheckX = getCheckPointX(getSecondCheckPointIndex());
//        float secondcheckY = getCheckPointY(getSecondCheckPointIndex());
//        float absoluteangle = getAbsoluteAngleFromPositions(secondcheckX,secondcheckY, shipX, shipY) ;
//        float angleHeal = getAbsoluteAngleFromPositions(getShipPositionX(),getShipPositionY(),getCheckPointX(nextCharge),getCheckPointY(nextCharge));
//        float angle = getAbsoluteAngleFromPositions(getShipPositionX(),getShipPositionY(),getCheckPointX(getNextCheckPointIndex()),getCheckPointY(getNextCheckPointIndex()));
//        float speedvecteurX = getShipSpeedX(getShipIndex());
//        float speedvecteurY = getShipSpeedY(getShipIndex());
//        //getshipspeedX et Y, on veut l'angle entre la position du vecteur et le prochain checkpoint
//
//
//
//        for(int i = 0; i<= checkpointCharge;i++){
//            if(isCheckPointCharging(i)){
//                nextCharge = i;
//            }
//        }
//        float chargeY = getCheckPointY(nextCharge);
//        float chargeX = getCheckPointX(nextCharge);
//        float distcharge = getDistanceBetweenPositions(shipX, shipY, chargeX, chargeY);
//        float battery = getShipBatteryLevel();
//
//        if (speed > 9f) {
//            setPlayerColor(255, 0, 0, 255);
//        }
//        else if (speed > 8f) {
//            setPlayerColor(0, 255, 0, 255);
//        }
//        else if (speed > 7f) {
//            setPlayerColor(0, 0, 255, 255);
//        }
//        else if (speed > 6f) {
//            setPlayerColor(255, 215, 0, 255);
//        }
//        else if (speed > 5f) {
//            setPlayerColor(253, 0, 127, 255);
//        }
//        else if (speed > 4f) {
//            setPlayerColor(0, 0, 255, 255);
//        }
//        else if (speed > 3f) {
//            setPlayerColor(255, 0, 0, 255);
//        }
//        else if (speed > 2f) {
//            setPlayerColor(0, 255, 0, 255);
//        }
//        else if (speed > 1f) {
//            setPlayerColor(0, 0, 255, 255);
//        }
//
//        if (battery < 13.5f) {
//            Charge = true;
//        }
//        else if(battery > 90f) {
//            Charge = false;
//        }
//        if (Charge == true) {
//            if (distcharge <= 0.7f) {
//                turn(getRelativeAngleDifference(getShipAngle(), angleHeal)) ;
//                accelerateOrBrake(-1f);
//            }
//            else {
//                turn(getRelativeAngleDifference(getShipAngle(), angleHeal)) ;
//                accelerateOrBrake(0.30f);
//            }
//        }
//        else {
//            if (distance <= 3.45f) {
//                if (speed > 3f) {
//                    turn(getRelativeAngleDifference(getShipAngle(), angle));
//                    accelerateOrBrake(-0.80f);
//                }
//                else {
//                    turn(getRelativeAngleDifference(getShipAngle(), angle));
//                    accelerateOrBrake(0.545f);
//                }
//            } else {
//                turn(getRelativeAngleDifference(getShipAngle(), angle));
//                accelerateOrBrake(1f);
//            }
//        }



//        if (nivboost >= 100f && distance > 14f) {
//            useBoost();
//        }

        float shipX = getShipPositionX();
        float shipY = getShipPositionY();
        float checkX = getCheckPointX(getNextCheckPointIndex());
        float checkY = getCheckPointY(getNextCheckPointIndex());
        float distance = getDistanceBetweenPositions(shipX, shipY ,checkX, checkY) ;
        //float distcharge = getDistanceBetweenPositions(shipX, shipY, nextCheck,)
        float nivboost = getShipBoostLevel() ;
        float speed = getShipSpeed();
        float secondcheckX = getCheckPointX(getSecondCheckPointIndex());
        float secondcheckY = getCheckPointY(getSecondCheckPointIndex());
        float absoluteangle = getAbsoluteAngleFromPositions(secondcheckX,secondcheckY, shipX, shipY) ;
        float anglesecondcheck = getRelativeAngleDifference(absoluteangle, getShipAngle());
        float angleHeal = getAbsoluteAngleFromPositions(getShipPositionX(),getShipPositionY(),getCheckPointX(nextCharge),getCheckPointY(nextCharge));
        float angle = getAbsoluteAngleFromPositions(getShipPositionX(),getShipPositionY(),getCheckPointX(getNextCheckPointIndex()),getCheckPointY(getNextCheckPointIndex()));
        float speedvecteurX = getShipSpeedX(getShipIndex());
        float speedvecteurY = getShipSpeedY(getShipIndex());
        //getshipspeedX et Y, on veut l'angle entre la position du vecteur et le prochain checkpoint
        float speedangle = getAbsoluteAngleFromPositions(0, 0, speedvecteurX, speedvecteurY) ;
        float diffspeedangle = getRelativeAngleDifference(speedangle, angle) ;
        float absspeedangle = abs(diffspeedangle);
        float prevcheckX = getCheckPointX(getPreviousCheckPointIndex()) ;
        float prevcheckY = getCheckPointY(getPreviousCheckPointIndex()) ;
        float distancebetweencheck = getDistanceBetweenPositions(prevcheckX, prevcheckY, checkX, checkY);

        for(int i = 0; i<= checkpointCharge;i++){
            if(isCheckPointCharging(i)){
                nextCharge = i;
            }
        }
        float chargeY = getCheckPointY(nextCharge);
        float chargeX = getCheckPointX(nextCharge);
        float distcharge = getDistanceBetweenPositions(shipX, shipY, chargeX, chargeY);
        float battery = getShipBatteryLevel();

        if (speed > 9f) {
            setPlayerColor(255, 0, 0, 255);
        }
        else if (speed > 8f) {
            setPlayerColor(0, 255, 0, 255);
        }
        else if (speed > 7f) {
            setPlayerColor(0, 0, 255, 255);
        }
        else if (speed > 6f) {
            setPlayerColor(255, 215, 0, 255);
        }
        else if (speed > 5f) {
            setPlayerColor(253, 0, 127, 255);
        }
        else if (speed > 4f) {
            setPlayerColor(0, 0, 255, 255);
        }
        else if (speed > 3f) {
            setPlayerColor(255, 0, 0, 255);
        }
        else if (speed > 2f) {
            setPlayerColor(0, 255, 0, 255);
        }
        else if (speed > 1f) {
            setPlayerColor(0, 0, 255, 255);
        }

        if (battery < 13.5f) {
            Charge = true;
        }
        else if(battery > 90f) {
            Charge = false;
        }
        if (Charge == true) {
            if (distcharge <= 0.7f) {
                turn(getRelativeAngleDifference(getShipAngle(), angleHeal)) ;
                accelerateOrBrake(-1f) ;
            }
            else {
                turn(getRelativeAngleDifference(getShipAngle(), angleHeal)) ;
                accelerateOrBrake(0.30f);
            }
        }
        else {
            if (distance < 3f && distancebetweencheck > 4f){
                if (getNbRaceCheckPoints() == 10) {
                    accelerateOrBrake(-0.70f);
                    turn(anglesecondcheck);
                    setPlayerName("<3 && >4");
                }
                else {
                    accelerateOrBrake(-0.95f);
                    turn(anglesecondcheck) ;
                    setPlayerName("<3 && >4");
                }
            }
            else if (distance < 3f && distancebetweencheck <=4){
                accelerateOrBrake(0.5f);
                turn(getRelativeAngleDifference(getShipAngle(), angle));
                setPlayerName("<3 && <=4");
            }
            else if (absspeedangle > 10 && distance < distancebetweencheck && speed > 3){
                turn(diffspeedangle/4);
                accelerateOrBrake(1);
                setPlayerName("absspeedangle>10");
            }
            else {
                turn(getRelativeAngleDifference(getShipAngle(), angle));
                accelerateOrBrake(1f);

            }
        }

        if (getNbRaceCheckPoints() == 2) {
            if (nivboost >= 100f && distance > 8f && distcharge > 8f) {
                useBoost();
            }
        }

        // END OF CODE AREA
        //-------------------------------------------------------
    }
    
}

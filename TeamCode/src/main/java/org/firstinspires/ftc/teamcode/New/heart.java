package org.firstinspires.ftc.teamcode.New;

import org.firstinspires.ftc.teamcode.New.Operators.Aliance;
import org.firstinspires.ftc.teamcode.New.Operators.Autonomius;
import org.firstinspires.ftc.teamcode.New.Operators.Instincts;
import org.firstinspires.ftc.teamcode.New.Primitives.dot;

public class heart {
    private Aliance aliance;
    private Autonomius type;
    private dot startPos;
    public heart(Aliance aliance, Autonomius type, dot startPos){
        this.aliance = aliance;
        this.type = type;
        this.startPos = startPos;
    }

    public void init(){

    }
    public void loop(){
        switch (Instincts.type){
            case Manual: DoManual();
            case TargetManual: DoTargetManual();
            case Instinct: DoInstinct();
            case Neyro: DoNeyro();
        }
    }
    private void DoManual(){

    }

    private void DoTargetManual(){}

    private void DoInstinct(){}

    private void DoNeyro(){}
}

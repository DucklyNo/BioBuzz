package org.firstinspires.ftc.teamcode.New.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.New.Operators.Aliance;
import org.firstinspires.ftc.teamcode.New.Operators.Autonomius;
import org.firstinspires.ftc.teamcode.New.Operators.OP1;
import org.firstinspires.ftc.teamcode.New.Operators.OP2;
import org.firstinspires.ftc.teamcode.New.Primitives.dot;
import org.firstinspires.ftc.teamcode.New.heart;

public class TeleOpBlue extends OpMode {
    OP1 Michelle;
    OP2 Ray;
    heart heart;
    public void init(){
        Michelle = new OP1(this);
        Ray = new OP2(this);
        heart = new heart(Aliance.BLUE, Autonomius.TeleOp, new dot(0, 0));
        heart.init();
    }
    public void init_loop(){}
    public void start(){}
    public void loop(){
        heart.loop();
    }
    public void stop(){}
}

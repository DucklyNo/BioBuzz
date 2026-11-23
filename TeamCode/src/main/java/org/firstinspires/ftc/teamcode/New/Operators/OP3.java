package org.firstinspires.ftc.teamcode.New.Operators;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import ai.onnxruntime.*;

import java.io.InputStream;
import java.nio.FloatBuffer;
import java.util.Map;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.New.Behaviour;
import org.firstinspires.ftc.teamcode.New.Operators.Joystick.Joystick2;

public class OP3 implements Player {
    private static final String Model = "model.onnx";
    private static final String input = "input";
    private static final long[] shape = {1, 4};
    private static final int size = 4;
    private OrtEnvironment env;
    private OrtProvider session;
    private final float[] inArray = new float[size];

    public OP3(OpMode op) {
        this.op = op;


    }

    public OpMode op;

    public void init() {
        try{
            initNeyro();
        }
    }

    public void functional() {
    }

    public void interruptJoystick() {
    }

    private void initNeyro() throws Exception {
        env = OrtEnvironment.getEnvironment();
        OrtSession.SessionOptions options = new OrtSession.SessionOptions();
        options.setOptimizationLevel(OrtSession.SessionOptions.OptLevel.ALL_OPT);
        options.setIntraOpNumThreads(2);
        try (InputStream is = hardwareMap.appContext.getAssets().open(Model)){
            byte[] modelBytes = readAllBytes(is);

        }
    }
}
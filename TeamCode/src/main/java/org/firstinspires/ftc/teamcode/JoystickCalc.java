package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class JoystickCalc
{
    private OpMode opmode;

    double leftStickY;
    double leftStickX;
    double rightStickX;
    double rightStickY;
    boolean xButton;
    boolean yButton;
    boolean aButton;
    boolean bButton;

    public JoystickCalc(OpMode opmode)
    {
        this.opmode = opmode;
    }

    public void calculate ()
    {
//This is a test comment with GPG signature again again
        leftStickY = (opmode.gamepad1.left_stick_y * -1 );
        leftStickX = opmode.gamepad1.left_stick_x;
        rightStickX = opmode.gamepad1.right_stick_x;
        rightStickY = (opmode.gamepad1.right_stick_y * -1 );
        xButton = opmode.gamepad1.x;
        yButton = opmode.gamepad1.y;
        bButton = opmode.gamepad1.b;
        aButton = opmode.gamepad1.a;
    }
}
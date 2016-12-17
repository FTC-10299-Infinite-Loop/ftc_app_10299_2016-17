package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Bot
{
    public DcMotor lfMotor = null;
    public DcMotor rfMotor = null;
    public DcMotor lbMotor = null;
    public DcMotor rbMotor = null;

    public DcMotor winchMotor = null;
    public DcMotor collectMotor = null;

    //TODO: Figure out what direction we actually need the motors going in!
    private DcMotor.Direction lfDirection = DcMotor.Direction.REVERSE;
    private DcMotor.Direction rfDirection = DcMotor.Direction.FORWARD;
    private DcMotor.Direction lbDirection = DcMotor.Direction.REVERSE;
    private DcMotor.Direction rbDirection = DcMotor.Direction.FORWARD;
    private DcMotor.Direction winchDirection = DcMotor.Direction.FORWARD;
    private DcMotor.Direction collectDirection = DcMotor.Direction.FORWARD;

    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    public Bot(){

    }

    public void setLeftPower(double power)
    {
        lfMotor.setPower(power);
        lbMotor.setPower(power);
    }

    public void setRightPower(double power)
    {
        rfMotor.setPower(power);
        rbMotor.setPower(power);
    }

    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        lfMotor = hwMap.dcMotor.get("lf_motor");
        rfMotor = hwMap.dcMotor.get("rf_motor");
        lbMotor = hwMap.dcMotor.get("lb_motor");
        rbMotor = hwMap.dcMotor.get("rb_motor");

        winchMotor = hwMap.dcMotor.get("winchMotor");
        collectMotor = hwMap.dcMotor.get("collectMotor");

        lfMotor.setDirection(lfDirection);
        rfMotor.setDirection(rfDirection);
        lbMotor.setDirection(lbDirection);
        rbMotor.setDirection(rbDirection);
        winchMotor.setDirection(winchDirection);
        collectMotor.setDirection(collectDirection);

        // Set all motors to zero power
        lfMotor.setPower(0);
        rfMotor.setPower(0);
        lbMotor.setPower(0);
        rbMotor.setPower(0);
        winchMotor.setPower(0);
        collectMotor.setPower(0);

        // Set all motors to run without encoders.
        lfMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rfMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        lbMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rbMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        winchMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        collectMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }



}


package org.firstinspires.ftc.teamcode.V1.Opmodes.Tests.OpModes.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import org.firstinspires.ftc.teamcode.Mecanum_2.Base;
import org.firstinspires.ftc.teamcode.Utils.Point;
import java.util.ArrayList;
import java.util.Arrays;

@Autonomous(name = "RGB_ColorThresh", group = "Tests")
public class RGB_ColorThresh {

    @Override
    public void runOpMode() throws InterruptedException {
        Camera camera = new Camera(hardwareMap);
        sleep(1000);
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        String color = camera.getSignalColor();

        while (opModeIsActive()) {
            // Display Values
            telemetry.addData("Signal Color:", color);
            telemetry.update();
        }
    }
}
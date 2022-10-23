
package frc.robot;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.XboxController;

/**
 * New basic drive code bases, can be called in Robot.java:
 * @apiNote import frc.robot.newDrive.*
 * @author Mac Lawson and Zachary Popik
 * @version Pre-season Beta
 */
public class TankDrive {
    /**
     * Basic Tank Drive
     * @param LdriveMotor1
     * @param LdriveMotor2
     * @param LdriveMotor3
     * @param controller
     * @author Mac Lawson and Zachary Popik
     */
    public static void tank(CANSparkMax LdriveMotor1, CANSparkMax LdriveMotor2,CANSparkMax LdriveMotor3,
    CANSparkMax RdriveMotor1, CANSparkMax RdriveMotor2, CANSparkMax RdriveMotor3, XboxController controller) {
        //performs configuration of motors for driving 
        LdriveMotor1.restoreFactoryDefaults();
        LdriveMotor2.restoreFactoryDefaults();
        LdriveMotor3.restoreFactoryDefaults();
        LdriveMotor1.setOpenLoopRampRate(1.0);
        LdriveMotor2.setOpenLoopRampRate(1.0);
        LdriveMotor3.setOpenLoopRampRate(1.0);
        RdriveMotor1.restoreFactoryDefaults();
        RdriveMotor2.restoreFactoryDefaults();
        RdriveMotor3.restoreFactoryDefaults();
        RdriveMotor1.setOpenLoopRampRate(1.0);
        RdriveMotor2.setOpenLoopRampRate(1.0);
        RdriveMotor3.setOpenLoopRampRate(1.0);


        // gets x and y values from both controlelrs
        double joystickY  = controller.getLeftY();
        double joystickX  = controller.getLeftY();


        //sets the forward and backword movement of the motors
        if (joystickY >1) {
            LdriveMotor1.set((joystickY / 1.5));
            LdriveMotor2.set((joystickY / 1.5));
            LdriveMotor3.set((joystickY / 1.5));
        }
        if (joystickY <-1) {
            LdriveMotor1.set((joystickY / -1.5));
            LdriveMotor2.set((joystickY / -1.5));
            LdriveMotor3.set((joystickY / -1.5));
        }

        if (joystickX >1) {
            RdriveMotor1.set((joystickY / 1.5));
            RdriveMotor2.set((joystickY / 1.5));
            RdriveMotor3.set((joystickY / 1.5));
        }

        if (joystickX <-1) {
            RdriveMotor1.set((joystickY / -1.5));
            RdriveMotor2.set((joystickY / -1.5));
            RdriveMotor3.set((joystickY / -1.5));
        }

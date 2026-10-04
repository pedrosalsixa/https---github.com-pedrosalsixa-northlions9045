// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.Drivetrain;



/**
 * The methods in this class are called automatically corresponding to each mode, as described in
 * the TimedRobot documentation. If you change the name of this class or the package after creating
 * this project, you must also update the Main.java file in the project.
 */
public class Robot extends TimedRobot{
  private final Drivetrain m_drivetrain = new Drivetrain();
  private final XboxController m_controller = new XboxController(0);

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    double velocidade = m_controller.getLeftY();
    double giro = m_controller.getRightX();
    double multiplicador;
    if (m_controller.getRightTriggerAxis() > 0.7) {
      multiplicador = 1;
    }
    else {
      multiplicador = 0.7;
    }
    if (Math.abs(velocidade) < 0.05) {
      velocidade = 0;
    }
    if (Math.abs(giro) < 0.05) {
      giro = 0;
    }
    velocidade = velocidade * multiplicador;
    giro = giro * multiplicador;
    m_drivetrain.arcadeDrive(velocidade, giro);

    }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}

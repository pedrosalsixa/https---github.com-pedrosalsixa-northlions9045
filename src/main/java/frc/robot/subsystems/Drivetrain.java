package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Drivetrain extends SubsystemBase{
    private final WPI_VictorSPX m_leftMotor1 = new WPI_VictorSPX(1);
    private final WPI_VictorSPX m_leftMotor2 = new WPI_VictorSPX(2);
    private final WPI_VictorSPX m_rightMotor1 = new WPI_VictorSPX(3);
    private final WPI_VictorSPX m_rightMotor2 = new WPI_VictorSPX(4);
    private final DifferentialDrive m_drive = new DifferentialDrive(
        (velocidade) -> {m_leftMotor1.set(velocidade); m_leftMotor2.set(velocidade);},
        (velocidade) -> {m_rightMotor1.set(velocidade); m_rightMotor2.set(velocidade);}
    );

   public void arcadeDrive(double velocidade, double giro) {
        m_drive.arcadeDrive(velocidade, giro);
    }


    
}

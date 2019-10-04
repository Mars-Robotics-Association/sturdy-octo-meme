package org.firstinspires.ftc.teamcode;

/*
Parent class for all attachments.
 */

public interface Attachment
{
    public void Init();
    public void Loop();
    public void Run();
    public void Stop();
    public void ArmForward();
    public void ArmBackward();
    public void ArmStops();
}

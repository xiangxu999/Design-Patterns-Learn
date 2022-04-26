package design.adapter_pattern;

/**
 * Description 警车适配器
 * Date 2022/4/26 16:28
 * Version 1.0.1
 *
 * @author Wen
 */
public class PoliceCarAdapter extends CarController{

    private final PoliceSound policeSound;

    private final PoliceLamp policeLamp;

    public PoliceCarAdapter() {
        policeSound = new PoliceSound();

        policeLamp = new PoliceLamp();
    }

    @Override
    public void phonate() {
        policeSound.alarmSound();
    }

    @Override
    public void twinkle() {
        policeLamp.alarmLamp();
    }
}

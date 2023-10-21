package SoftEng1_LabAss6_adapterPattern;

public class SmartphoneAdapter implements PowerOutlet
{
    private SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter (SmartphoneCharger smartphoneCharger)
    {
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public String plugIn()
    {
        return smartphoneCharger.chargePhone();
    }
}

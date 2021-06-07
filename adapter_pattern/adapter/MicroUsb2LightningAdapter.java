package adapter_pattern.adapter;

import adapter_pattern.LightningPhone;
import adapter_pattern.MicroUsbPhone;

public class MicroUsb2LightningAdapter implements LightningPhone {
    private MicroUsbPhone microUsbPhone;

    public MicroUsb2LightningAdapter(MicroUsbPhone microUsbPhone) {
        this.microUsbPhone = microUsbPhone;
    }
    @Override
    public void recharge() {
        microUsbPhone.recharge();
    }

    @Override
    public void useLightning() {
        System.out.println("Lightning connected !");
        microUsbPhone.useMicroUsb();
    }
    
}
